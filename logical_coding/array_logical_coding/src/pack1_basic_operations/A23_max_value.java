package pack1_basic_operations;

public class A23_max_value {
	public static void main(String[] args) {
//		int min = Integer.MAX_VALUE;
		int[] arr = {2,5,4,6,9,3,2,6,3,1};
		for(int i = 0 ; i < arr.length ; i++) {
			arr[0] = arr[0] < arr[i] ? arr[i] : arr[0];
//			if (arr[0] < arr[i]) arr[0] = arr[i];
		}	
		System.out.println("max " + arr[0]);
	}
}
