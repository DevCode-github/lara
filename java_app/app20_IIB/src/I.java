class I 
{
	static int counter;
	I()
	{
		
	}
	I(int i)
	{
		
	}
	I(int i, int j)
	{
		
	}
	{
		counter++;
	}
	public static void main(String[] args) 
	{
		I i1 = new I();
		I i2 = new I(12);
		I i3 = new I(2,3);
		I i4 = new I();
		I i5 = new I();
		System.out.println(counter);
	}
}
