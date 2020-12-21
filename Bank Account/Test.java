package bank;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Test {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
  
       int cnt=0;
      
       System.out.print("How many students data you want to enter :");
       cnt=sc.nextInt();
      
       List<Student> ll=new LinkedList<Student>();
      
       for(int i=0;i<cnt;i++)
       {
           sc.nextLine();
           System.out.print("Enter Name :");
           String name=sc.nextLine();
           System.out.print("Enter Address :");
           String address=sc.nextLine();
           System.out.print("Enter GPA :");
           double gpa=sc.nextDouble();
           Student s=new Student(name, address, gpa);
       ll.add(s);  
       }
     
  

       Collections.sort(ll);
       Iterator<Student> li1=ll.iterator();
       try {
           FileWriter fw=new FileWriter("SortedStudentData.txt");
           while(li1.hasNext())
           {
           fw.write(li1.next().toString()+"\n");  
           }
           fw.close();
       } catch (IOException e) {
           e.printStackTrace();
       }
  
   }

}
