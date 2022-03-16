package lab5;

import java.util.ArrayList;

public class Banner {

    private static ArrayList<Student> students;
    private static ArrayList<Course> courses;

    public static ArrayList<Student> getStudents() {
        return students;
    }

    public static void setStudents(ArrayList<Student> students) {
        Banner.students = students;
    }

    public static ArrayList<Course> getCourses() {
        return courses;
    }

    public static void setCourses(ArrayList<Course> courses) {
        Banner.courses = courses;
    }

    public static boolean checkPreReqs(Student s, Course c) {
        if (c.equals(c) == true) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean canAdd(Student s, Course c) {
        if (c.getCapacity() == c.getEnrolledStudents().size()) {
            return false;
        }
        if (s.getCoursesTaking().contains(c)) {
            return false;
        }
        for (int i = 0; i < c.getPreReqs().size(); i++) {
            if (!s.getCoursesCompleted().contains(c.getPreReqs().get(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean add(Student s, Course c) {
        if (canAdd(s, c)) {

            ArrayList newCourses = s.getCoursesTaking();
            newCourses.add(c);
            s.setCoursesTaking(newCourses);
            ArrayList newStudents = c.getEnrolledStudents();
            newStudents.add(s);
            c.setEnrolledStudents(newStudents);
            return true;
        }
        return false;

    }

    public static boolean drop(Student s, Course c) {
        ArrayList newCourses = s.getCoursesTaking();
        newCourses.remove(c);
        s.setCoursesTaking(newCourses);
        ArrayList newStudents = c.getEnrolledStudents();
        newStudents.remove(s);
        c.setEnrolledStudents(newStudents);
        return true;
    }

    public static boolean addToWaitList(Student s, Course c) {
        if (canAdd(s, c)) {
            if (c.getCapacity() != c.getEnrolledStudents().size()) {

                ArrayList newCourses = s.getCoursesTaking();
                newCourses.add(c);
                s.setCoursesTaking(newCourses);
                ArrayList waitlistStudents = c.getWaitlistStudents();
                waitlistStudents.add(s);
                c.setEnrolledStudents(waitlistStudents);
                return true;
            }
        }
        return false;
    }

}
