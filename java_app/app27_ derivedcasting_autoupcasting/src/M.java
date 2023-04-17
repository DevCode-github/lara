class M{
	public static void main(String[] args){
		A a1 = new C();
		if (a1 instanceof A){
			System.out.println("converting into A");
			A a2 = (A) a1;
			a2.test1();
		}
		if (a1 instanceof B){
			System.out.println("converting into B");
			B b2 = (B) a1;
			b2.test2();
		}
		if (a1 instanceof C){
			System.out.println("converting into C");
			C c2 = (C) a1;
			c2.test3();
		}
		if (a1 instanceof D){
			System.out.println("converting into D");
			D d2 = (D) a1;
			d2.test4();
		}
	}
}
