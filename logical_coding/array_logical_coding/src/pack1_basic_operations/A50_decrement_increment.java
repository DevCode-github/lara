package pack1_basic_operations;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class A50_decrement_increment {
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
		if (count%2 == 0) {
			for (int i = 0 ; i < count/2 ; i++) {
				arr[i]+=5;
			}
			for (int i = count/2 ; i < count ; i++) {
				arr[i]-=10;
			}
		}
		else {
			for (int i = 0 ; i <= count/2 ; i++) {
				arr[i]+=5;
			}
			for (int i = count/2+1 ; i < count ; i++) {
				arr[i]-=10;
			}
		}
		
		//printing final values
		System.out.println("final : " + Arrays.toString(arr));
	}
}
