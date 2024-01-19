package Resources;

import java.util.ArrayList;

public class Student {
    private String fullName;
    private String email;
    private String password;
    private ArrayList<Course> coursesJoined;

    public Student(String fullName,String email,String password){
        this.fullName = fullName;
        this.email=email;
        this.password=password;
        coursesJoined=new ArrayList();

    }

    public Student(String email, String password){
        this.email=email;
        this.password=password;
    }

    public String getEmail() {
        return email;
    }

    public String getfullName() {
        return fullName;
    }
    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password=password;
    }

    public ArrayList<Course> getCoursesJoined() {
        return coursesJoined;
    }

    public void setCoursesJoined(ArrayList<Course> coursesJoined){
        this.coursesJoined=coursesJoined;
    }
}
