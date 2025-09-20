package DSA;

public class PrimeFrequency {
	
	public static boolean isPrime(int count){
		if(count<=1) return false;
        for(int i=2;i<count;i++){
            if(count%i==0) return false;
        }
        return true;
    }
    
    public static boolean checkPrimeFrequency(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int count= 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(isPrime(count)) return true;
        }
        return false;
    }
    
    public static void main(String args[]) {
    	int[] arr= {3,3,3,3};
    	System.out.println(PrimeFrequency.checkPrimeFrequency(arr));
    }
}
