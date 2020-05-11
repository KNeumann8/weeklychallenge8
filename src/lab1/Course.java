package lab1;

public abstract class Course {

    private String courseNumber;
    private String courseName;
    private double credits;

    //Course Number
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    //Course Name

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    //Credits

    public void setCredits(double credits){ this.credits = credits; }

    public double getCredits() {
        return credits;
    }

}
