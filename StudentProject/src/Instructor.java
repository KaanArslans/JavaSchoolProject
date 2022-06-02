
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
public class Instructor extends Staff {
    private double Wage;
    private String InstructorType;
    private static int noofInstructor=0;
    

    public Instructor(double Wage, String InstructorType, String name, int id, String address, String contact, HashSet<Course> c) {
        super(name, id, address, contact, c);
        this.Wage = Wage;
        this.InstructorType = InstructorType;
        noofInstructor++;
    }

    public double getWage() {
        return Wage;
    }

    public void setWage(double Wage) {
        this.Wage = Wage;
    }

    @Override
    public String toString() {
        String out=super.toString();
        return out+"Instructor{" + "Wage=" + Wage + ", InstructorType=" + InstructorType + '}';
    }

    @Override
    public double calculateCgpa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
