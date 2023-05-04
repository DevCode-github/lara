package pack1_basic_operations;

public class A14_alternate_reverse {
	public static void main(String[] args) {
		int[] arr = {2,5,4,6,7,3,2,6,3,2};
		for(int i = arr.length-1 ; i > -1 ; i-=2) {
			System.out.println(arr[i]);
		}
	}
}
