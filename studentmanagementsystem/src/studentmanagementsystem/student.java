package studentmanagementsystem;
import java.util.*;
public class student {
	private String name, address, major;
	
	    public student(String n, String a, String m){
	    	name=n;
	    	address=a;
	    	major=m;
	    }
	        //this.name = "satwik";
	    	public void printDetails() {
	            System.out.println("Name: " + name);
	            System.out.println("Address: " + address);
	            System.out.println("Major: " + major);
	    }
	    

public class master extends student{

    String degree;

    public master(String n, String a, String m, String d) {
        super(n,a, m);
       degree=d;
    }
}

}


