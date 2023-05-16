package pack1_basic_operations;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class A54_reverse_array {
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
		if (count <= 0) {
			System.out.println("pls add more than one element, exiting....");
			System.exit(0);
		}
		
		//creating another array for reverse
		int[] arr1 = new int[arr.length];
		
		//pattern for splitting array
		String[] s = Arrays.toString(arr).split("[\\[\\],]");
		System.out.println(Arrays.toString(s));
		
		//reversing and saving values to new array
		for (int i = count,j = 0 ; i >= 0 ; i--,j++) {
			if (s[i] == "") break;
			else arr1[j] = Integer.parseInt(s[i].trim());
		}
		
		//final reverse array
		System.out.println(Arrays.toString(arr1));
		
		
		/*
		 * achieved by swapping
		 * 
		 * for (int i = 0 ; i < arr.length/2 ; i+=2) {
			arr[i] = arr[i] + arr[arr.length - i -1];
			arr[arr.length - i -1] = arr[i] - arr[arr.length - i -1];
			arr[i] = arr[i] - arr[arr.length - i -1];
		  }
		 */
	}
}
