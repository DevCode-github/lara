package pack5_Generics;

class E<a>{
	a field;
}
public class M5_generic_class {
	public static void main(String[] args) {
		E<String> e1 = new E<String>();
		e1.field = "abc";
		
		E<Integer> e2 = new E<Integer>();
		e2.field = 32;
		
		E<Double> e3 = new E<Double>();
		e3.field = 3.4;
		
		E<Boolean> e4 = new E<Boolean>();
		e4.field = false;
		
		System.out.println("done");
	}
}
