class F{
	public static void main(String[] args){
		Boolean obj1 = Integer.valueOf("true");	//boxing
		boolean i = obj1.intValue();			//unboxing
		System.out.println("done " + i);
	}
}
