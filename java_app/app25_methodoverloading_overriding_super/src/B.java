abstract class B{
	void test1(){
		System.out.println("");
	}
	public static int test1(int a, int b){
		System.out.println("int a, int b");
		return 1;
	}
	double test1(double d, String s){
		System.out.println("double d, String s");
		return 0;
	}
	private void test1(String s, char a){
		System.out.println("String s, char a");
	}
	abstract void test(String s1);
	public static void main(String[] args){
		System.out.println("main(stirng[])");
//		A a1 = new A();
//		a1.test1();
//		a1.test1(2,3);
//		a1.test1(2.3,"dfsf");
//		a1.test1("sdfsd",'a');
//	}
//	void main(String args){
//		System.out.println("main(stirng)");
//	}
//	public static void main(int args){
//		System.out.println("main(int)");
//	}
//	public static int main(){
//		System.out.println();
//		return 0;
	}
}
