package pack3_Set;

public class M7_hashCode_equals {
	public static void main(String[] args) {
		String s1 = "dfsffdsfdfsdf,fdsf$r455454#$%^%!$";
		String s2 = "dfsffdsfdfsdf,fdsf$r455454#$%^%!$";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2));
		System.out.println("-----------");
		
		A a1 = new A(90);
		A a2 = new A(90);
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a1.equals(a2));
		
	}
}
