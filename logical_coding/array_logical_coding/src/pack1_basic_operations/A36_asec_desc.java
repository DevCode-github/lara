package pack1_basic_operations;

public class A36_asec_desc {
	public static void main(String[] args) {
		int[] arr = {-1,5,4,6,90,-2,4,80,-3,110};
		boolean asc,desc;
		asc = desc = true;
		for (int i = 0 ; i < arr.length ; i++) {
			if (asc) { 
				System.out.print(arr[i] + ", ");
				if((i+1) < arr.length && arr[i] < arr[i+1]) {
					asc = true;
					desc = false;
				}
				else {
					desc = true;
					asc = false;
					System.out.println();
				}
			}
			else if (desc) {
				System.out.print(arr[i] + ", ");
				if((i+1) < arr.length && arr[i] > arr[i+1]){
					asc = false;
					desc = true;
				}
				else {
					asc = true;
					desc = true;
					System.out.println();
				}
			}
		}
	}
}
