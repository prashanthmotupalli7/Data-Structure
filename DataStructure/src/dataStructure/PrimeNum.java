package dataStructure;

import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to check : ");
		int n=sc.nextInt();
		boolean flag=true;
		sc.close();
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag=false;
		        break;
		
				
	}
		}
	if(flag) {
		System.out.println(n+" is a prime number");
		
	}else
		System.out.println(n+" is not a prime number");

}

}
	