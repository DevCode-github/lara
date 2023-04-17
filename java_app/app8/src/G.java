class G
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (false)
		{
			int i = 10;
			System.out.println("if block");
			i += 20;
		}
		else
		{
			i += 30;
			System.out.println("else block");
			System.out.println("else block");
			System.out.println("i am learning java if else : " + i + i++ + i);
		}
		System.out.println("main end " + i);
	}
}
