package DataLayer;

import Resources.Course;
import Resources.Feedback;
import Resources.Student;

import java.util.List;

public interface DataReader {
    List<Feedback> getFeedbacksForCourse(Course course);
    List<Course> getAllCourses();
    boolean searchForStudent(Student student);
    List<Course> getCoursesForStudent(Student student);
    Student getStudent(String email);
}
