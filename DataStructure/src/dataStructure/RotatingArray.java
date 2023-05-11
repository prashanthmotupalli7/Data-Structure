package dataStructure;

public class RotatingArray {
	
	public static void main(String[] args) {
		int a[]= {2,5,6,11,15,18,34,56,69};
		
		System.out.println("LEFT ROTATION OF AN ARRAY");
		
		for(int x:a){
			System.out.print(x+",");
		}
		System.out.println(" ");

		int temp=a[0];
		for(int i=1;i<a.length;i++) {
			a[i-1]=a[i];
		}
		a[a.length-1]=temp;
		for(int x:a){
			System.out.print(x+",");
		}
		System.out.println(" ");

		System.out.println("RIGHT ROTATION OF AN ARRAY");
		int b[]= {2,5,6,11,15,18,34,56,69};
		int temp1=b[b.length-1];
		for(int i=b.length-2;i>=0;i--) {
			b[i+1]=b[i];
		}
		b[0]=temp1;
		for(int x:b){
			System.out.print(x+",");
		}

	}
}