class O{
	public static void main(String[] args){
		B b1 = new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
//		B b2 = (B) a1;
//		System.out.println(b2.j);

		B b2 = new C();
		System.out.println(b2.i);
		System.out.println(b2.j);
		System.out.println(b2.K);
	}
}
