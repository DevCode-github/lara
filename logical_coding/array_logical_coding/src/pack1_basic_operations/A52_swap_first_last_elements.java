package pack1_basic_operations;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class A52_swap_first_last_elements {
	public static void main(String[] args) {
		//taking input
		int count = 0;
		int arr[] = new int[10];
		System.out.println("enter 'e' to break :(max 10)");
		Scanner sc = new Scanner(System.in);
		for (int i = 0 ; i < arr.length ; i++) {
			try {
				arr[i] = sc.nextInt();
			}
			catch(InputMismatchException ex) {
				break;
			}
			count++;
			System.out.println("added");
		}
		sc.close();	
		
		//validation
		if (count <=1) {
			System.out.println("pls add more than one element, exiting....");
			System.exit(0);
		}
		
		//printing initial values
		System.out.println("intial : " + Arrays.toString(arr));
		
		//changing values
		arr[0] = arr[0] + arr[count-1];
		arr[count-1] = arr[0] - arr[count-1];
		arr[0] = arr[0] - arr[count-1];
		
		//printing values
		System.out.println();
		System.out.println("final : " + Arrays.toString(arr));
	}
}
