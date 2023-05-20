package pack1_basic_operations;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class A60_left_rotate_bytwo {
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
		
		//left shift 
		int temp = arr[0];
		for (int i = 0 ; i < count-1 ; i++) {
			arr[i] = arr[i+1];
		}
		arr[count-1] = temp;
		
		//left shift
		temp = arr[0];
		for (int i = 0 ; i < count-1 ; i++) {
			arr[i] = arr[i+1];
		}
		arr[count-1] = temp;
		
		//printing array
		System.out.println(Arrays.toString(arr));
	}
}
