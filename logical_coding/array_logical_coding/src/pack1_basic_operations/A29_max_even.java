package pack1_basic_operations;

public class A29_max_even {
	public static void main(String[] args) {
		int[] arr = {2,5,4,6,9,3,2,6,3,10};
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i]%2 == 0 && arr[0] < arr[i])  
					arr[0] = arr[i];
		}	
		System.out.println("max from even " + arr[0]);
	}
}
