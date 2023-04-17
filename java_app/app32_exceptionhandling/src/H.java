class H{
	public static void main(String[] args){
		System.out.println("main begin");
		main(args);//stack overflow
		System.out.println("main end");
	}
}
