package DataLayer;
import static org.junit.jupiter.api.Assertions.*;
import Resources.Course;
import Resources.Feedback;
import Resources.Student;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
public class ReaderTest {

    private static Reader reader;

    @BeforeAll
    public static void setUp() {
        reader = new Reader();
    }

    @Test
    public void testGetAllCourses() {
        ArrayList<Course> allCourses = reader.getAllCourses();
        assertNotNull(allCourses);
        assertFalse(allCourses.isEmpty());
    }

    @Test
    public void testSearchForStudent() {
        Student existingStudent = new Student("Klajdi Kaciu", "klajdi@gmail.com", "gooJ123!");
        assertTrue(reader.searchForStudent(existingStudent));

        Student nonExistingStudent = new Student("henri", "henri@gmail.com", "password");
        assertFalse(reader.searchForStudent(nonExistingStudent));
    }

    @Test
    public void testGetFeedbacksForCourse() {
        String courseName = "Software Engineering";
        ArrayList<Feedback> feedbacks = reader.getFeedbacksForCourse(courseName);
        assertNotNull(feedbacks);
     
    }

    @Test
    public void testGetStudent() {
        String existingEmail = "klajdi@gmail.com";
        Student student = reader.getStudent(existingEmail);
        assertNotNull(student);
        assertEquals(existingEmail, student.getEmail());

        String nonExistingEmail = "henri@gmail.com";
        Student nonExistingStudent = reader.getStudent(nonExistingEmail);
        assertNull(nonExistingStudent);
    }

}
