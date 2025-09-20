package DSA;

import java.util.Scanner;

public class VowelString {
	
	public static String swapVowel(String str, String vowel) {
		StringBuilder sb= new StringBuilder(str);
		int j=sb.length()-1;
		for(int i=0;i<sb.length();i++) {
			char t1= str.charAt(i);
			char t2= str.charAt(j);
			if((t1=='a' || t1=='e' || t1=='i' || t1=='u' || t1=='o') && (t2=='a' || t2=='e' || t2=='i' || t2=='u' || t2=='o')){
				sb.setCharAt(str.indexOf(t1), t2);
				sb.setCharAt(str.indexOf(t2), t1);
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] arg) {
		Scanner sc= new Scanner(System.in);
		String str= sc.next();
		sc.close();
		String vowel= "aeiouAEIOU";
		swapVowel(str, vowel);
	}
}
