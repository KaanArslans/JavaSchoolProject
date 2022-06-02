
import java.util.ArrayList;
import java.util.HashSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kaanarslan
 */
public class Student extends Staff {
    private double Overall_grade=0.0;
    private double midterm1;
    private double finalGrde;
    private double fee;
    private static int nostudents=0;
    public Student(double midterm1, double finalGrde, double fee, String name, int id, String address, String contact, HashSet<Course> c) {
        super(name, id, address, contact, c);
        
        this.midterm1 = midterm1;
        this.finalGrde = finalGrde;
        this.fee = fee;
        nostudents++;
    }

    public void setOverall_grade(double Overall_grade) {
        this.Overall_grade = Overall_grade;
    }

   
   
    

    public double getFee() {
        return fee;
    }

    public double getOverall_grade() {
        return Overall_grade;
    }

    

    @Override
    public String toString() {
        String out=super.toString();
        return out+"Student{" + "Overall_grade" + this.Overall_grade + ", midterm1=" + midterm1 + ", finalGrde=" + finalGrde + ", fee=" + fee + '}' +"Number of students"+nostudents+"\n";
    }

    
    
    public double calculateCgpa(){
        this.Overall_grade=(this.midterm1*0.25+this.finalGrde*0.75);
        return this.Overall_grade;
    }

  
    
}
