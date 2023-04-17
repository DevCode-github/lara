class Z2
{
	enum Gender {MALE, FEMALE};
	public static void main(String[] args) 
	{
		Gender g1 = Gender.FEMALE;
		switch (g1)
		{
		case MALE:
			System.out.println("Male");
			break;
		case FEMALE:
			System.out.println("Female");
			break;
		}
		System.out.println("end");
	}
}
