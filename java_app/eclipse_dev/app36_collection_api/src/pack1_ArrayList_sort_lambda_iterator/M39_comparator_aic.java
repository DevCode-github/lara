package pack1_ArrayList_sort_lambda_iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person{
	String firstName;
	String lastName;
	int age;
	Person() {}
	Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public String toString() {
		return "(" + firstName +" " + lastName + " : " + age + ")";
	}
}
public class M39_comparator_aic {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Person("divyanshu", "kumar", 24));
		list.add(new Person("abc", "qpr", 28));
		list.add(new Person("efg", "mno", 27));
		list.add(new Person("ijk", "ijk", 26));
		list.add(new Person("mno", "efg", 25));
		list.add(new Person("qpr", "abc", 24));
		System.out.println(list);
		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				return ((Person)o1).firstName.compareTo(((Person)o2).firstName);
			}
		});
		System.out.println(list);
		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				return ((Person)o1).lastName.compareTo(((Person)o2).lastName);
			}
		});
		System.out.println(list);
		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				return ((Person)o1).age - ((Person)o2).age;
			}
		});
		System.out.println(list);
	}
}
