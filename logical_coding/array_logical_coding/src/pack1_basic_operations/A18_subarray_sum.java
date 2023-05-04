package pack1_basic_operations;

public class A18_subarray_sum {
	public static void main(String[] args) {
		int[] arr = {2,5,4,6,7,3,2,6,3,2};
		for(int i = 0 ; i < arr.length/2 ; i++) {
			arr[0] += arr[i];
		}	
		System.out.println("first half sum " + arr[0]);
	}
}
