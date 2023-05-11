package dataStructure;

public class FibonacciSeries {
	public static void main(String[] args) {
		int firstTerm=0,secondTerm=1;
		int n=10;
		for(int i=1;i<=n;i++) {
	    System.out.println(firstTerm+" ");
		int nextTerm=firstTerm+secondTerm;
		firstTerm=secondTerm;
		secondTerm=nextTerm;
			
		}
	}

	
}
