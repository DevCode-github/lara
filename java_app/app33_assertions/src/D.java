class D{
	static int i;
	public static void main(String[] args){
		System.out.println("main begin");
		assert test();
		System.out.println("main end" + i);
	}
	static boolean test(){
		i = 10;//assert side effect
		return true;
	}
}
