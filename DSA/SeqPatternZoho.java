package DSA;

import java.util.Scanner;

public class SeqPatternZoho {
	
	public static void zohoPattern(int num) {
		int current;
		for(int i=1;i<=num;i++) {
			current= i;
			for(int j=1;j<=i;j++) {
				System.out.print(current+" ");
				current= current + num-j;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] arg) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size: ");
		int num= sc.nextInt();
		zohoPattern(num);
	}
}
