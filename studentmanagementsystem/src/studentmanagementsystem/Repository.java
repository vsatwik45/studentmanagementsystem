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
		/*Student stu1 = new Student("satwik",22,"hyd");
		Student stu2 = new Student("pavan",20,"hyd");
		Student stu3 = new Student("vamshi",23,"hyd");
		Student stu4 = new Student("praveen",21,"hyd");
		Student stu5 = new Student("karthik",22,"hyd");
		Student stu6 = new Student("nikhil",25,"hyd");*/
		
		Student stu1 = new Masters("satwik",25,"hyd",1,2);
		Student stu2 = new Masters("nikhil",25,"hyd",2,2);
		Student stu3 = new Masters("pavan",25,"hyd",3,2);
		Student stu4 = new Masters("vamshi",25,"hyd",4,2);
		Student stu5 = new Masters("praveen",25,"hyd",5,2);
		Student stu6 = new Masters("karthik",25,"hyd",6,2);
		
		
		//give your master student, fields value.
		/*Masters master1 = new Masters();
		Masters master2 = new Masters();
		Masters master3 = new Masters();
		Masters master4 = new Masters();
		Masters master5 = new Masters();
		Masters master6 = new Masters();*/


		studentsList.add(stu1);	
		studentsList.add(stu2);	
		studentsList.add(stu3);	
		studentsList.add(stu4);	
		studentsList.add(stu5);	
		studentsList.add(stu6);
		
	/*	studentsList.add(master1);
		studentsList.add(master2);
		studentsList.add(master3);
		studentsList.add(master4);
		studentsList.add(master5);
		studentsList.add(master6);*/		
			
	}

   // public static Student getStudent(String byFirstName) {
    	 	
       
	//}

	public static ArrayList<Student> getStudent(int byAge) {
//		Student st=null;
		ArrayList<Student> st=new ArrayList<Student>();
		for (Student student:studentsList)
        	{

				if (student.getAge()==byAge) {
					st.add(student);
					
		}
        }
		return st;
	}
		
		

//	public static Student getStudent(String byName, int byAge) {

//	}

	//public static Student getStudent(String byName, String byAddress, int byAge) {

	//}
 /*TODO: FINISH THESE IN FUTURE IMOLEMENTATION
    * 
    *  
	public static void insertStudent(Student stu) {

	}
    public static void deleteStudent(Student stu) {

	}*/

}
