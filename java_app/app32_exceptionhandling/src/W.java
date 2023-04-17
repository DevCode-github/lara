class W{
	public static void main(String[] args){
		System.out.println("main begin");
		try{
			System.out.println("try begin");
			Object obj = new String("abc");
			Integer i = (Integer) obj;
			System.out.println("try end");
		}
		catch (ClassCastException ex){ //incompatible exception
			System.out.println("from catch");
			ex.printStackTrace();
		}
		System.out.println("main end");
	}
}
