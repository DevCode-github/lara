class Z50{
	public static void main(String[] args) throws ClassNotFoundException{//error handled by jvm
		System.out.println(1);
		try{
			test1();
		}
//		catch (ClassNotFoundException ex){
//			System.out.println("from catch");
//		}
		finally{
		    System.out.println("from finally");
		}
		
		System.out.println(2);
	}
	public static void test1() throws ClassNotFoundException{
		System.out.println(3);
		Class.forName("");
		System.out.println(4);
	}
}