package studentmanagementsystem;
import java.util.*;
public class Student {
	private String name, address, major;
	
	    public Student(String name1, String address1, String major1){
	    	name=name1;
	    	address=address1;
	    	major=major1;
	    }
	        //this.name = "satwik";
	    	public void printDetails() {
	            System.out.println("Name: " + name);
	            System.out.println("Address: " + address);
	            System.out.println("Major: " + major);
	    }
	    
}
 class Master extends Student{

    String degree;

    public Master(String name1, String address1, String major1, String degree1) {
        super(name1,address1, major1);
       degree=degree1;
       System.out.println("degree: " + degree1);
    }
}




