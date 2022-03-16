/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *The Employee class is used to keep track of an employee's full name,
 * phone number, and salary, with an option to give them a raise. 
 * @author cderh
 */
public class Employee {

    private String firstName;
    private String lastName;
    private String phone;
    float salary;

    public Employee() {

    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    //methods for assigning a salary, and giving a raise
    
    public float getSalary(){
        return salary;
    }
    
    public float setSalary(float salary){
        this.salary = salary;
        return salary;
    }
    
    public void giveRaise(int percentage){
        salary = salary + (salary * percentage);
    }

    /**
     *
     * @param firstName
     * @param lastName
     * @param phone
     * @param salary
     */
    public Employee(String firstName, String lastName, String phone, float salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.salary = 0.0f;

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(phone);
        System.out.println(salary);

    }

    @Override
    public String toString() {
        return "Full name: " + firstName+" "+ lastName + ", Phone: " + phone + ", Salary:" + salary;

    }

    public static void main(String[] args) {
        Employee me;//new object
        me = new Employee();
        
        //setter methods
        me.setFirstName("Conor");
        me.setLastName("Derhammer");
        me.setPhone("123245");
        me.setSalary(100.5f);
        me.giveRaise(10);

        
        //getter methods
        System.out.println(me.getFirstName());
        System.out.println(me.getLastName());
        System.out.println(me.getPhone());
        System.out.println(me.getSalary());
        
        //toString() method
        System.out.println(me.toString());
    }
}
