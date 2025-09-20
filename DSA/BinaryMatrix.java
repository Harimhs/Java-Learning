package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryMatrix {
	
	public static int[] binarySortedSearch(int[][] arr, int target) {
		int rowLength= arr.length;
		int colLength= arr[0].length;
		int left=0, right= (rowLength * colLength)-1;
		
		while(left<=right) {
			int mid= (left+right)/2;
			int row= mid/colLength;
			int col= mid%colLength;
			int midValue= arr[row][col];
			if(midValue==target) return new int[] {row, col};
			else if(midValue>target) right= mid -1;
			else left= mid+1;
		}
		return new int[] {-1, -1};
	}
	
	public static int[] binarySearch(int[][] arr, int target) {
		int left= 0;
		int right= arr.length-1;
		while(left<arr.length && right>=0) {
			if(arr[left][right]== target) return new int[] {left, right};
			else if(arr[left][right]> target) right--;
			else left++;
		}
		return new int[]{-1, -1};
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of row: ");
		int row= sc.nextInt();
		System.out.println("Enter the number of col: ");
		int col= sc.nextInt();
		System.out.println("Enter the matrix: ");
		int[][] arr= new int[row][col];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]= sc.nextInt();
			}
		}
		System.out.println("Enter the target number: ");
		int target= sc.nextInt();
		System.out.println(Arrays.toString(binarySearch(arr, target)));
		System.out.println(Arrays.toString(binarySortedSearch(arr, target)));
	}
}
