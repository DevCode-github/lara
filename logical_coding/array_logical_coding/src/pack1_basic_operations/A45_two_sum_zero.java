package pack1_basic_operations;

public class A45_two_sum_zero {
	public static void main(String[] args) {
		int count = 0;
		int[] arr = {4,5,9,-7,5,3,5,7,6,8,8,9,10,7,17};
		for (int i = 0 ; i < arr.length-1 ; i++) {
			for (int j = i+1 ; j < arr.length ; j++) {
				if (arr[i] + arr[j] == 0) System.out.println(arr[i] + ", " + arr[j]);
				count++;
			}
		}
		System.out.println(count);
	}
}
