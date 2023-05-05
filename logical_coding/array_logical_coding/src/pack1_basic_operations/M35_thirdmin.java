package pack1_basic_operations;

public class M35_thirdmin {
	public static void main(String[] args) {
		int[] arr = {-1,5,4,6,90,-2,4,80,-3,110};
		int min,min1,min2;
		min = min1 = min2 = Integer.MAX_VALUE;
		for (int i = 0 ; i < arr.length ; i++) {
			if (min > arr[i]) {
				min2 = min1;
				min1 = min;
				min = arr[i];
			}
			else if (min1 > arr[i]) {
				min2 = min1;
				min1 = arr[i];
			}
			else if (min2 > arr[i]) {
				min2 = arr[i];
			}
		}
		System.out.println(min2);
	}
}
