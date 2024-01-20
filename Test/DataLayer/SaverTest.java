package DataLayer;

import Resources.Course;
import Resources.Student;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SaverTest {

    private static Saver saver;
    private static Student student;
    private static Course course;

    @BeforeAll
    static void setUp() {
        saver = new Saver();
        createTestTables();
        createTestObjects();
    }

    @AfterAll
    static void tearDown() {
        dropTestTables();
    }

    @Test
    void testAddStudent() {
        saver.addStudent(student);
        assertTrue(checkIfStudentExists(student.getEmail()));
    }

    @Test
    void testAddCourseForStudent() {
        saver.addStudent(student);
        saver.addCourseForStudent(course, student);
        assertTrue(checkIfStudentIsRegisteredForCourse(course, student));
        assertEquals(1, getNumberOfStudentsInCourse(course));
    }

    @Test
    void testDropCourseForStudent() {
        saver.addStudent(student);
        saver.addCourseForStudent(course, student);
        saver.dropCourseForStudent(course, student);
        assertFalse(checkIfStudentIsRegisteredForCourse(course, student));
        assertEquals(0, getNumberOfStudentsInCourse(course));
    }

    @Test
    void testRemoveOldFeedbacks() {
        int initialFeedbackCount = getFeedbackCount();
        saver.removeOldFeedbacks();
        int feedbackCountAfterRemoval = getFeedbackCount();
        assertTrue(feedbackCountAfterRemoval < initialFeedbackCount);
    }

    private static void createTestObjects() {
        student = new Student("John Doe", "john@example.com", "password");
        course = new Course("Math101", "LecturerName", 30, new Time(8, 0, 0), new Time(10, 0, 0),
                "Monday", 1, 0.0, 101);
    }

    private static void createTestTables() {
        DatabaseTestHelper.createTables();
    }

    private static void dropTestTables() {
        DatabaseTestHelper.dropTables();
    }

    private static boolean checkIfStudentExists(String email) {
        try (Connection connection = DriverManager.getConnection("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1", "sa", "")) {
            String checkStudent = "SELECT * FROM students WHERE email = '" + email + "'";
            try (Statement statement = connection.createStatement()) {
                return statement.executeQuery(checkStudent).next();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    private static boolean checkIfStudentIsRegisteredForCourse(Course course, Student student) {
        try (Connection connection = DriverManager.getConnection("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1", "sa", "")) {
            String findStudent = "SELECT student_id FROM students WHERE email = '" + student.getEmail() + "'";
            String checkCourseRegistration = "SELECT * FROM registrations WHERE course_name = '" + course.getCourseName() + "' AND student_id = (" + findStudent + ")";
            try (Statement statement = connection.createStatement()) {
                return statement.executeQuery(checkCourseRegistration).next();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    private static int getNumberOfStudentsInCourse(Course course) {
        try (Connection connection = DriverManager.getConnection("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1", "sa", "")) {
            String countStudents = "SELECT COUNT(*) FROM registrations WHERE course_name = '" + course.getCourseName() + "'";
            try (Statement statement = connection.createStatement()) {
                try (var resultSet = statement.executeQuery(countStudents)) {
                    resultSet.next();
                    return resultSet.getInt(1);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    private static int getFeedbackCount() {
        try (Connection connection = DriverManager.getConnection("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1", "sa", "")) {
            String countFeedbacks = "SELECT COUNT(*) FROM feedbacks";
            try (Statement statement = connection.createStatement()) {
                try (var resultSet = statement.executeQuery(countFeedbacks)) {
                    resultSet.next();
                    return resultSet.getInt(1);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    private static class DatabaseTestHelper {
        static void createTables() {
            try (Connection connection = DriverManager.getConnection("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1", "sa", "")) {
                Statement statement = connection.createStatement();

                statement.executeUpdate("CREATE TABLE IF NOT EXISTS students (student_id INT AUTO_INCREMENT PRIMARY KEY, fullName VARCHAR(255), email VARCHAR(255), student_password VARCHAR(255), no_of_courses INT);");
                statement.executeUpdate("CREATE TABLE IF NOT EXISTS registrations (registration_id INT AUTO_INCREMENT PRIMARY KEY, course_name VARCHAR(255), student_id INT, FOREIGN KEY (student_id) REFERENCES students(student_id));");
                statement.executeUpdate("CREATE TABLE IF NOT EXISTS courses (course_id INT AUTO_INCREMENT PRIMARY KEY, course_name VARCHAR(255), no_of_students INT);");
                statement.executeUpdate("CREATE TABLE IF NOT EXISTS feedbacks (feedback_id INT AUTO_INCREMENT PRIMARY KEY, feedback_date DATE);");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        static void dropTables() {
            try (Connection connection = DriverManager.getConnection("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1", "sa", "")) {
                Statement statement = connection.createStatement();

                statement.executeUpdate("DROP TABLE IF EXISTS registrations;");
                statement.executeUpdate("DROP TABLE IF EXISTS courses;");
                statement.executeUpdate("DROP TABLE IF EXISTS students;");
                statement.executeUpdate("DROP TABLE IF EXISTS feedbacks;");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
