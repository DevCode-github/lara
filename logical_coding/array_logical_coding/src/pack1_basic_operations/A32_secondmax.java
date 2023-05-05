package pack1_basic_operations;

public class A32_secondmax {
	public static void main(String[] args) {
		int[] arr = {4,5,4,6,900,3,4,6,-3,110};
		int max = Integer.MIN_VALUE;
		for (int i = 0 ; i < arr.length ; i++) {
			if (max < arr[i]) {
				arr[0] = max;
				max = arr[i];
			}
			else if (arr[0] < arr[i]) arr[0] = arr[i];
		}
		System.out.println(arr[0]);
	}
}
