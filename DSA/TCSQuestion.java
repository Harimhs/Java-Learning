package DSA;
import java.util.*;

class TCSQuestion{
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int first= in.nextInt();
		System.out.println("Enter the second number: ");
		int second= in.nextInt();
		System.out.println("Enter the array length: ");
		int rows= in.nextInt();
		int[] arr= new int[rows];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]= in.nextInt();
		}
		leftOver(first, second, arr);
	}
	
	static void leftOver(int f, int e, int[] num) {
		int[] temp= new int[num.length+2];
		temp[0]= f;
		temp[temp.length-1]= e;
		List<Integer> list= new ArrayList<>();
		
		for(int i=1;i<temp.length-1;i++) {
			temp[i]= num[i-1];
		}
		for(int s=0;s<temp.length-1;s++) {
			for(int i=temp[s];i<temp[s+1];i++) {
				list.add(i);
			}
		}
		int[] array= new int[list.size()];
		for(int i=0;i<list.size();i++) {
			array[i]= list.get(i);
		}
		for(int i=0;i<array.length;i++) {
			
			System.out.print(array.toString());
		}
	}
}