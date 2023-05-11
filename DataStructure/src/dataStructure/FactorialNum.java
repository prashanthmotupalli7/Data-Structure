package dataStructure;

import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to find factorial : ");
		int n=sc.nextInt();
		int fact=1;
		sc.close();
		for(int i=n;i>0;i--) {
			fact=fact*i;
		}
		System.out.print("factorial of "+n+" is : "+fact);
	}
}
