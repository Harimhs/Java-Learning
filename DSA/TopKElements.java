package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TopKElements {
	public static void main(String[] arg) {
		int[] arr= {1,1,1,2,2,3};
		int k=2;
		int[] result= topKFreqElement(arr, k);
		System.out.print(Arrays.toString(result));
	}

	public static int[] topKFreqElement(int[] nums, int k) {
		HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else map.put(nums[i], 1);
        }
        List<Integer>[] bucket= new ArrayList[nums.length+1];
        for(int key: map.keySet()){
            int freq= map.get(key);
            if(bucket[freq]==null) bucket[freq]= new ArrayList<>();
            bucket[freq].add(key);
        }
        List<Integer> list= new ArrayList<>();
        for(int i=bucket.length-1;i>0;i--){
            if(bucket[i]!=null){
                for(int num: bucket[i]){
                    list.add(num);
                    if(list.size()==k) break;
                }
            }
        }
        int[] array= new int[k];
        for (int i=0;i<k;i++) {
            array[i]= list.get(i);
        }
        return array;
	}
}
