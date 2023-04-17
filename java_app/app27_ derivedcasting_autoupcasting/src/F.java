class F{
	public static void main(String[] args){
		A a1 = new C();
		A a2 = new D();
		Object obj = new B();
		B b1 = new C();
		C c1 = new D();

		a2 = c1;
		b1 = c1;//b1 = (B) c1;
		obj = a1;
		obj = a2;
		obj = b1;
		obj = c1;//obj = (object)c1;
		System.out.println("Hello World!");
	}
}
