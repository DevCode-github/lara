package pack1_basic_operations;

public class A33_secondmin {
	public static void main(String[] args) {
		int[] arr = {-1,5,4,6,90,-2,4,6,3,110};
		int min = Integer.MAX_VALUE, min2 = 0;
		for (int i = 0 ; i < arr.length ; i++) {
			if (min > arr[i]) {
				min2 = min;
				min = arr[i];
			}
			else if (min2 > arr[i]) min2 = arr[i];
		}
		System.out.println(min2);
	}
}
