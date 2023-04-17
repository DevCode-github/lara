class Z6{
	public static void main(String[] args){
		System.out.println("Hello World!");
		try{
			System.out.println("try begin");
			int i = 10/0;
			System.out.println("try end");
		}
		catch (ArithmeticException ex){
			System.out.println("from catch");
			try{
				System.out.println("from inner try begin");
				int i = 10/0;
				System.out.println("from inner try end");
			}
			catch (ArithmeticException ex1){
				System.out.println("from inner catch");
			}
			System.out.println("catch end");
		}
		System.out.println("main end");
	}
}