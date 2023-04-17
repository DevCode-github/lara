class P{
	public static void main(String[] args){
		int i = 10;
		Integer obj1 = i;	//auto boxing Integer obj = Integer.valueOf(i);
		Integer obj2 = 10;	//auto boxing
		i = obj1;			//auto unboxing i = obj2.intValue();
		i = obj2;			//auto unboxing
		System.out.println("Hello World!");
	}
}
