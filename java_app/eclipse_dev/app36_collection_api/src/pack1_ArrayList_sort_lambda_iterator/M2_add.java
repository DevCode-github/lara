package pack1_ArrayList_sort_lambda_iterator;
import java.util.ArrayList;
public class M2_add {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(199);
		list.add(19.5);
		list.add("199");
		list.add("abc");
		list.add('t');
		System.out.println(list);
		list.add(2,"hello");
		System.out.println(list);
		list.add(list.size(),"at the index "+list.size());
		System.out.println(list);
	}
}