package DataLayer;

import Resources.Course;
import Resources.Student;

public interface DataSaver {
    void addStudent(Student student);
    void addCourseForStudent(Course course, Student student);
    void dropCourseForStudent(Course course, Student student);
}
