class Z55{
	public static void main(String[] args){
		System.out.println(1);
		try{
			test1();
		}
		finally{
		    System.out.println("from finally main");
		}		
		System.out.println(2);
	}
	public static void test1(){
		System.out.println(3);
		try{
			test2();
		}
		finally{
		    System.out.println("from finally 2");
		}
		System.out.println(4);
	}
	public static void test2(){
		System.out.println(5);
		Thread.sleep(1000);
		System.out.println(6);
	}
}