package dataStructure;

public class InsertElementArray {
	
	public static void main(String[] args) {
		
		int a[]=new int[10];
		a[0]=1;
		a[1]=34;
		a[2]=28;
		a[3]=44;
		a[4]=23;
		a[5]=11;
		a[6]=16;
		a[7]=63;
		System.out.println("Inserting an element at particular location");

		int n=8;
		int index=2;
		int x=45;
		for(int i=n;i>index;i--) {
			a[i]=a[i-1];
			
		}
		a[index]=x;
		
		
		for(int j=0;j<=n;j++) {
			System.out.print(a[j]+" ,");
			
		}
	}

}
