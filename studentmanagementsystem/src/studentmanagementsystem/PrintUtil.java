package studentmanagementsystem;

import java.awt.List;
import java.util.ArrayList;

public class PrintUtil {


	/**
	 * this method will print the list of students
	 */
	public static void printMasters(ArrayList<Student> studentList) {
	    for (int j = 0; j <studentList.size(); j++)
	    	{
	    	Student st = studentList.get(j);
	    	System.out.println(st.toString());	
//	        Masters mt = (Masters) studentList.get(j);
//	        System.out.println("student list: " + (j + 1)); 
//	        System.out.println("");
//	        System.out.println("Name: " + mt.getName() + "Age: "+mt.getAge() + "Address: " + mt.getAddress() + "Student Number: " + mt.getStudentNum() + "Semester: " + mt.getSemester()); // print out results entered by user
//	        System.out.println("");
	    }


	}
}

