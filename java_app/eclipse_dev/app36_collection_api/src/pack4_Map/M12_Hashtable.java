package pack4_Map;

import java.util.Hashtable;

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
	}
}
