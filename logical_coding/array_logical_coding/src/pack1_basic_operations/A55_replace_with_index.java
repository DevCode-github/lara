package pack1_basic_operations;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class A55_replace_with_index {
	public static void main(String[] args) {
		int count = 0;
		
		//taking input
		System.out.println("press enter after entering the element, enter 'e' to break :");
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				sc.nextInt();
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
		
		//declaring array
		int[] arr = new int[count];
		
		//assigning values
		for (int i = 0 ; i < count ; i++) {
			arr[i] = i;
		}
		
		//printing the values
		System.out.println(Arrays.toString(arr));
	}
}
