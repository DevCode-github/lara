package StringBuffer;

public class S2_capacity {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer();
		System.out.println(s1.capacity());
		s1.append("rama");
		s1.append("rama");
		s1.append("rama");
		s1.append("rama");
		
		System.out.println(s1.capacity());
		
	}
}
