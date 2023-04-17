class A extends Object //predefined class
{
	A()
	{
		System.out.println("A()");
	}
}
class B extends A
{
	B()
	{
		System.out.println("B()");
	}
}

class I extends B
{
	I()
	{
		System.out.println("I()");
	}
	public static void main(String[] args) 
	{

		System.out.println("main begin");
		I obj1 = new I();
		System.out.println("main end");
	}
}
//3 contract
//
//1.Every class minimum one constructor
//2.In every constructor body there should be super or this in first line,if not compiler will keep super with no argument
//3.If there is a class without extend compiler will keep extends object.

//object class containing only one constructor