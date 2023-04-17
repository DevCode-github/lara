class G 
{
	int i;
	G()
	{
		this.i = 100;
	}
	public static void main(String[] args) 
	{
		G g1 = new G();
		System.out.println("main:" + g1.i);
	}
}
