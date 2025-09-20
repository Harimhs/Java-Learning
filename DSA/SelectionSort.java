package DSA;

import java.util.Scanner;

public class SelectionSort {
	
	public static void selectionsort(int[] arr) {
		int temp=0;
		int minIndex= -1;
		for(int i=0;i<arr.length-1;i++) {
			minIndex= i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[minIndex]>arr[j]) {
					minIndex= j;
				}
				temp= arr[minIndex];
				arr[minIndex]= arr[i];
				arr[i]= temp;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	public static void main(String[] arg) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int num= sc.nextInt();
		int[] arr= new int[num];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		selectionsort(arr);
	}
}
