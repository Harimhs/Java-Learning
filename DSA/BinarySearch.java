package DSA;

import java.util.Scanner;

public class BinarySearch {
	
	public static int findBinary(int arr[], int target) {
		int left= 0;
		int right= arr.length-1;
		while(left<=right) {
			int mid= (left+right)/2;
			if(arr[mid]==target) return mid;
			else if(arr[mid]>target) right= mid-1;
			else left= mid+1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size if array: ");
		int size= sc.nextInt();
		int[] arr= new int[size];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println("Enter the target element: ");
		int target= sc.nextInt();
		int result= findBinary(arr, target);
		System.out.println("Found the target in: "+ result);
	}
}
