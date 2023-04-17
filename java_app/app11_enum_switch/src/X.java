class X 
{
	enum Gender {MALE, FEMALE};
	public static void main(String[] args) 
	{
		Gender g1 = Gender.MALE;
		switch(g1)
		{
			case MALE:
				System.out.println("from Male");
				break;
			case FEMALE:
				System.out.println("from Female");
				break;
		}
	}
}
