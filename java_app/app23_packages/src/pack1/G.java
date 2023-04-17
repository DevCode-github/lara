package pack1;
class E
{
	private E()
	{
		System.out.println("E()");
	}
}
class G extends E
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main end");
	}
}
