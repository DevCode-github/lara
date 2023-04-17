import java.util.Scanner;
class Z10{
	public static void main(String[] args){
		System.out.println("main begin");
		try{
			System.out.println("try begin");
			Scanner sc = new Scanner(System.in);
			System.out.println("pls enter");
			String s1 = sc.next();
			int i = Integer.parseInt(s1);
			int j = i/(i-9);
			System.out.println("try end");
		}
		catch (ArithmeticException ex){
			System.out.println("from catch " + ex);
			int i = 40/0;
			System.out.println("Catch end" + ex);
		}
		finally {
			System.out.println("finally");
		}
		System.out.println("main end");
	}
}
