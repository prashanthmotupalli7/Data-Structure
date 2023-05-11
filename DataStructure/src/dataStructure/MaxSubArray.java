package dataStructure;

public class MaxSubArray {
	
	public static void maxSubArraySum(int num[]) {
		int curSum=0;
		int maxSum=Integer.MIN_VALUE;
		for(int i=0;i<num.length;i++) {
			int start =i;
			for(int j=i;j<num.length;j++) {
				int end=j;
				curSum=0;{
					for(int k=start;k<=end;k++) {
						curSum+=num[k];
						}
					System.out.println(curSum);
					if(maxSum<curSum) {
						maxSum=curSum;
					}
				}
			}
			}
		System.out.println("Maximum SUB Array "+maxSum);
		}
	public static void main(String[] args) {
		int num[]= {1,2,3,4,5,6,7,8,9};
		maxSubArraySum(num);
	}

}
