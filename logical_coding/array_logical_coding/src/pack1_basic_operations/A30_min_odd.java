package pack1_basic_operations;

public class A30_min_odd {
	public static void main(String[] args) {
		int[] arr = {4,5,4,6,9,3,4,6,3,10};
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i]%2 != 0 && arr[0] > arr[i]) 
					arr[0] = arr[i];
		}	
		System.out.println("min from odd " + arr[0]);
	}
}
