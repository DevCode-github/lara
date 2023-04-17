class G 
{
	static int i;
	G()
	{
		i++;
	}
	public static void main(String[] args) 
	{
		G g1 = new G();
		G g2 = new G();
		G g3 = new G();
		G g4 = new G();
		System.out.println(i);
	}
}
