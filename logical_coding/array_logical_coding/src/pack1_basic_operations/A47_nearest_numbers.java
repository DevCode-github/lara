package pack1_basic_operations;

import java.util.ArrayList;
import java.util.TreeSet;

public class A47_nearest_numbers {
	public static void main(String[] args) {
		int count = 0;
		int[] arr = {1,23,6,9,3,0,-1,-2,-4,15,10,56,10};
		ArrayList<Integer> list = new ArrayList<>();
		for (int a : arr) {
			list.add(a);
			count++;
		}
//		System.out.println(count);
		TreeSet<Integer> s = new TreeSet<Integer>(list);
//		System.out.println(s);
		Object[] arr1 =  s.toArray();
		for (int i = 0 ; i < arr1.length ; i++) {
			System.out.print("for " + arr1[i] + " : ");
			if( i == 0 ) {
				System.out.print(arr1[i+1]);
			}
			else if (i == arr1.length-1) {
				System.out.print(arr1[i-1]);
			}
			else {
				if ((Integer)arr1[i] - (Integer)arr1[i-1] == (Integer)arr1[i+1] - (Integer)arr1[i]) System.out.print(arr1[i-1] + ", " + arr1[i+1]);
				else if ((Integer)arr1[i] - (Integer)arr1[i-1] < (Integer)arr1[i+1] - (Integer)arr1[i])System.out.print(arr1[i-1]);
				else System.out.print(arr1[i+1]);
			}
			System.out.println();
			count++;
		}
		System.out.println(count);
	}
}
