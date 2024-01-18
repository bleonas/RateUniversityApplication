package LogicLayer;

import Resources.Course;
import Resources.Feedback;
import Resources.Student;

import java.util.List;

public interface ProcessData {
    int authenticateUser(Student student);
    boolean isRegistered(Student student);
    void registerStudent(Student student);
    Student getStudent(String email);
    List<Course> getAvailableCoursesForStudent(Student student);
    void joinCourse(Student student, Course course);
    void dropCourse(Student student, Course course);
    List<Feedback> getFeedbacksForCourse(String courseName);
}
