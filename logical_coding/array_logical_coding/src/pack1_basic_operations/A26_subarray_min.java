package pack1_basic_operations;

public class A26_subarray_min {
	public static void main(String[] args) {
		int[] arr = {2,5,4,6,7,3,2,6,3,1};
		int i,j;
		i=j=arr.length/2;
		for(; i < arr.length ; i++) {
			arr[j] = arr[j] < arr[i] ? arr[j] : arr[i];
//			if (arr[j] > arr[i]) arr[j] = arr[i];
		}	
		System.out.println("second half min " + arr[j]);
	}
}
