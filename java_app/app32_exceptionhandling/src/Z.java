class Z{
	public static void main(String[] args){
		System.out.println("main begin");
		try{
			System.out.println("try begin");
			StringBuffer[] objects = new StringBuffer[999999999];
			for (int i = 0; i < objects.length ; i++){
				objects[i] = new StringBuffer("abc");
			}
			System.out.println("try end");
		}
		catch (OutOfMemoryError ex){ //incompatible exception
			System.out.println("from catch");
			ex.printStackTrace();
		}
		System.out.println("main end");
	}
}
