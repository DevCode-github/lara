class Z2{
	public static void main(String[] args){
		int i = 10/0;
		System.out.println("Hello World!");
		try{
			System.out.println("try begin");
			System.out.println("try end");
		}
		catch (ArithmeticException ex){
			System.out.println("from catch");
		}
		System.out.println("main end");
	}
}
