package DSA;

import java.util.Scanner;

public class BubbleSorting {
	
	public static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp= arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		for(int ar: arr) {
			System.out.print(ar);
		}
	}
	
	public static void main(String[] arg) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int num= sc.nextInt();
		System.out.println("Enter the array elements: ");
		int[] arr= new int[num];
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println("Before sorted: ");
		for(int ar: arr) {
			System.out.print(ar);
		}
		System.out.println();
		System.out.println("After sorted: ");
		bubbleSort(arr);
	}
}
