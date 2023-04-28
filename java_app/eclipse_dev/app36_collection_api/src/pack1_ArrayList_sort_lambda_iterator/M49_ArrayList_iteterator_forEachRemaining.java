package pack1_ArrayList_sort_lambda_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;
public class M49_ArrayList_iteterator_forEachRemaining {
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
		// implementing through anonymous inner class by creating interface reference
		Consumer c1 = new Consumer() {
			public void accept(Object t) {
				System.out.println("processing" + t);
			}
		};
		it.forEachRemaining(c1);	
		
		// implementing through anonymous inner class passing the passing the object directly
		it.forEachRemaining(new Consumer() {
			public void accept(Object t) {
				System.out.println("processing" + t);
			}
		});
		
		// implementing using lambda expression
		it.forEachRemaining((t) -> System.out.println("processing" + t));
		
	}
}
