class Z77{
	Z77() throws ClassNotFoundException{}
	public static void main(String[] args){
		try{
			Z77 obj = new Z77();
		}
		catch (ClassNotFoundException ex){
		}
		System.out.println("Hello World!");
	}
}
