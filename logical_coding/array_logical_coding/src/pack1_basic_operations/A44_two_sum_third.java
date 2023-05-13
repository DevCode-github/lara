package pack1_basic_operations;

public class A44_two_sum_third {
	public static void main(String[] args) {
		int[] arr = {4,5,9,7,5,3,5,7,6,8,8,9,10,7,17};
		if (arr.length < 3) System.out.println("Exception :invalid array length: should be >= 3");
		for(int i = 0 ; i < arr.length-2 ; i++) {
			if(arr[i] + arr[i+1] == arr[i+2]) {
				System.out.println(arr[i] + ", " + arr[i+1] + ", " + arr[i+2]);
			}
		}
	}
}
