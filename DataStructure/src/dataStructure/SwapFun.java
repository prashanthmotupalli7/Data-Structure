package dataStructure;

public class SwapFun {
	
	public static void swap(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a="+a);
		System.out.println("b="+b);

	}
public static void main(String[] args) {
	int m=10;
	int n=5;
	swap(m,n);
	
}
}
