package pack1_basic_operations;

public class A20_subarray_sum {
	public static void main(String[] args) {
		int[] arr = {2,5,4,6,7,3,2,6,3,2};
		for(int i = arr.length/2 ; i < arr.length  ; i++) {
			arr[0] += arr[i];
		}
		System.out.println("second half sum " + arr[0]);
	}
}
