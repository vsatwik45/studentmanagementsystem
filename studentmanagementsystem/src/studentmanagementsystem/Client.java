package studentmanagementsystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;



public class Client
 

{
public static void main(String args[ ]) 
{
    String name, address, course;
    int age, studentNum, semester;

    ArrayList<Student> studentsList = new ArrayList<Student>(); 
   
//    Repository.getStudent(int byAge) ;
    PrintUtil.printMasters(studentsList);
    PrintUtil.printMasters(Repository.getStudent(25));
}
}
