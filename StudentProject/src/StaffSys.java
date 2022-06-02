/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kaanarslan
 */
import java.util.*;
public class StaffSys {
    protected static ArrayList<Staff> Staffs=new ArrayList();
    public static boolean addStudent(double mt1,double finalgrade,double fee,String name,int id,String address,String Contact,HashSet<Course> c){
        
            
        
           
        
        for(Staff st:Staffs){
            if(st.getId()==id)
                return false;
        }
        Staff s=new Student(mt1,finalgrade,fee,name,id,address,Contact,c);
        Staffs.add(s);
        return true;
    }
    public static boolean addteacher(double wage,String instructortype,String name, int id,String address,String contact,HashSet<Course> c){
        
        for(Staff st:Staffs){
            if(st.getId()==id)
                return false;
        }
        Staff t=new Instructor(wage,instructortype,name,id,address,contact,c);
        Staffs.add(t);
        return true;
    }
    public static String displayStudents(){
        String out="";
        for(Staff s:Staffs){
            if(s instanceof Student){
            ((Student) s).calculateCgpa();
            out+=((Student)s).toString();
            }
               
        }
        
        return out;
    }
    public static String displayteacher(){
        String out="";
        for(Staff s:Staffs){
            if(s instanceof Instructor){
            
            out+=((Instructor)s).toString();
            }
               
        }
        
        return out;
    }
    
    public static Staff SearchStuff(int id){
        for(Staff s:Staffs){
            if(s.getId()==id)
                return s;
        }
        return null;
    }
    
     public  static Staff   DeleteStuff(int id){
        for(Staff s:Staffs){
            if(s.getId()==id){
                Staffs.remove(s);
                return s;
            }
        }
        return null;
    }

    
    
     
}
