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
		int position = 6;
		/**
		 * Finding the index for the position that is 5 in this case
		 */
		while((it.nextIndex()-1) != position-1) {
			if(it.nextIndex() < position && it.nextIndex() != -1 || it.previousIndex() == -1) {
				it.next();
			}
			else it.previous();
		}
		System.out.println("after adding 96.5");
		it.add(96.5);
		while(it.hasPrevious()) {it.previous();}//set to starting index
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
