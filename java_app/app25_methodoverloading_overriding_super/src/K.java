class A{
	protected void test(){
		System.out.println("from A-test");
	}
}
class K extends A{
	void test(){
		System.out.println("from G-test");
	}
	public static void main(String[] args){
		K obj = new K();
		obj.test();
	}
}
