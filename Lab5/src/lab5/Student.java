package lab5;


import java.util.ArrayList;


public class Student {
    
    private int id;
    private String firstName;
    private String lastName;
    private ArrayList<Course> coursesCompleted;
    private ArrayList<Course> coursesTaking;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Course> getCoursesCompleted() {
        return coursesCompleted;
    }

    public void setCoursesCompleted(ArrayList<Course> coursesCompleted) {
        this.coursesCompleted = coursesCompleted;
    }

    public ArrayList<Course> getCoursesTaking() {
        return coursesTaking;
    }

    public void setCoursesTaking(ArrayList<Course> coursesTaking) {
        this.coursesTaking = coursesTaking;
    }

    public Student(int id, String firstName, String lastName, ArrayList<Course> coursesCompleted, ArrayList<Course> coursesTaking) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.coursesCompleted = coursesCompleted;
        this.coursesTaking = coursesTaking;
    }
    
    public Student(){
        this.coursesTaking = new ArrayList<Course>();
        this.coursesCompleted = new ArrayList<Course>();
    }
    
   
    
    public boolean isFullTime() {

        int sum = 0;

        for (int i = 0; i < coursesTaking.size(); i++) {
            Course x = coursesTaking.get(i);
            sum += x.getNumCreditHours();
        }
        if (sum >= 12) {
            return true;
        }
        return false;
    }
    
    public String getPrintableSchedule(){
        return toString();
    }
    
}
