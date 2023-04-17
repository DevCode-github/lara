import java.util.*;
class Z89{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter something");
		String s1 = sc.next();
		try{
			System.out.println(1);
			int i = Integer.parseInt(s1);
			System.out.println(2);
			int j = i/(i - 9);
			System.out.println(3);
		}
		catch (ArithmeticException ex){
			System.out.println("from catch1: " + ex);
		}
		catch (NumberFormatException ex){
			System.out.println("from catch2: " + ex);
		}
		System.out.println("end");
	}
}
