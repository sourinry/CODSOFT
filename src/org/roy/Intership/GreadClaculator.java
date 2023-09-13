package org.roy.Intership;
import java.util.*;
public class GreadClaculator {
	static int totalmarks=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your total subject");
		int totalsubject=sc.nextInt();
		 int submarks;
		for(int i=1; i<=totalsubject; i++)
		{
			System.out.println("enter your subject name & number you get out of 100");
			String sub=sc.next();
			submarks=sc.nextInt();
			 totalmarks=totalmarks+submarks;
			
		}
		int grandtotal=totalsubject*100;
		double avg=(totalmarks/totalsubject);
		System.out.println("you got total "+totalmarks+" out of  "+grandtotal);
		System.out.println("you got "+avg+"%");
		System.out.println("your total subjects "+totalsubject);
		System.out.println("total marks you got  "+totalmarks);
		
		avgCal(avg);
	}
	public static void avgCal(double avg) {
		if(avg>=90)
			System.out.println("you got AA grade");
		else if(avg>=75 && avg<89)
			System.out.println("you got A+ gread");
		else if(avg>60 && avg<=74)
			System.out.println("you got A gread");
		else if(avg>=50 && avg<=59)
			System.out.println("you got B gread");
		else if(avg>=30 && avg<=49)
			System.out.println("you got c gread");
		else if(avg>=20 && avg<=29)
			System.out.println("you got D gread");
		else if(avg<19)
			System.out.println("you are fail");
		
	}
	
}
