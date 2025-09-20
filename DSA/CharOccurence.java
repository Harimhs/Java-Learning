package DSA;

import java.util.Scanner;

public class CharOccurence {
	
	public static void countChar(String str) {
		for(int i=0;i<str.length();i++) {
			int count=0;
			for(int j=0;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
			System.out.println("The char "+str.charAt(i)+" Occurs totally "+ count);
		}
	}
	
	public static void main(String[] arg) {
		Scanner sc= new Scanner(System.in);
		String str= sc.next();
		countChar(str);
	}
}
