package pack4_Map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

@SuppressWarnings({"unchecked","rawtypes"})
public class M12_Hashtable {
	public static void main(String[] args) {
		/*
		 * Will not allow null as	 a key or value.
		 * Hashtable is Synchronized.
		 */
		Hashtable table = new Hashtable();
		table.put("abc", "test");
		table.put("xyz", false);
		table.put("test", 500);
		table.put("hello", 'd');
//		table.put("null", null);
		System.out.println(table);
		Enumeration e = table.elements();
		Iterator it = e.asIterator();
		while(it.hasNext()) {
			System.out.println(it.getClass());
		}
		
	}
}
