class A{
	static void test(){
		System.out.println("from A-test");
	}
}
class J extends A{
	void test(){
		System.out.println("from G-test");
	}
	public static void main(String[] args){
		J obj = new J();
		obj.test();
	}
}
