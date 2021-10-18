package com.company;

/** The Student class represents a student in a student administration system.
 * It holds the student details relevant in our context.
 * @author Gharib Hussain Amiri
 * @version 0.0
 */
public class Student{
    // the student’s first name
    private String firstName;

    // the student’s last name
    private String lastName;

    // the student ID
    private String id;

    //the grade private
    int grade;


    /**
     * Creates a new student with a given name and ID number.
     * @param fName first name of student
     * @param lName last name of student
     * @param sID student ID
     */
    public Student(String fName, String lName, String sID){
        firstName = fName;
        lastName = lName;
        id = sID;
        grade = 0;
    }

    /**
     * gets the first name of student
     * @return firstName field
     */
    public String getFirstName() {
        return firstName;
    }

    public int getGrade(){
        return grade;
    }

    /**
     @param fName sets the first name of a student
     */
    public void setFirstName(String fName) {
        firstName = fName;
    }

    /**
     * @param sGrade sets the grade of a student
     */
    public void setGrade(int sGrade){
        grade = sGrade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        boolean ckeckLength = id.matches("[0-9]{7}");
        if (ckeckLength)
            this.id = id;
        else
            System.out.println("Invalid ID length!!!");
    }

    /**
     Print the student’s last name and ID number to the output terminal.
     */
    public void print() {
        System.out.println(lastName + ", student ID: " + id + ", grade: " + grade);
    }




}


