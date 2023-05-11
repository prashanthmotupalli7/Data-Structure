package dataStructure;

public class SubArray {
	
	public static void printSubArray(int num[]) {
		int ts=0;
		for(int i=0;i<num.length;i++) {
			int start=i;
			for(int j=i;j<num.length;j++) {
				int end=j;
				for(int k=start;k<=end;k++) {
					System.out.print(num[k]+" ");
				}
				ts++;
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("total sub arrays "+ts);
	
	}

	public static void main(String[] args) {
		int n[]= {1,2,3,4,5};
		printSubArray(n);
	}
}
