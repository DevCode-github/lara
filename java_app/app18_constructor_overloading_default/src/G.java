class G 
{
	int i,j;
	G(int arg1, int arg2)
	{
		i = arg1;
		j = arg2;
	}
	public static void main(String[] args) 
	{
		G g1 = new G(10,20);
		System.out.println(g1.i + ", " + g1.j);
		G g2 = new G(130,209);
		System.out.println(g2.i + ", " + g2.j);
		G g3 = new G(110,201);
		System.out.println(g3.i + ", " + g3.j);
	}
}
