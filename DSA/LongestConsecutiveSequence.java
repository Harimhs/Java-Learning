package DSA;

import java.util.HashSet;

public class LongestConsecutiveSequence {
	
	public static int longestConsecutive(int[] nums) {
		int total = 0;
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i: set){
            if(!set.contains(i-1)){
                int count = 1;
                while(set.contains(i+count)) count++;
                total= Math.max(count, total);
            }
        }
        return total;
    }
	
	public static void main(String[]arg) {
		int[] arr= {10,5,11,4,1000,6};
		int result= longestConsecutive(arr);
		System.out.print(result);
	}
}
