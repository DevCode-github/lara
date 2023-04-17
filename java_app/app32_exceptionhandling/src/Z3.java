class Z3{
	public static void main(String[] args){
		System.out.println("Hello World!");
		try{
			System.out.println("try begin");
			System.out.println("try end");
		}
		int i = 10/0;
		catch (ArithmeticException ex){
			System.out.println("from catch");
		}
		System.out.println("main end");
	}
}