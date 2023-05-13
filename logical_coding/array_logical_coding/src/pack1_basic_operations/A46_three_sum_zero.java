package pack1_basic_operations;

public class A46_three_sum_zero {
	public static void main(String[] args) {
		int count = 0;
		int[] arr = {4,5,9,-7,5,3,5,3,6,8,8,5,10,4,2};
		
		for (int k = 0 ; k < arr.length-2 ; k++) {
			for (int i = k+1 ; i < arr.length-1 ; i++) {
				for (int j = i+1 ; j < arr.length ; j++) {
					if (arr[i] + arr[j] + arr[k] == 0) System.out.println(arr[k] + ", " + arr[i] + ", " + arr[j]);
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
