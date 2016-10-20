/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.ArrayList;

/**
 *
 * @author Parth
 */
public class City {
 
    String cityName="Boston";
    int zipCode=9090;
    ArrayList<University> universityList;

public City()
{
this.universityList=new ArrayList<>();


}
    
    //aviral put more attributes here
        
    
        public University addUniversity(University university) {

//        University university = new University();
        universityList.add(university);
        return university;
    }

        

    
}
