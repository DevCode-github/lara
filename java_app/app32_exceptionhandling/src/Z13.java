class Z13{
	public static void main(String[] args){
		System.out.println("main begin");
		try{
			System.out.println("try begin");
			System.out.println("try end");
			return;
		}
		catch (ArithmeticException ex){
			System.out.println("from catch");
		}
		finally {
		    System.out.println("from finally");
		}
		System.out.println("main end");
	}
}
