package app2_anonymousinner_classes;

public class M10 {
	public static void main(String[] args) {
		D d1 = new D();
		System.out.println("---------");
		D d2 = new D() {
			{
				System.out.println("Aic-D");
			}
		};
	}
}
