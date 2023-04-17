class V
{
	public static void main(String[] args) 
	{
		int i = Integer.parseInt(args[0]);
		if (i<=30 && i>=0)
		{
			System.out.println("fail");
		}
		else if (i>30 && i<=40)
		{
			System.out.println("your grade : E");
		}
		else if (i>40 && i<=50)
		{
			System.out.println("your grade : D");
		}
		else if (i>50 && i<=60)
		{
			System.out.println("your grade : C");
		}
		else if (i>60 && i<=70)
		{
			System.out.println("your grade : B");
		}
		else if (i>80 && i<=90)
		{
			System.out.println("your grade : A");
		}
		else if (i>90 && i<=100)
		{
			System.out.println("your grade : S");
		}
	}
}