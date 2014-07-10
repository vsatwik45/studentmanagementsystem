package studentmanagementsystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Client
 

{
public static void main(String args[ ]) throws IOException
{
    String name, address, course;
    int age, studentNum, semester;

    List<Student> studentsList = new ArrayList<Student>(); 
    for (int i = 0; i < 2; i++) 
    {

    int studentNumber = (i + 1);

  
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter Student "+ studentNumber + " Name:"); 
    name = in.readLine();

    System.out.println("Enter Student " + studentNumber + " Age:");
    age = Integer.valueOf(in.readLine());

    System.out.println("Enter Student " + studentNumber + " Address:");
    address = in.readLine();

    System.out.println("Enter Student " + studentNumber + "  Number:"); 
    studentNum = Integer.valueOf(in.readLine());

    System.out.println("Enter Student " + studentNumber + " Semester:");
    semester = Integer.valueOf(in.readLine());

    System.out.println("Enter Student " + studentNumber + " Course:");
    course = in.readLine();


    Masters master = new Masters(name, age, address, studentNum, studentNum);

    studentsList.add(master); // adding student
    }

    for (int j = 0; j < studentsList.size(); j++)
    {

        Masters mt = (Masters) studentsList.get(j);

        System.out.println("student list: " + (j + 1)); 
        System.out.println("");
        System.out.println("Name: " + mt.getName() + "Age: "+mt.getAge() + "Address: " + mt.getAddress() + "Student Number: " + mt.getStudentNum() + "Semester: " + mt.getSemester()); // print out results entered by user
        System.out.println("");
    }

}
}
