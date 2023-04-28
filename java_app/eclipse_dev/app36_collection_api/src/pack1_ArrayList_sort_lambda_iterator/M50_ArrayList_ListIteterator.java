package pack1_ArrayList_sort_lambda_iterator;

import java.util.ArrayList;
import java.util.ListIterator;
public class M50_ArrayList_ListIteterator {
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
		ListIterator it = list.listIterator();
		
		//iterating left to right
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		//iterating right to left
		while(it.hasPrevious()) {
			System.out.println( it.previous() );
		}
		
		
		//iterating from left till middle and finding the length
		int size = 0;
		while(it.hasPrevious()) { it.previous(); }//set to starting index
		/**
		 * Finding the length
		 */
		while(it.hasNext()) {
			it.next();
			size++;
			System.out.println("size" + size);
		}		
		while(it.hasPrevious()) { it.previous(); }//set to starting index
		while(it.nextIndex() != size/2+1) {
			System.out.println(it.next());
		}
		
		
		//replacing element in the middle and adding element after middle position
		System.out.println("replacing element in the middle and adding element after middle position");
		while(it.hasPrevious()) { it.previous(); }//set to starting index
		System.out.println(it.previousIndex());
		/**
		 * keep iterating till you reach the middle index
		 */
		while(it.nextIndex() != size/2+1) {
			it.next();
		}
		it.set(94.5);//sets at the middle index
		it.add(99);//adds after the middle index
		System.out.println("printing after set and add : ");
		while(it.hasPrevious()) {it.previous();}//set to starting index
		while(it.hasNext()) {
			System.out.println(it.next());
		}		
		
		
		//going to certain position and adding element after that
		System.out.println("going to certain position and adding element after that");
		while(it.hasPrevious()) {it.previous();}//set to starting index
		System.out.println("before adding");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		int position = 8;
		boolean match = false;
		/**
		 * Finding the index for the position that is 19 in this case, which does not exist.
		 * If it attempts to go beyond the last element,
		 * or attempts to go before the first element,
		 * it will mean that the index is out of range,
		 * catch the error, make the flag false and break the loop.
		 */
		while(position > -1) {
			if(it.nextIndex() < position || it.previousIndex() == -1) {
				try {
					it.next();
				}
				catch(Exception ex) {
					match = false;
					break;
				}
			}
			else {
				try {
					it.previous();
				}
				catch(Exception ex) {
					match = false;
					break;
				}
			}
			if(it.nextIndex() == position) {
				match = true;
				break;
			}
			
		}
		System.out.println("after adding 96.5");
		if (match) it.add(96.5);
		while(it.hasPrevious()) {it.previous();}//set to starting index
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
