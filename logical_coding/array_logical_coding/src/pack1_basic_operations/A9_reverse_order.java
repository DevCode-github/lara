package pack1_basic_operations;

public class A9_reverse_order {
	public static void main(String[] args) {
		int[] arr = {2,5,4,6,7,3,2,6,3,2};
		for(int i = arr.length-1 ; i >= 0  ; i--) {
			System.out.println(arr[i]);
		}
	}
}
