class O 
{
	O()
	{
		System.out.println("O()");
	}
	O(int i)
	{
		this();
		System.out.println("O(int)");
	}
	public static void main(String[] args) 
	{
		O obj1 = new O(45);
		System.out.println("------------");
		O obj2 = new O();
		System.out.println("------------");
		O obj3 = new O(50);
		System.out.println("------------");
	}
}
