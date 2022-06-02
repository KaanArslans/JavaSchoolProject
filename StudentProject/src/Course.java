/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kaanarslan
 */
public class Course {
    private String courseName;
    private String InstructorName;

    public Course(String courseName, String InstructorName) {
        this.courseName = courseName;
        this.InstructorName = InstructorName;
    }

    @Override
    public String toString() {
        return "Course{" + "courseName=" + courseName + ", InstructorName=" + InstructorName + '}';
    }

    public String getCourseName() {
        return courseName;
    }
    

    
    
    

    public String getInstructorName() {
        return InstructorName;
    }
    
    
    
}
