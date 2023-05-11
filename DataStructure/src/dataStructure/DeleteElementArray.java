package dataStructure;

import java.util.Arrays;

public class DeleteElementArray {
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int index=2;
		for(int i=index;i<a.length-1;i++) {
			a[i]=a[i+1];
			
		}
		a[a.length-1]=0;
		a[index]=a[index+1];
		
		System.out.println(Arrays.toString(a));

	}

}
