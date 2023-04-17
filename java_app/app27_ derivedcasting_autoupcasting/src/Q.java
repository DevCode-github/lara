class Q{
	public static void main(String[] args){
		A a1 = new C();
		System.out.println(a1.i);
//		System.out.println(a1.j);
//		System.out.println(a1.k);
		a1.test1();
//		a1.test2();
//		a1.test3();
		if (a1 instanceof C){
			C c1 = (C) a1;
			System.out.println(c1.i);
			System.out.println(c1.j);
			System.out.println(c1.k);
			c1.test1();
			c1.test2();
			c1.test3();
		}
	}
}
