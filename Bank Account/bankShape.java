package bank;

import java.util.*;

abstract class bankShape{
	abstract double surface_area();
	abstract double volume();
}




class Sphere extends bankShape{
	double radius;
	Sphere(double rad){
		radius=rad;
	}
	
	double surface_area(){
		return 4*3.14*radius*radius;
	}
	
	double volume(){
		return 1.333*3.14*radius*radius*radius;
	}
	
	public String toString(){
		String str="";
		str=str+"Surface Area of Sphere : "+surface_area()+"\n";
		str=str+"Volume of Sphere : "+volume();
		return str;
	}
}

class Cylinder extends bankShape{
	double height,radius;
	Cylinder(double rad,double ht)	{
		radius=rad;
		height=ht;
	}
	
	double surface_area(){
		return 2*3.14*radius*height+2*3.14*radius*radius;
	}
	
	double volume()	{
		return 3.14*radius*radius*height;
	}
	
	public String toString(){
		String str="";
		str=str+"Surface Area of Cylinder : "+surface_area()+"\n";
		str=str+"Volume of Cylinder : "+volume();
		return str;
	}
}


class Cone extends bankShape{
	double height,radius;
	
	Cone(double rad,double ht){
		radius=rad;
		height=ht;
	}
	
	double surface_area(){
		return 3.14*radius*(radius+Math.sqrt(height*height+radius*radius));
	}
	
	double volume()
	{
	return 3.14*radius*radius*(height/3);
	}
	
	public String toString(){
		String str="";
		str=str+"Surface Area of Cone : "+surface_area()+"\n";
		str=str+"Volume of Cone : "+volume();
		return str;
	}
}


class ShapeArray{
	public static void main(String args[]){
		double rad,ht;
		Scanner sc=new Scanner(System.in);
		
		bankShape[] shapeArray=new bankShape[3];
		
		System.out.print("\n\nEnter Radius of sphere : ");
		rad=sc.nextDouble();
		Sphere sphere=new Sphere(rad);
		shapeArray[0]=sphere;
		
		System.out.print("Enter Radius of Cylinder : ");
		rad=sc.nextDouble();
		System.out.print("Enter Height of Cylinder : ");
		ht=sc.nextDouble();
		Cylinder cylinder=new Cylinder(rad,ht);
		shapeArray[1]=cylinder;
		
		System.out.print("Enter Radius of Cone : ");
		rad=sc.nextDouble();
		System.out.print("Enter Height of Cone : ");
		ht=sc.nextDouble();
		Cone cone=new Cone(rad,ht);
		shapeArray[2]=cone;
		
		System.out.println("\n");
		for(int i=0;i<=2;i++){
			System.out.println(shapeArray[i]);
		}
	}
}