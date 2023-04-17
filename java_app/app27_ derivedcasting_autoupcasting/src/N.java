class N{
	public static void main(String[] args){
		A a1 = new B();
		System.out.println(a1.i);
		System.out.println(a1.j);
//		B b2 = (B) a1;
//		System.out.println(b2.j);

		B b1 = new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
	}
}
