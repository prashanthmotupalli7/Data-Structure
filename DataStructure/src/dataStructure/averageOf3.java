package dataStructure;

import java.util.Scanner;

public class averageOf3 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n1");
		int n1=sc.nextInt();
		System.out.println("Enter the value of n2");
		int n2=sc.nextInt();
		System.out.println("Enter the value of n3");
		int n3=sc.nextInt();
		sc.close();
		float average=(n1+n2+n3)/3;
		System.out.print("Average of 3 numbers "+average);
	} 

}
