package pack1_basic_operations;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class A49_decrement_by10 {
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
		
		//changing values
		for (int i = 0 ; i < count ; i++) {
			arr[i]-=10;
		}
		//printing final values
		System.out.println();
		System.out.println("final : " + Arrays.toString(arr));	
	}
}
