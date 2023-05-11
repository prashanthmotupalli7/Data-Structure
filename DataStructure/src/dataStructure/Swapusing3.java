package dataStructure;

public class Swapusing3 {
	
	static void swap(int x,int y) {
		int temp;
		temp=x;
		x=y;
		y=temp;
		
	}
	public static void main(String[] args) {
	
		int x=5;
		int y=6;
		swap(x,y);
		
		System.out.println("After swaping a="+x+"b="+y);
	}

}
