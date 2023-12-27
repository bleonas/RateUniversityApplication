package Resources;

public class Feedback {
    private  String description;
    private double rating;

    private String courseName;

    public double getRating() {
        return rating;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getDescription() {
        return description;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String toString(){
        return courseName+" "+rating+" "+description;
    }
}
