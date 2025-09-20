package DSA;

import java.util.Scanner;

public class InsertionSort {
	
	public static void insertionSorting(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int key= arr[i];
			int j= i-1;
			while(j>=0 && key<arr[j]) {
				arr[j+1]= arr[j];
				j--;
			}
			arr[j+1]= key;
		}
		
		System.out.println("Sorted list: ");
		for(int ar: arr) {
			System.out.print(ar+ " ");
		}
	}
	
	public static void main(String[] arg) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int num= sc.nextInt();
		int[] arr= new int[num];
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		insertionSorting(arr);
	}
	
}
