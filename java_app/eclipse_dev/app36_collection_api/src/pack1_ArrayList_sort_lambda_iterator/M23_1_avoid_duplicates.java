package pack1_ArrayList_sort_lambda_iterator;
import java.util.ArrayList;
import java.util.Scanner;
public class M23_1_avoid_duplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList();
		String s1;
		do {
			System.out.println("enter one element");
			s1 = sc.next();
			if(!list.contains(s1)) {
				list.add(s1);
			}
			else {
				System.out.println(s1 + " already added");
			}
			System.out.println("do you want to add one more? (yes/no)");
		}while("yes".equals(sc.next()));
		System.out.println("final list: " + list);
	}
}
