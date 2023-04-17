class S
{
	public static void main(String[] args) 
	{
		int i = 10;
		if(i++ == i++){
			System.out.println("if : " + i);
		}
		System.out.println("main end: " + i);
	}
}
