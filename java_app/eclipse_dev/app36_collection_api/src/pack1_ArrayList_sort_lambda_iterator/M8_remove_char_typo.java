package pack1_ArrayList_sort_lambda_iterator;
/**
 * remove(int x) will be prefered over remove(Object obj) while using primitive character since auto widening has more precedence than auto boxing 
 * */
public class M8_remove_char_typo {
	static void test(int i) {
		System.out.println("int" + i);
	}
	static void test(Character c1) {
		System.out.println("char" + c1);
	}
	public static void main(String[] args) {
		test('t');
	}
}
