package dataStructure;

import java.util.Scanner;

public class PrimeNumSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int flag = 0;

		System.out.println("Enter a lower limit ");
		int low=sc.nextInt();
		System.out.println("Enter a upper limit ");
		int high=sc.nextInt();
		sc.close();
		for(int i=low;i<=high;i++) {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=0;
					break;
				}else {
					flag=1;
				}
			}
			if(flag==1) {
				System.out.print(i+",");
			}
		}

	}

}
