package DSA;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		//ways to create a matrix
		int[][] mat= new int[2][];
		
		//jagged array
		int[][] mat1= {
						{1,2,3},
						{3,4,5,6},
						{6,7}
						}; //diff size possible
		
		//how to set loop for matrix
		for(int row=0;row<mat1.length;row++) {
			for(int col=0;col<mat1[row].length;col++) {
				System.out.print(mat1[row][col]); 
			}
			System.out.println();
		}
		
		//creation of multiple lists
		ArrayList<List<Integer>> list1= new ArrayList<>();
		ArrayList<Integer> list2= new ArrayList<>();
		ArrayList<Integer> list3= new ArrayList<>();
		
		//gives empty lists
		list1.add(list2);
		list1.add(list3);
		
		for(List ob: list1) {
			System.out.println(ob);
		}
		
		//creating array with ArrayListDemo datatype
		ArrayListDemo[] arr= new ArrayListDemo[3];
		
		//creating list with ArrayListDemo datatype
		ArrayList<ArrayListDemo> list= new ArrayList<>();
		
		ArrayListDemo obj1= new ArrayListDemo();
		ArrayListDemo obj2= new ArrayListDemo();
		ArrayListDemo obj3= new ArrayListDemo();
		
		arr[0]= obj1;
		arr[1]= obj2;
		arr[2]= obj3;
		
		list.add(obj3);
		list.add(obj2);
		list.add(obj1);
		
		for(ArrayListDemo ob: arr) {
			System.out.println(ob);
		}
		
		for(ArrayListDemo ob: list) {
			System.out.println(ob);
		}
	}

}
