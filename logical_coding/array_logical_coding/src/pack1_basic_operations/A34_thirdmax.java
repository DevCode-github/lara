package pack1_basic_operations;

public class A34_thirdmax {
	public static void main(String[] args) {
		int[] arr = {-1,5,4,6,90,-2,4,80,-3,110};
		int max , max1, max2 ;
		max = max1 = max2 = Integer.MIN_VALUE;
		for (int i = 0 ; i < arr.length ; i++) {
			if (max < arr[i]) {
				max2 = max1;
				max1 = max;
				max = arr[i];
			}
			else if (max1 < arr[i]) {
				max2 = max1;
				max1 = arr[i];
			}
			else if (max2 < arr[i]) {
				max2 = arr[i];
			}
		}
		System.out.println(max2);
	}
}
