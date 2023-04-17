class Z47{
	public static void main(String[] args){
		System.out.println(1);
		test1();
		System.out.println(2);
	}
	public static void test1(){
		System.out.println(3);
		try{
			Class.forName("");
		}
		catch (ClassNotFoundException ex){
			System.out.println("from catch");
		}
		finally{
		    System.out.println("from finally");
		}
		System.out.println(4);
	}
}
