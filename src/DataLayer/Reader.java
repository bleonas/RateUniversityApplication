package DataLayer;

import Resources.Course;
import Resources.Feedback;
import Resources.Student;

import java.sql.*;
import java.util.ArrayList;

public class Reader  implements DataReader {
    private static Connection setConnection(){
        final String URL = "jdbc:mysql://localhost:3306/csfacultydatabase";
        final String USER = "root";
        final String PASSWORD = "Cs@UnI2024!+";
        Connection connectionTodatabase = null;

        try{
            connectionTodatabase = DriverManager.getConnection(URL,USER,PASSWORD);
        }
        catch (SQLException failedConnection) {
            failedConnection.printStackTrace();
        }
        return connectionTodatabase;
    }


    //public ArrayList<Feedback> getFeedbacksForCourse(Course course){}
    public ArrayList<Course> getAllCourses(){

        Connection connection = setConnection();

        if(connection==null)
            return null;

        ArrayList<Course> allCourses = new ArrayList<>();

        String selectAllCourses ="SELECT*FROM courses";

        try(PreparedStatement preparedStatement = connection.prepareStatement(selectAllCourses);
            ResultSet resultSet = preparedStatement.executeQuery()) {
            while(resultSet.next()){
                Course course = new Course(
                        resultSet.getString("course_name"),
                        resultSet.getString("lecturer"),
                        resultSet.getInt("no_of_students"),
                        resultSet.getTime("starting_hour"),
                        resultSet.getTime("finish_hour"),
                        resultSet.getString("day_of_week"),
                        resultSet.getInt("semester"),
                        resultSet.getDouble("average_rating"),
                        resultSet.getInt("lecture_hall")
                );

                allCourses.add(course);
            }

            connection.close();

        }
        catch(SQLException retrievingCoursesFailure){
            retrievingCoursesFailure.printStackTrace();
        }

        return allCourses;
    }



    public boolean searchForStudent(Student student){

        String checkStudent ="SELECT*FROM students WHERE email=\""+student.getEmail()+"\"";
        boolean studentExistence=false;
        try {
            Connection connection = setConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(checkStudent);
            ResultSet resultSet = preparedStatement.executeQuery();
            studentExistence= resultSet.next();
            connection.close();
        }
        catch(SQLException checkStudentFailure){
            checkStudentFailure.printStackTrace();
        }
        return studentExistence;
    }


    public ArrayList<Feedback> getFeedbacksForCourse(Course course){
        String retrieveFeedbacks ="SELECT*FROM feedbacks WHERE course='"+course.getCourseName()+"';";
        ArrayList<Feedback> feedbacksForCourse = new ArrayList<>();

        try {
            Connection connection = setConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(retrieveFeedbacks);
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                Feedback feedback = new Feedback();
                feedback.setCourseName(resultSet.getString("course"));
                feedback.setDescription(resultSet.getString("course_description"));
                feedback.setRating(resultSet.getDouble("rating"));

                feedbacksForCourse.add(feedback);

            }
            connection.close();
        }
        catch(SQLException checkStudentFailure){
            checkStudentFailure.printStackTrace();
        }
        return feedbacksForCourse;
    }

    public ArrayList<Course> getCoursesForStudent(Student student){
        String studentId = "SELECT student_id FROM students WHERE email='"+student.getEmail()+"'";
        String findCourses = "SELECT course_name FROM registrations WHERE student_id=("+studentId+");";

        ArrayList<Course> registeredCoursesInfo = new ArrayList<>();

        try {
            Connection connection = setConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(findCourses);
            ResultSet resultSet = preparedStatement.executeQuery();
            ArrayList<String> registeredCourses = new ArrayList<>();

            while(resultSet.next()){
                registeredCourses.add(resultSet.getString("course_name"));
            }

            for(int i=0;i<registeredCourses.size();i++){
                String retrieveCourseInfo = "SELECT * FROM courses WHERE course_name='"+registeredCourses.get(i)+"';";
                preparedStatement = connection.prepareStatement(retrieveCourseInfo);
                resultSet=preparedStatement.executeQuery();
                while(resultSet.next()){
                    Course course = new Course(
                            resultSet.getString("course_name"),
                            resultSet.getString("lecturer"),
                            resultSet.getInt("no_of_students"),
                            resultSet.getTime("starting_hour"),
                            resultSet.getTime("finish_hour"),
                            resultSet.getString("day_of_week"),
                            resultSet.getInt("semester"),
                            resultSet.getDouble("average_rating"),
                            resultSet.getInt("lecture_hall")

                    );
                    registeredCoursesInfo.add(course);
                }
            }

            connection.close();
        }
        catch(SQLException checkStudentFailure){
            checkStudentFailure.printStackTrace();
        }
        return registeredCoursesInfo;
    }


    public Student getStudent(String email){
        String retrieveStudent = "SELECT*FROM students WHERE email='"+email+"';";
        Student student=null;
        try {
            Connection connection = setConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(retrieveStudent);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                student = new Student(
                        resultSet.getString("fullName"),
                        resultSet.getString("email"),
                        resultSet.getString("student_password")
                );
            }
        }
        catch(SQLException checkStudentFailure){
            checkStudentFailure.printStackTrace();
        }
        return student;
    }
}
