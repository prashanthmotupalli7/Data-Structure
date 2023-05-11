package dataStructure;

import java.util.Scanner;

public class CelciusToFohrenhiet {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter temperature in Celcius  :");
		int c=sc.nextInt();
		float fahrenheit =((c*9)/5)+32;
		sc.close();
	System.out.print("After Fahrenheit conversion :"+fahrenheit);

}
}