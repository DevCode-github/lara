package pack1_basic_operations;

public class A24_subarray_min {
	public static void main(String[] args) {
		int[] arr = {2,5,4,6,7,3,2,6,3,1};
		for(int i = 0 ; i < arr.length/2 ; i++) {
			arr[0] = arr[0] < arr[i] ? arr[0] : arr[i];
//			if (arr[0] > arr[i]) arr[0] = arr[i];
		}	
		System.out.println("first half min " + arr[0]);
	}
}
