/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Parth
 */
public class TestClass {
   
    
    
    
    public static void main(String h[])
    {

        University university1= new University();
        university1.setUniversityName("NEU");
        university1.setUniversityLocation("boston");

        University university2= new University();
        university2.setUniversityName("MIT");
        university2.setUniversityLocation("Cambridge");
        
        City city=new City();
city.addUniversity(university1);
city.addUniversity(university2);

System.out.println(city.universityList.get(1).getUniversityName());
     try{   
 File fXmlFile = new File("D:\\NEU\\AED\\Code_AED\\Project\\university-management-system\\AED_project\\resources\\lib_usage_data_new.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = (Document) dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());    
     }
     catch(Exception e)
     {}

    }
    
}
