package DSA;

public class PerfectNumber {
	
	public static boolean isPerfect(int n) {
		int sum= 0;
        int s= n/2;
        for(int i=1;i<n;i++){
            if(n%i==0) sum+= i;
        }
        return sum==n;
    }
	
 	public static void main(String[] args) {
 		int n= 28;
 		System.out.print(isPerfect(n));
 	}
}
