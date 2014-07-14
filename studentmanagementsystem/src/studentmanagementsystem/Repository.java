package studentmanagementsystem;


import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Repository  {

	String name, address, course;
    int age, studentNum, semester;
    
	ArrayList<Student> studentsList = new ArrayList<Student>() ;
	{
    for (int i = 0; i < 2; i++) 
    {

    int studentNumber = (i + 1);
  
    Scanner in = new Scanner(System.in); 

    System.out.println("Enter Student "+ studentNumber + " Name:"); 
    name = in.nextLine();

    System.out.println("Enter Student " + studentNumber + " Age:");
    age = in.nextInt();

    System.out.println("Enter Student " + studentNumber + " Address:");
    address = in.nextLine();

    System.out.println("Enter Student " + studentNumber + "  Number:"); 
    studentNum = in.nextInt();

    System.out.println("Enter Student " + studentNumber + " Semester:");
    semester = in.nextInt();

    System.out.println("Enter Student " + studentNumber + " Course:");
    course = in.nextLine();


    Masters master = new Masters(name, age, address, studentNum, studentNum);

    studentsList.add(master); // adding student
    }
	
	  
	 
	 public static Student getStudent(String byFirstName) {

	}
	
	public static Student getStudent(int byAge) {
		

	}
	
	public static Student getStudent(String byName, int byAge) {

	}
	
	public static Student getStudent(String byName, String byAddress, int byAge) {

	}

//	public static void insertStudent(Student stu) {
//
	//}
   // public static void deleteStudent(Student stu) {
//
	//}
}
}
