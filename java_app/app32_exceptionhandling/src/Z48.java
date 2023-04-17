class Z48{
	public static void main(String[] args){
		System.out.println(1);
		try{
			test1();
		}
		catch (ClassNotFoundException ex){
			System.out.println("from catch");
		}
		finally{
		    System.out.println("from finally");
		}
		System.out.println(2);
	}
	public static void test1(){
		System.out.println(3);
		Class.forName("");
		System.out.println(4);
	}
}
