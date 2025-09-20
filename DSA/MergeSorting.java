package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSorting {
	
	public static int[] mergeSort(int[] arr) {
		if(arr.length==1) return arr;
		int mid= (arr.length)/2;
		int[] leftArray= mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int[] rightArray= mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
		return merge(leftArray, rightArray);
	}
	
	public static int[] merge(int[] leftArray, int[] rightArray) {
		int[] mergeArray= new int[leftArray.length+rightArray.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<leftArray.length && j<rightArray.length) {
			if(leftArray[i]<rightArray[j]) {
				mergeArray[k]= leftArray[i];
				i++;
			}else {
				mergeArray[k]= rightArray[j];
				j++;
			}
			k++;
		}
		while(i<leftArray.length) {
			mergeArray[k]= leftArray[i];
			i++;
			k++;
		}
		while(j<rightArray.length) {
			mergeArray[k]= rightArray[j];
			j++;
			k++;
		}
		return mergeArray;
	}
	
	public static void main(String[] arg) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the array size: ");
		int num= sc.nextInt();
		int[] arr= new int[num];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println(Arrays.toString(mergeSort(arr)));
	}
}
