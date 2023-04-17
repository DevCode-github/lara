class Z94{
	public static void main(String[] args){
		try{
			System.out.println("try begin");
			int i = 10/0;
			System.out.println("try end");
		}
		catch (ArithmeticException ex){
			//some statements
			throw new ArithmeticException(ex.getMessage());
		}
		System.out.println("Hello World!");
	}
}
