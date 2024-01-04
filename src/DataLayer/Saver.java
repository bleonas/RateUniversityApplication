package DataLayer;

import Resources.Course;
import Resources.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Timer;
import java.util.TimerTask;

public class Saver implements DataSaver {

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

    public void addStudent(Student student){

        String addStudent ="INSERT INTO students(fullName,email,student_password,no_of_courses) " +
                "VALUES('"+student.getfullName()+"','"+
                student.getEmail()+"','"+ student.getPassword()+"',"+student.getCoursesJoined().size()+");";

        try {
            Connection connection = setConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(addStudent);
            preparedStatement.execute();

            connection.close();
        }

        catch(SQLException registerStudentFailure){
            registerStudentFailure.printStackTrace();
        }
    }

    public void addCourseForStudent(Course course, Student student){

        String findStudent = "SELECT student_id FROM students WHERE email ='"+student.getEmail()+"'";
        String addCourseForStudent ="INSERT INTO registrations(course_name,student_id)" +
                "VALUES('"+course.getCourseName()+"',("+findStudent+"));";

        try{
            Connection connection = setConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(addCourseForStudent);
            preparedStatement.execute();
            String addParticipant = "UPDATE courses SET no_of_students=no_of_students+1 WHERE course_name='"+course.getCourseName()+"';";
            preparedStatement= connection.prepareStatement(addParticipant);
            preparedStatement.execute();
            String incrementCourseNumber = "UPDATE students SET no_of_courses=no_of_courses+1 WHERE email ='"+student.getEmail()+"';";
            preparedStatement= connection.prepareStatement(incrementCourseNumber);
            preparedStatement.execute();
            connection.close();
        }

        catch(SQLException registerCourseFailure){
            registerCourseFailure.printStackTrace();

        }
    }


    public void dropCourseForStudent(Course course, Student student){

        String findStudent = "SELECT student_id FROM students WHERE email ='"+student.getEmail()+"'";
        String dropCourseForStudent ="DELETE FROM registrations WHERE student_id=(" + findStudent+");";

        try{
            Connection connection = setConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(dropCourseForStudent);
            preparedStatement.execute();
            String removeParticipant = "UPDATE courses SET no_of_students=no_of_students-1 WHERE course_name='"+
                    course.getCourseName()+"';";
            preparedStatement= connection.prepareStatement(removeParticipant);
            preparedStatement.execute();
            String decrementCourseNumber = "UPDATE students SET no_of_courses=no_of_courses+1 WHERE email ='"+student.getEmail()+"';";
            preparedStatement= connection.prepareStatement(decrementCourseNumber);
            preparedStatement.execute();

            connection.close();
        }

        catch(SQLException registerCourseFailure){
            registerCourseFailure.printStackTrace();

        }

    }



    private void removeOldFeedbacks(){

        TimerTask repeatEvery24Hours = new RemoveOldFeedbacks();
        Timer timer = new Timer();
        timer.schedule(repeatEvery24Hours,60000,24*60*60*1000);
    }

    class  RemoveOldFeedbacks extends TimerTask{
        public void run(){
            String deleteFeedback = " DELETE FROM feedbacks WHERE YEAR(feedback_date) = YEAR(NOW())-1 " +
                    "AND MONTH(feedback_date)=MONTH(NOW()) AND DAY(feedback_date) = DAY(NOW());";

            try{
                Connection connection = setConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(deleteFeedback);
                preparedStatement.execute();
                connection.close();
            }

            catch(SQLException registerCourseFailure){
                registerCourseFailure.printStackTrace();

            }

        }

    }
}
