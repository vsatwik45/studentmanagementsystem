package studentmanagementsystem;


import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Repository  {

	String name, address, course;
    int age, studentNum, semester;
	private static ArrayList<Student> studentsList = new ArrayList<Student>();

	/**
	 * below block is static fields, run once.
	 * below also your default stage of repository
	 */
	static {
		//set these students value.
		Student stu1 = new Student();
		Student stu2 = new Student();
		Student stu3 = new Student();
		Student stu4 = new Student();
		Student stu5 = new Student();
		Student stu6 = new Student();
		
		//give your master student, fields value.
		Masters master1 = new Masters();
		Masters master2 = new Masters();
		Masters master3 = new Masters();
		Masters master4 = new Masters();
		Masters master5 = new Masters();
		Masters master6 = new Masters();


		studentsList.add(stu1);	
		studentsList.add(stu2);	
		studentsList.add(stu3);	
		studentsList.add(stu4);	
		studentsList.add(stu5);	
		studentsList.add(stu6);
		
		studentsList.add(master1);
		studentsList.add(master2);
		studentsList.add(master3);
		studentsList.add(master4);
		studentsList.add(master5);
		studentsList.add(master6);
		
		
		
			
	}

    public static Student getStudent(String byFirstName) {
       
	}

	public static Student getStudent(int byAge) {


	}

	public static Student getStudent(String byName, int byAge) {

	}

	public static Student getStudent(String byName, String byAddress, int byAge) {

	}
 /*TODO: FINISH THESE IN FUTURE IMOLEMENTATION
    * 
    *  
	public static void insertStudent(Student stu) {

	}
    public static void deleteStudent(Student stu) {

	}*/

}
