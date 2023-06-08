class Z54{
	public static void main(String[] args){/
		System.out.println(1);
		try{
			test1();
		}
		catch (NumberFormatException ex){
			System.out.println("from catch");
		}
		finally{
		    System.out.println("from finally");
		}		
		System.out.println(2);
	}
	public static void test1(){
		System.out.println(3);
		try{
			test2();
		}
		finally{
		    System.out.println("from finally");
		}
		System.out.println(4);
	}
	public static void test2(){
		System.out.println(5);
		int i = Integer.parseInt("abc");
		System.out.println(6);
	}
}
class Z54_1{
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
		int i = Integer.parseInt("abc");
		System.out.println(6);
	}
}