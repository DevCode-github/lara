class X{
	public static void main(String[] args){
		System.out.println("main begin");
		try{
			System.out.println("try begin");
			int i = Integer.parseInt("123r");
			System.out.println("try end");
		}
		catch (NumberFormatException ex){ //incompatible exception
			System.out.println("from catch");
			ex.printStackTrace();
		}
		System.out.println("main end");
	}
}
