//Sequential || parallel if
class A 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(false){
			System.out.println("if1");
		}
		if(true){
			System.out.println("if2");
		}
		if(true){
			System.out.println("if3");
		}
		System.out.println("main end");
	}
}
