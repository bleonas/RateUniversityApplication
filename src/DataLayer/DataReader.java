package DataLayer;

import Resources.Course;
import Resources.Feedback;
import Resources.Student;

import java.util.List;

public interface DataReader {
    List<Feedback> getFeedbacksForCourse(String courseName);
    List<Course> getAllCourses();
    boolean searchForStudent(Student student);
    Student getStudent(String email);
}
