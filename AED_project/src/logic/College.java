/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import business.person.Student;
import java.util.ArrayList;

/**
 *
 * @author Parth
 */
public class College {
    String collegeName;
    String campusLocation;
    
    ArrayList<Department> departmentList;
    ArrayList<Student> studentList;
    
    public College()
    {
    this.departmentList=new ArrayList<>();
    this.studentList=new ArrayList<>();
    }
    
    
    
    
}
