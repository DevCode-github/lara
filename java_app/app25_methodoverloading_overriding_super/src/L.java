class A{
	protected void test(){
		System.out.println("from A-test");
	}
}
class L extends A{
	public void test(){
		System.out.println("from L-test begin");
		super.test();
		System.out.println("from L-test end");
	}
	public static void main(String[] args){
		L obj = new L();
		obj.test();
	}
}
