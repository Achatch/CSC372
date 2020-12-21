package bank;

import java.io.FileWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Student implements Comparable<Student>{
   private String name;
   private String address;
   private double gpa;

   public Student(String name, String address, double gpa) {
       this.name = name;
       this.address = address;
       this.gpa = gpa;
   }

   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public String getAddress() {
       return address;
   }

   public void setAddress(String address) {
       this.address = address;
   }

   public double getGpa() {
       return gpa;
   }

   public void setGpa(double gpa) {
       this.gpa = gpa;
   }

   @Override
   public String toString() {
       return "Name:" + name + "\tAddress:" + address + "\tGPA:" + gpa;
   }

   @Override
   public int compareTo(Student s) {
       return getName().compareTo(s.getName());
   }
   
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
  
       int cnt=0;
      
       System.out.print("How many student's do you need to enter?\n");
       cnt=sc.nextInt();
      
       List<Student> students=new LinkedList<Student>();
      
       for(int i=0;i<cnt;i++)
       {
           sc.nextLine();
           System.out.print("Student Name : ");
           String name=sc.nextLine();
           System.out.print("Student Address : ");
           String address=sc.nextLine();
           System.out.print("Student GPA : ");
           double gpa=sc.nextDouble();
           Student s=new Student(name, address, gpa);
       students.add(s);  
       }
     
  

       Collections.sort(students);
       Iterator<Student> li1=students.iterator();
       try {
           FileWriter fw=new FileWriter("Student_Data_Sorted.txt");
           while(li1.hasNext())
           {
           fw.write(li1.next().toString()+"\n");  
           }
           fw.close();
       } catch (Exception e) {
           e.printStackTrace();
       }
  
   }

}
