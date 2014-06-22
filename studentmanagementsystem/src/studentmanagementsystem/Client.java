package studentmanagementsystem;

public class Client
{
   public static void main(String[] args){
       Student s = new Student("SATWIK","FREMONT","MSCS");
       s.printDetails();
       
       Master m = new Master("SATWIK","FREMONT","MSCS","MASTERS");
      
       //System.out.println(s.toString());
   }
}

