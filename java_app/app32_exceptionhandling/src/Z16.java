class Z16{
	public static void main(String[] args){
		System.out.println("main begin");
		try{
			System.out.println("try begin");
			int i = 10/0;
			System.out.println("try end");
		}
		catch (ArithmeticException ex){
			System.out.println("from catch");
			System.exit(0); // finally will not execute
		}
		finally {
		    System.out.println("from finally");
		}
		System.out.println("main end");
	}
}
