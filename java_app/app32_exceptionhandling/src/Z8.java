import java.util.Scanner;
class Z8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello World!");
		System.out.println("plz enter somethin");
		String s1 = sc.next();
		try{
			System.out.println("try begin");
			int i = Integer.parseInt(s1);
			System.out.println(1);
			int j = i / (9-i);
			System.out.println(2);
			int[] elements = {10, 20};
			int k = elements[j];
			System.out.println(k);
			System.out.println("try end");
		}
		catch (ArithmeticException ex){
			System.out.println("from catch1" + ex);
			System.out.println("catch end");
		}
		catch (ArithmeticException ex1){
			System.out.println("from catch2" + ex1);
			System.out.println("catch end");
		}
		catch (NumberFormatException ex){
			System.out.println("from catch3" + ex);
			System.out.println("catch end");
		}
		System.out.println("main end");
	}
}