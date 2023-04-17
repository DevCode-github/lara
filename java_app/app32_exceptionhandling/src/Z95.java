//not meaningfull
class Z95{
	public static void main(String[] args){
		try{
			System.out.println("try begin");
			if (true){
				throw new ArithmeticException();
			}
			System.out.println("try end");
		}
		catch (ArithmeticException ex){
			//some statements
		}
		System.out.println("Hello World!");
	}
}
