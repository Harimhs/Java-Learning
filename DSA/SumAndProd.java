package DSA;

public class SumAndProd {
	public static void main(String[] args) {
		int n= 10;
		System.out.println(CheckSumAndProd(n));
	}

	public static boolean CheckSumAndProd(int n) {
		int o= n;
		int sum= 0;
        int prod= 1;
        while(n>0){
            int temp= n%10;
            sum+= temp;
            prod*= temp;
            n= n/10;
        }
        System.out.println(sum + prod);
        return ((sum+prod)%o)==0;
	}
}
