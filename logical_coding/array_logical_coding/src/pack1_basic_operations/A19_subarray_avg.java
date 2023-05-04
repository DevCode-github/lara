package pack1_basic_operations;

public class A19_subarray_avg {
	public static void main(String[] args) {
		int[] arr = {2,5,4,6,7,3,2,6,3,2};
		for(int i = 0 ; i < arr.length/2 ; i++) {
			arr[0] += arr[i];
		}
		System.out.println("first half avg " + (float)arr[0]/arr.length);
	}
}
