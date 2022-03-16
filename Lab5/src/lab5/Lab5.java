/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author cderh
 */
public class Lab5 {

    static Course c;
    static Student s;
    static Banner b;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numStudents = 72;

        Course k = new Course("ITSC ", "Introduction to Computer Science I ", 1212 , 72 , 4);
        Course m = new Course("ITSC ", "Introduction to Computer Science I ", 1213 , 4 , 72, 10, k.getPreReqs());

        for (int i = 0; i < numStudents; i++) {

            Student temp = new Student();

            Banner.add(temp, m);

        }
        System.out.println(m.toString());
    }

}
