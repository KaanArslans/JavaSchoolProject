/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kaanarslan
 */
import java.util.*;
public abstract class Staff implements Staff_interface {
 protected String name;
 protected int id;
 protected String address;
 protected String contact;
 

 protected HashSet<Course> courses=new HashSet();

    public Staff(String name, int id, String address, String contact,HashSet<Course> c) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.contact = contact;
        courses=c;
        
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        String p="";
        for(Course c:courses){
            p+=c.toString();
        }
        return "Staff{" + "name=" + name + ", id=" + id + ", address=" + address + ", contact=" + contact + ", courses=" + p + '}';
    }
    public  abstract double calculateCgpa();
    
     
    
    
    
}
