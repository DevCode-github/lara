class Z51{
	public static void main(String[] args){
		System.out.println(1);
		try{
			test1();
		}
		finally{
		    System.out.println("from finally");
		}		
		System.out.println(2);
	}
	public static void test1(){
		System.out.println(3);
		test2();
		System.out.println(4);
	}
	public static void test2(){
		System.out.println(5);
		int i = Integer.parseInt("abc");
		System.out.println(6);
	}
}