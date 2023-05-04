package pack1_basic_operations;

public class A22_min_value {
	public static void main(String[] args) {
		int[] arr = {2,5,4,6,7,3,2,6,3,1};
		for(int i = 0 ; i < arr.length ; i++) {
			arr[0] = arr[0] < arr[i] ? arr[0] : arr[i];
//			if (arr[0] > arr[i]) arr[0] = arr[i];
		}	
		System.out.println("min " + arr[0]);
	}
}
