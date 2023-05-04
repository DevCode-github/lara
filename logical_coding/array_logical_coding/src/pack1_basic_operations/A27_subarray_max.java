package pack1_basic_operations;

public class A27_subarray_max {
	public static void main(String[] args) {
		int[] arr = {2,5,4,6,9,3,2,6,3,10};
		int i,j;
		i = j = arr.length/2;
		for(; i < arr.length ; i++) {
			arr[j] = arr[j] < arr[i] ? arr[i] : arr[j];
//			if (arr[j] < arr[i]) arr[j] = arr[i];
		}	
		System.out.println("second hal f max " + arr[j]);
	}
}
