package pack1_ArrayList_sort_lambda_iterator;

import java.util.ArrayList;
import java.util.Collections;

class Name{
	String firstName;
	String lastName;
	Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String toString() {
		return "(" + firstName + ", " + lastName + ")";
	}
}
public class M44_lambda_expression {
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Name("abc", "xyz"));
		list.add(new Name("efg", "tuw"));
		list.add(new Name("ijk", "qpr"));
		list.add(new Name("mno", "mno"));
		list.add(new Name("qpr", "ijk"));
		list.add(new Name("tuw", "efg"));
		list.add(new Name("xyz", "abc"));
		System.out.println(list);
		Collections.sort(list, (o1,o2)->((Name)o1).firstName.compareTo(((Name)o2).firstName));
		System.out.println(list);
		Collections.sort(list, (o1,o2)->((Name)o1).lastName.compareTo(((Name)o2).lastName));
		System.out.println(list);
	}
}
