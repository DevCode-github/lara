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
		TreeSet<Integer> s = new TreeSet<>(list);
		list.clear();
		for(int i : s) {
			list.add(i);
		}
		for (int i = 0 ; i < list.size() ; i++) {
			System.out.print("for " + list.get(i) + " : ");
			if( i == 0 ) {
				System.out.print(list.get(i+1));
			}
			else if (i == list.size()-1) {
				System.out.print(list.get(i-1));
			}
			else {
				if (list.get(i) - list.get(i-1) == list.get(i+1) - list.get(i)) System.out.print(list.get(i-1) + ", " + list.get(i+1));				
				else if (list.get(i) - list.get(i-1) < list.get(i+1) - list.get(i)) System.out.print(list.get(i-1));				
				else 
					System.out.print(list.get(i+1));
			}
			System.out.println();
			count++;
		}
		System.out.println(count);
	}
}
