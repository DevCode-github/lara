class Z86{
	public static void main(String[] args){
		System.out.println("main begin");
		if (true){
			System.out.println("from if");
			throw new ArithmeticException("some thing went wrong");
		}
		System.out.println("main end");
	}
}
