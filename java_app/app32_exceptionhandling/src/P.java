class P{
	public static void main(String[] args){
		System.out.println("main begin");
		try{
			System.out.println("try begin");
			int i = 10/0;
			System.out.println("try end");
		}
		catch (ArithmeticException ex){
//			Throwable - supermost class to all exception and error class
//			catch argument should be a type of throwable			
			System.out.println("from catch");
		}
		System.out.println("main end");
	}
}
