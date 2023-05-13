package pack1_basic_operations;

public class A40_middle_to_even {
	public static void main(String[] args) {
		int[] arr = {4,5,6,8,5,3,5,7,6,7,8,9,10,7,4};
		for(int i = 1 ; i < arr.length-1 ; i++) {
			if(arr[i-1]%2 == 0 && arr[i+1]%2 == 0) {
				if (arr[i]%2 != 0) System.out.println(arr[i]);
			}
		}
	}
}
