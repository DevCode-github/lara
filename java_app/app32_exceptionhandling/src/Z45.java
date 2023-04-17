class Z45{
	public static void main(String[] args){
		System.out.println(1);
		
		try{
			test1();
		}
		catch (ArithmeticException ex){
			System.out.println("from catch" + ex);			
		}
		finally{
		    System.out.println("from finally");
		}
		System.out.println(2);
	}
	public static void test1(){
		System.out.println(3);
		int i = 10/0;
		System.out.println(4);
	}
}
