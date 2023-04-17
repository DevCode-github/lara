class Z44{
	public static void main(String[] args){
		System.out.println(1);
		test1();
		System.out.println(2);
	}
	public static void test1(){
		System.out.println(3);
		try{
			int i = 10/0;
		}
		catch (ArithmeticException ex){
			System.out.println("from catch" + ex);			
		}
		finally{
		    System.out.println("from finally");
		}
		System.out.println(4);
	}
}
