package pack5_Generics;

class D{
	D(Integer a1) {
		System.out.println("D(int)");
	}
}
public class M4 {
	public static void main(String[] args) {
		D d1 = new D(9);
		D d2 = new D(9);
		D d3 = new D(19);
		D d4 = new D(92);
	}
}
