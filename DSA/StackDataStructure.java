package DSA;

import java.util.Stack;

public class StackDataStructure {
	
	public static String decodeString(String s) {
        Stack<Integer> sint= new Stack<>();
        Stack<String> sstr= new Stack<>();
        StringBuilder current= new StringBuilder();
        int k= 0;
        for(char c: s.toCharArray()){
            if(Character.isDigit(c)){
                k= k*10+(c-'0');
            }
            else if(c=='['){
                sint.push(k);
                sstr.push(current.toString());
                current= new StringBuilder();
                k= 0;
            }
            
            else if(c==']'){
                int temp= sint.pop();
                String str= sstr.pop();
                StringBuilder decoded= new StringBuilder(str);
                for(int i=0;i<temp;i++) decoded.append(current);
                current= decoded;
            }
            else{
            	current.append(c);
            }
        }
        return current.toString();
    }

	public static void main(String[] args) {
		String s= "3[a2[c]]";
		System.out.println("final output: "+decodeString(s));
	}

}
