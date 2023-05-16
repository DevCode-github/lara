package pack1_basic_operations;

import java.util.Arrays;

public class A48_increment_by5 {
	public static void main(String[] args) {
		int[] arr = {1,23,6,9,3,0,-1,-2,-4,15,10,56,10};
		
		System.out.println("intial : " + Arrays.toString(arr));
		
		for (int i = 0 ; i < arr.length ; i++) {
			arr[i]+=5;
		}
		System.out.println();
		
		System.out.println("intial : " + Arrays.toString(arr));
	}
}
