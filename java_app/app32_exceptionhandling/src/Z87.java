class Z87{
	public static void main(String[] args){
		if (args.length == 0){
			System.out.println("pls supply one int command line arg");
			return;
		}
		int age = Integer.parseInt(args[0]);
		if (age<0){
			throw new RuntimeException("age should be greater than 0");
		}
		// continue remaining code...
		System.out.println("main end");
	}
}
