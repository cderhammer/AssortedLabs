package lab5;


import java.util.ArrayList;


public class Course {
    
    private String dept;
    private String title;
    private int num;
    private int capacity;    
    private int waitlistCapacity;
    private int numCreditHours;    
    private ArrayList<Student> enrolledStudents;
    private ArrayList<Student> waitlistStudents;
    private ArrayList<Course> preReqs;

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getWaitlistCapacity() {
        return waitlistCapacity;
    }

    public void setWaitlistCapacity(int waitlistCapacity) {
        this.waitlistCapacity = waitlistCapacity;
    }

    public int getNumCreditHours() {
        return numCreditHours;
    }

    public void setNumCreditHours(int numCreditHours) {
        this.numCreditHours = numCreditHours;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public ArrayList<Student> getWaitlistStudents() {
        return waitlistStudents;
    }

    public void setWaitlistStudents(ArrayList<Student> waitlistStudents) {
        this.waitlistStudents = waitlistStudents;
    }

    public ArrayList<Course> getPreReqs() {
        return preReqs;
    }

    public void setPreReqs(ArrayList<Course> preReqs) {
        this.preReqs = preReqs;
    }

   public Course(){
       this.preReqs = new ArrayList<Course>();
       this.enrolledStudents = new ArrayList<Student>();
       this.waitlistStudents = new ArrayList<Student>();
   }
   
   public Course(String dept, String title, int num, int numCreditHours, int capacity){
       this.dept = dept;
       this.title = title;
       this.num = num;
       this.numCreditHours = numCreditHours;
       this.capacity = capacity;
       this.preReqs = new ArrayList<Course>();
       this.enrolledStudents = new ArrayList<Student>();
       this.waitlistStudents = new ArrayList<Student>();

   }
   
   public Course(String dept, String title, int num, int numCreditHours, int capacity, int waitlistCapacity, ArrayList<Course>preReqs){
       this.dept = dept;
       this.title = title;
       this.num = num;
       this.numCreditHours = numCreditHours;
       this.capacity = capacity;
       this.waitlistCapacity = waitlistCapacity;
       this.preReqs = preReqs;
       this.enrolledStudents = new ArrayList<Student>();
       this.waitlistStudents = new ArrayList<Student>();

   }
   
    /**
     *
     * @param a
     * @return
     */
    public boolean equals(Course a){
       if (num == a.getNum()){
           if(preReqs == a.getPreReqs()){
               return true;
           }
           return true;
       } else {
           return false;
       }
       
   }
   
    @Override
   public String toString(){
       return "Department: " + dept + "Title: " + title + "Credit hours: " +numCreditHours +"Capacity: "+capacity +"Waitlist capacity: "+waitlistCapacity+"Numer of Students: " + enrolledStudents.size() + "Waitlist capacity: " + waitlistStudents.size();
   }
    
    
}
