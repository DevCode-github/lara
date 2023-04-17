interface A{
	void test1();
}
class P implements A{
	public void test1(){
		System.out.println("from test1");
	}
	public static void main(String[] args){
		P p1 = new P();
		p1.test1();
		System.out.println("done");
	}
}
