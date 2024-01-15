package Resources;

import java.sql.Time;
import java.util.List;

public class Course {
    private String courseName;
    private String lecturer;
    private int numberOfStudents;
    private Time startingHour;
    private Time finishHour;

    private String dayOftheWeek;

    private int semester;

    private List feedbacks;
    private double averageRating;
    private int lectureHall;

    public Course (String course_name, String lecturer, int numberOfStudents, Time startingHour,Time finishHour,
                   String dayOftheWeek, int semester, double averageRating, int lectureHall){
        courseName = course_name;
        this.lecturer = lecturer;
        this.numberOfStudents = numberOfStudents;
        this. startingHour = startingHour;
        this.finishHour= finishHour;
        this.dayOftheWeek = dayOftheWeek;
        this.semester=semester;
        this.averageRating = averageRating;
        this.lectureHall = lectureHall;
    }
    public String toString(){
        return courseName + " is taught by "+lecturer+".\n"+numberOfStudents+
                " students have already enrolled in this course.\n"+"Schedule:" +" Every "+ dayOftheWeek+" from "+
                startingHour+" to "+finishHour+".\n"+"Semester: "+semester+"\n"+"Rating: "+averageRating+"\n"+"Lecture hall:"+ lectureHall;
    }

    public String getCourseName(){
        return courseName;
    }

    public String getLecturer(){
        return lecturer;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public int getLectureHall() {
        return lectureHall;
    }

    public Time getStartingHour() {
        return startingHour;
    }

    public Time getFinishHour() {
        return finishHour;
    }

    public String getDayOftheWeek(){ return dayOftheWeek; }
    public int getSemester(){
        return semester;
    }

    public double getRating(){ return averageRating; }
}
