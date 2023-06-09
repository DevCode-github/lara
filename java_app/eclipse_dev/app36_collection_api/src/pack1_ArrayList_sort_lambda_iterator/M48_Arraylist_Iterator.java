package pack1_ArrayList_sort_lambda_iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class M48_Arraylist_Iterator {
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(91);
		list.add(92);
		list.add(93);
		list.add(94);
		list.add(95);
		list.add(96);
		list.add(97);
		list.add(98);
		Iterator it = list.iterator();
		Object obj;
		//list.add(500);
		/**
		 * fail-fast iterator not allowing concurrent modification
		 */
		while(it.hasNext()) {
			obj = it.next();
			it.remove();
			System.out.println(obj + ", ");
		}
		
		System.out.println(list.size());
		for(Object ob : list) {
			System.out.println(ob);
		}
		/**
		 * public interface java.util.Iterator<E> {
					public abstract boolean hasNext();
					public abstract E next();
					public default void remove();
					public default void forEachRemaining(java.util.function.Consumer<? super E>);
		   }
		 */
	}
}
