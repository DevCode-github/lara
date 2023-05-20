package pack1_basic_operations;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class A63_right_rotate_one {
	public static void main(String[] args) {
		//counter to count the elements entered
		int count = 0;
		
		//declaring array
		int[] arr = new int[10];
		
		//taking input
		System.out.println("press enter after entering the element, enter 'e' to break :(max 10)");
		Scanner sc = new Scanner(System.in);
		for (int i = 0 ; i < arr.length ; i++) {
			try {
				arr[i] = sc.nextInt();
				count++;
				System.out.println("added");
			}
			catch(InputMismatchException ex) {
				break;
			}
		}
		sc.close();
		
		//validation
		if (count == 0) {
			System.out.println("enter atleast one element: exiting......");
		}
		
		//right shift
		int temp = arr[count-1];
		for (int i = count-1 ; i > 0 ; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
		
		//printing array
		System.out.println(Arrays.toString(arr));
	}
}
