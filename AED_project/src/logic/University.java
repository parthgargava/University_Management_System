/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import business.facilities.Facilities;
import business.person.Person;
import java.util.ArrayList;

/**
 *
 * @author Parth
 */
public class University {
    
    private String universityName;
    private String universityLocation;
    //aviral add 3 more attributes and make getter only. and nothing of the array list
private ArrayList<College> collegeList;    
    private ArrayList<Facilities> facilitiesList;
    private ArrayList<Person> personList;

    
    public University()
{
this.collegeList=new ArrayList<>();
this.facilitiesList=new ArrayList<>();
this.personList=new ArrayList<>();

}

// Is it required praneeth if we are using xml?    
public College addCollege(College college) {

  //      College college= new College();
        collegeList.add(college);
        return college;
    }

public Facilities addFacilities(Facilities facilities) {

//      Facilities facilities= new Facilities();
        facilitiesList.add(facilities);
        return facilities;
    }


public Person addPerson(Person person) {

//        Person person= new Person();
        personList.add(person);
        return person;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityLocation() {
        return universityLocation;
    }

    public void setUniversityLocation(String universityLocation) {
        this.universityLocation = universityLocation;
    }

    public ArrayList<College> getCollegeList() {
        return collegeList;
    }

    public void setCollegeList(ArrayList<College> collegeList) {
        this.collegeList = collegeList;
    }

    public ArrayList<Facilities> getFacilitiesList() {
        return facilitiesList;
    }

    public void setFacilitiesList(ArrayList<Facilities> facilitiesList) {
        this.facilitiesList = facilitiesList;
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }




}
