package app2_anonymousinner_classes;
class C {
	C() {
		System.out.println("C()");
	}
	{
		System.out.println("C-iib");
	}
}
public class D extends C{
	D() {
		System.out.println("()");
	}
	{
		System.out.println("D-iib");
	}
}
