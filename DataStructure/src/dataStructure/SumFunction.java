package dataStructure;

import java.util.Scanner;

public class SumFunction {
	
	public static int calculateSum(int n1,int n2) {
		int sum=n1+n2;
		return sum;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter num1 value : ");
		int a=sc.nextInt();
		System.out.print("Enter num2 value : ");
		int b=sc.nextInt();
		sc.close();
		int result=calculateSum(a,b);
		System.out.print("Addition of those numbers is : "+result);
	}
	
	

}
