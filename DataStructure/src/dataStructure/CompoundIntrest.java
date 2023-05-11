package dataStructure;

import java.util.Scanner;

public class CompoundIntrest {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Principle Amount : ");
		int p=sc.nextInt();
		System.out.print("Enter Rate of Intrest : ");
		float r=sc.nextFloat();
      System.out.print("Enter number of time copounded annually : ");
      int m=sc.nextInt();
		System.out.print("Enter time  : ");
		int t= sc.nextInt();
		
		float compoundIntrest= (float) (p*(Math.pow((1+r/m),(m*t))));
		System.out.print("Compound Intrest :"+compoundIntrest);
	}

}
