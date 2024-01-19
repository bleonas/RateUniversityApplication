package LogicLayer;

import static org.junit.jupiter.api.Assertions.*;

import DataLayer.Reader;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

import Resources.Student;
import Resources.Course;
import DataLayer.DataReader;
import DataLayer.DataSaver;
import org.mindrot.jbcrypt.BCrypt;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;

 class UserAuthenticationTest {

     private static UserAuthentication auth;

     @BeforeAll
     public static void setUp() {
         auth = new UserAuthentication();
     }

    @Test
    void testUserAuthentication() {
        Student invalidEmailStudent = new Student("Bleona Sejdini", "bleonasejdini24gmail.com", "Password123*");
        assertEquals(100, auth.authenticateUser(invalidEmailStudent));

        Student invalidPasswordStudent = new Student("Bleona Sejdini", "bleonasejdini24@gmail.com", "weak");
        assertEquals(102, auth.authenticateUser(invalidPasswordStudent));

        Student validStudent = new Student("Bleona Sejdini", "bleonasejdini24@gmail.com", "Bleona123*");
        assertEquals(103, auth.authenticateUser(validStudent));
    }

    @Test
    void testIsRegistered() {
        Student registeredStudent = new Student("Bleona Sejdini", "bleonasejdini24@gmail.com", "Password123*");
        auth.checker = Mockito.mock(DataReader.class);
        when(auth.checker.searchForStudent(registeredStudent)).thenReturn(true);
        assertTrue(auth.isRegistered(registeredStudent));
    }

    @Test
    void testControlEmail() {
        assertTrue(auth.controlEmail("bleonasejdini24@gmail.com"));
        assertFalse(auth.controlEmail("bleonasejdini24gmail.com"));
    }

    @Test
    void testControlPassword() {
        assertTrue(auth.controlPassword("StrongPassword123!"));
        assertFalse(auth.controlPassword("weak"));
    }

    @Test
    void testRegisterStudent() {
        Student studentToRegister = new Student("Valsiana Sokollari", "valsiana.sokollari@fti.edu.al", "StrongPassword456!");
        auth.saver = Mockito.mock(DataSaver.class);
        auth.registerStudent(studentToRegister);
        verify(auth.saver, times(1)).addStudent(studentToRegister);
    }

    @Test
    void testGetStudent() {
        String email = "bleonasejdini24@gmail.com";
        auth.checker = Mockito.mock(DataReader.class);
        when(auth.checker.getStudent(email)).thenReturn(new Student("Bleona Sejdini", email, "Bleona123*"));
        Student result = auth.getStudent(email);
        assertNotNull(result);
        assertEquals(email, result.getEmail());
    }

    @Test
    void testPasswordHashing() {
        String initialPassword = "StrongPassword456!";
        String hashedPassword = auth.passwordHashing(initialPassword);
        assertTrue(BCrypt.checkpw(initialPassword, hashedPassword));
    }

    @Test
    void testPasswordMatch() {
        String hashedPassword = auth.passwordHashing("HashedPassword123!");
        Student student = new Student("Bleona Sejdini", "bleonasejdini24@gmail.com", hashedPassword);
        String enteredPassword = "HashedPassword123!";
        auth.checker = Mockito.mock(DataReader.class);
        when(auth.checker.getStudent(student.getEmail())).thenReturn(student);
        assertTrue(auth.passwordMatch(student, enteredPassword));
    }

     @Test
     void testGetAvailableCoursesForStudent() {
         Student student = new Student("Bleona Sejdini", "bleonasejdini24@gmail.com", "HashedPassword123*");

         Course softwareCourse = new Course("Software Engineering", "Ina Papadhopulli",10, new Time(8, 0, 0), new Time(11, 0, 0), "Monday", 1, 4.0, 201);
         Course networksCourse = new Course("Computer Networks", "Indrit Enesi",1, new Time(9, 0, 0), new Time(11, 0, 0), "Thursday", 1, 2.0, 205);

         ArrayList<Course> allCourses = new ArrayList<>(Arrays.asList(softwareCourse, networksCourse));
         auth.checker = Mockito.mock(DataReader.class);
         when(auth.checker.getAllCourses()).thenReturn(allCourses);

         student.getCoursesJoined().add(softwareCourse);

         ArrayList<Course> result = auth.getAvailableCoursesForStudent(student);

         assertEquals(1, result.size());
         assertEquals("Computer Networks", result.get(0).getCourseName());
     }

     @Test
     void testJoinCourse() {
         Student student = new Student("Bleona Sejdini", "bleonasejdini24@gmail.com", "HashedPassword123");
         Course softwareCourse = new Course("Software Engineering", "Ina Papadhopulli", 10, new Time(8, 0, 0), new Time(11, 0, 0), "Monday", 1, 4.0, 201);
         auth.joinCourse(student, softwareCourse);

         assertTrue(student.getCoursesJoined().contains(softwareCourse));
         verify(auth.saver, times(1)).addCourseForStudent(softwareCourse, student);
     }

     @Test
     void testDropCourse() {
         Student student = new Student("Bleona Sejdini", "bleonasejdini24@gmail.com", "HashedPassword123");
         Course softwareCourse = new Course("Software Engineering", "Ina Papadhopulli", 10, new Time(8, 0, 0), new Time(11, 0, 0), "Monday", 1, 4.0, 201);
         student.getCoursesJoined().add(softwareCourse);

         auth.saver = Mockito.mock(DataSaver.class);

         auth.dropCourse(student, softwareCourse);

         assertFalse(student.getCoursesJoined().contains(softwareCourse));
         verify(auth.saver, times(1)).dropCourseForStudent(softwareCourse, student);
     }

}
