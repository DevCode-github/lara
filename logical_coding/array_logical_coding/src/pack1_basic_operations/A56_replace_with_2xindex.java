package pack1_basic_operations;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class A56_replace_with_2xindex {
	public static void main(String[] args) {
		//counter to count the elements entered
		int count = 0;
		
		//taking input
		System.out.println("press enter after entering the element, enter 'e' to break :(max 10)");
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
			arr[i] = 2*i;
		}
		
		//printing the values
		System.out.println(Arrays.toString(arr));
	}
}
