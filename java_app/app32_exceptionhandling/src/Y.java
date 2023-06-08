class Y{
	public static void main(String[] args){
		System.out.println("main begin");
		try{
			System.out.println("try begin");
			main(null);
			System.out.println("try end");
		}
		catch (StackOverflowError ex){
			System.out.println("from catch");
			ex.printStackTrace();
		}
		System.out.println("main end");
	}
}
