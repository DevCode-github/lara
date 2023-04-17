class Z85{
	public static void main(String[] args){
		System.out.println("main begin");
		if (true){
			System.out.println("from if");
			throw new ArithmeticException();
		}
		System.out.println("main end");
	}
}
