package dataStructure;

import java.util.Scanner;

public class SimpleIntrest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter principle Amount : ");
		int p=sc.nextInt();
		System.out.print("Enter Time Duration : ");
		int t=sc.nextInt();
        System.out.print("Enter Rate of Intrest : ");
        float r=sc.nextFloat();
        sc.close();
        float  simpleIntrest=(p*t*r)/100;
        System.out.print("Simple Intrest "+simpleIntrest);

	}

}
