package DSA;

import java.util.Scanner;

public class maxSubArray {
	
	public static int bruteForce(int[] arr) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum+= arr[j];
				max= Math.max(max, sum);
			}
		}
		return max;
	}
	
	public static int optimal(int[] arr) {
		int max= Integer.MIN_VALUE;
		int sum= 0;
		for(int i=0;i<arr.length;i++) {
			sum+= arr[i];
			while(sum<0) {
				sum= 0;
			}
			if(max<sum) max= sum; 
		}
		return max;
	}
	
	
	public static void main(String[] arg) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array length: ");
		int size= sc.nextInt();
		int[] arr= new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		int bf= bruteForce(arr);
		System.out.println(bf);
		
		int op= optimal(arr);
		System.out.println(op);
	}
}
