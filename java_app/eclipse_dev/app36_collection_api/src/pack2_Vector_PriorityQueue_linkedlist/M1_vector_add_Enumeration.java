package pack2_Vector_PriorityQueue_linkedlist;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class M1_vector_add_Enumeration {
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.add(100);
		v1.add(101);
		v1.add(102);
		v1.add(103);
		v1.add(104);
		v1.add(105);
		v1.add(106);
		v1.add(107);
		System.out.println(v1);
		/**
		 * -Enumeration not supporting in the ArrayList.
		 * -we can read only one time, as in Iterator
		 * -only reading is possible through Enumeration
		 * -public interface java.util.Enumeration<E> {
  				public abstract boolean hasMoreElements();
  				public abstract E nextElement();
  				public default java.util.Iterator<E> asIterator();
			}
		*/
		Enumeration e1 = v1.elements();
		v1.add(108);
		while(e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}
		v1.add(109);
		while(e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}
		Iterator it = v1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
