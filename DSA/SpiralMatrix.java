package DSA;

import java.util.Scanner;

public class SpiralMatrix {
	
	public static void printMatrix(int[][] arr) {
		int m= arr.length;
		int n= arr[0].length;
		int left=0, right= m-1, bottom= n-1, top= 0;
		while(top<=bottom && left<= right) {
			for(int i=left;i<=right;i++) {
				System.out.print(arr[top][i]);
			}
			top++;
			for(int i=top;i<=bottom;i++) {
				System.out.print(arr[i][right]);
			}
			right--;
			if(top<=bottom) {
				for(int i=right;i>=left;i--) {
					System.out.print(arr[bottom][i]);
				}
			}
			bottom--;
			if(left<=right) {
				for(int i=bottom;i>=top;i--) {
					System.out.print(arr[i][left]);
				}
			}
			left++;
		}
	}
	
	public static void main(String[] arg) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the matrix size: ");
		int num= sc.nextInt();
		int[][] arr= new int[num][num];
		System.out.println("Enter the matrix elements: ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]= sc.nextInt();
			}
		}
		printMatrix(arr);
	}
}
