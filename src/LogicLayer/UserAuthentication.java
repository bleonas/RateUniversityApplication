package LogicLayer;

import DataLayer.DataReader;
import DataLayer.DataSaver;
import DataLayer.Reader;
import DataLayer.Saver;
import Resources.Course;
import Resources.Feedback;
import Resources.Student;
import java.sql.Time;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.mindrot.jbcrypt.BCrypt;

public class UserAuthentication implements ProcessData {
    DataReader checker = new Reader();
    DataSaver saver = new Saver();
    public int authenticateUser(Student student) {
        if(!controlEmail(student.getEmail()))
            return 100;
        else if(!controlPassword(student.getPassword()))
            return 102;
        else
            return 103;
    }

    public boolean isRegistered(Student student){
        return  checker.searchForStudent(student);
    }

    boolean controlEmail(String email){
        Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher emailMatcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        return emailMatcher.matches();
    }

    boolean controlPassword(String password){
        String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
        Pattern passwordPattern = Pattern.compile(passwordRegex);
        Matcher passwordMatcher= passwordPattern.matcher(password);
        return passwordMatcher.matches();
    }

    public void registerStudent(Student student){
        student.setPassword(passwordHashing(student.getPassword()));
        saver.addStudent(student);
    }

    public Student getStudent(String email){
        return checker.getStudent(email);
    }

    public String passwordHashing(String initialPassword){
        String hashedPassword= BCrypt.hashpw(initialPassword, BCrypt.gensalt());;
        return hashedPassword;
    }

    public boolean passwordMatch(Student student, String enteredPassword) {
        String storedHashedPassword = checker.getStudent(student.getEmail()).getPassword();
        return BCrypt.checkpw(enteredPassword, storedHashedPassword);
    }

    public ArrayList<Course> getAvailableCoursesForStudent(Student student){

        ArrayList<Course> registeredCourses =student.getCoursesJoined();
        ArrayList<Course> allCourses = (ArrayList<Course>) checker.getAllCourses();
        ArrayList<Course> availableCourses= new ArrayList<>();
        for(int i=0;i<allCourses.size();i++){
            int j=0;
            for(;j<registeredCourses.size();j++){
                if(allCourses.get(i).getCourseName().equals(registeredCourses.get(j).getCourseName()))
                    break;
            }
            if(j==registeredCourses.size()){
                availableCourses.add(allCourses.get(i));
            }
        }

        return availableCourses;
    }

    public void joinCourse(Student student, Course course){
        student.getCoursesJoined().add(course);
        saver.addCourseForStudent(course,student);
    }
    public void dropCourse(Student student, Course course){
        student.getCoursesJoined().remove(course);
        saver.dropCourseForStudent(course,student);
    }
    public ArrayList<Feedback> getFeedbacksForCourse(String courseName){
        return (ArrayList<Feedback>) checker.getFeedbacksForCourse(courseName);
    }

    public String[][] getTimetable(){
        Time[] duration = {new Time(8,0,0),new Time(11,0,0),new Time(14,0,0)};
        String[] daysOfWeek = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
        String[][] scheduledCourses = new String[3][5];
        ArrayList<Course> courses = (ArrayList<Course>) checker.getAllCourses();
         for(int i=0;i<duration.length;i++){
             for(int j=0;j<daysOfWeek.length;j++){
                   for(Course course:courses){
                      if(course.getStartingHour().equals(duration[i])&&course.getDayOftheWeek().equals(daysOfWeek[j])){
                          scheduledCourses[i][j] = course.getCourseName();
                      }
                  }
             }
         }
           return scheduledCourses;
    }

}
