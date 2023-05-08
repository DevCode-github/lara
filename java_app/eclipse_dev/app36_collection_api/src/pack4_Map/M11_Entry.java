package pack4_Map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

@SuppressWarnings({"unchecked","rawtypes"})
public class M11_Entry {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("test", 100);
		map.put("abc", 200);
		map.put("k1", 500);
		map.put("hello", 500);
		Set entries = map.entrySet();
		Entry entry;
		for(Object obj : entries) {
			entry = (Entry)obj;
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
