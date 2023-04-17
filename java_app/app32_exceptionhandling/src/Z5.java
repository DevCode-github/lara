class Z5{
	public static void main(String[] args){
		System.out.println("Hello World!");
		try{
			System.out.println("try begin");
			int i = 10/0;
			System.out.println("try end");
		}
		catch (ArithmeticException ex){
			System.out.println("from catch");
			int i = 10/0;
			System.out.println("from end");
		}
		System.out.println("main end");
	}
}