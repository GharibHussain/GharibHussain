package com.company;

/** The Lab Class represents an AP lab.
 * It holds the properties and functionality of a lab.
 * @author Gharib Hussain Amiri
 * @version 0.0
 */
public class Lab {
    private Student[] students;
    private String day;
    private int capacity;
    private int currentSize;
    private double avg;

/** Creats a new lab with its capacity and the day it is held.
 * @param cap capacity of the lab
 * @param d the representation day of the lab
 */
    public Lab(int cap, String d){
        this.capacity = cap;
        students = new Student[cap];
        this.day = d;
    }

    /**
     * sets the day
     * @param day
     */
    public void setDay(String day){
        this.day = day;
    }

    /** gets the day
     * @return day
     */
    public String getDay(){
        return day;
    }

    /**
     * sets the id of a student
     * @param day
     */
    public void setId(String day){
        this.day = day;
    }

    /**
     * gets the id
     * @return id
     */
    public String getId(){
        return day;
    }

    /**
     * sets the capacity of the lab
     * @param capacity
     */
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    /**
     * gets the capacity
     * @return capacity the capacity of the lab
     */
    public int getCapacity(){
        return capacity;
    }

    /**
     * gets the students of the lab
     * @return students the properties of an enrolled student
     */
    public Student[] getStudents(){
        return students;
    }

    /**
     * sets the students of a lab
     * @param std
     */
    public void setStudents(Student std){
        this.students[currentSize] = std;
    }

    /**
     * gets the average of the students' grades in a lab
     * @return average
     */
    public double getAvg(){
        return avg;
    }

    /**
     * sets the average of the students' grades in a lab
     * @param avg
     */
    public void setAvg(double avg){
        this.avg = avg;
    }

    /**
     * enrolls a student into the lab
     * @param std holds the properties of a student who is gonna be enrolled
     * if the capacity is not full yet, it enrolls a new student
     */
    public void enrollStudent(Student std){
        if (currentSize < capacity){
            students[currentSize] = std;
            currentSize++;
        } else {
            System.out.println("Lab is full!!!");
        }
    }


    /**
     * prints the properties of all students and the average of the lab
     */
    public void print(){
        for (int i = 0; i < currentSize; i++){
            System.out.println("std fname: " + students[i].getFirstName()
            + "         std id: " + students[i].getId()
            + "         std grade: " + students[i].getGrade());
        }
        calculateAvg();
        System.out.println("Lab AVG: " + getAvg());
    }


    /**
     * calculates the average grade in a lab
     */
    public void calculateAvg(){
        int sum = 0;
        for (int i = 0; i < currentSize; i++){
            sum = sum + students[i].grade;
        }
        double average = sum / currentSize;
        setAvg(average);
    }
}


