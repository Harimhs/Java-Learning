package DSA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;


public class NextGreatestElement {

    public static int[] monotonicStack(List<Integer> list){
        int n= list.size();
        Stack<Integer> stack= new Stack<>();
        int[] arr= new int[n];
        for(int i=n-1;i>0;i--){
            while(!stack.isEmpty()){

            }
                        
        }
        return arr;
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String input= sc.nextLine();

        ArrayList<Integer> list= new ArrayList<>();
        for(char c: input.toCharArray()){
            int temp= Character.getNumericValue(c);
            list.add(temp);
        }

        monotonicStack(list);
    }
}
