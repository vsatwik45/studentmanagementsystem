package studentmanagementsystem;

import java.util.*;

public class Student 
{
   
        String name;
        int age;
       String address;

        // Default Constructor

        Student()
        {
            name = "";
            age = 0;
            address = "";
        }

     public   Student(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;

        }

        String getName()
        {
            return name;
        }


        public void display()//printing
        {

            System.out.println("Name = "+ name);
            System.out.println("Age = "+ age);
            System.out.println("address = "+ address);



        }

}








