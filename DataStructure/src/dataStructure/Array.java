package dataStructure;

public class Array {
public static void main(String[] args) {
	

	int[] a= {1,2,3,4,5};
	System.out.println("array size :"+a.length);
	for(int i=0;i<a.length;i++)
		//System.out.println(a[i]);
	
	for(int x:a)
	{
	System.out.println(x);
	}
	
	//Sum of elements in an array
	
	int[] b= {1,2,3,4,5,6,7,8,9};
	int sum=0;
	for(int i=0;i<b.length;i++) {
		sum=sum+b[i];
		if(b[i]==8)
			System.out.println("Element found at "+b[i]+" Position");
		
	}
	System.out.println("Sum of an array elements "+sum);
	
	//find an maximum element in an array
	
	int []c= {45,78,23,14,18,67,88,33};
	int max=0;
	for(int i=0;i<c.length;i++)
		if(c[i]>max)
			max=c[i];
	
	System.out.println("Maximum element in an array "+max);
			
		

int []d= {45,78,23,14,18,67,88,33};
int max1,max2;
max1=max2=d[0];

for(int i=0;i<d.length;i++) {
	if(d[i]>max1) {
		max2=max1;
		max1=d[i];
	}else if(d[i]>max2) {
		max2=d[i];
	}
}
System.out.println("Second largest element "+max2);


}
}

