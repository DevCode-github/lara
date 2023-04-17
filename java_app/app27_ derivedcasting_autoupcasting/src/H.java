class H{
	static D test1(){
		D d1 = new D();
		return d1;
	}
	public static void main(String[] args){
		A a1 = test1();
		B b1 = test1();// B b1 = (b) test1();
		C c1 = test1();
		System.out.println("done");
	}
}
