class G 
{
	public static void main(String[] args) 
	{
		int i = 6;
		int j = i-- + i + i-- + i + i--;
		//      6     5    5     4   4
		System.out.println(i);//3
		System.out.println(j);//24
	}
}
