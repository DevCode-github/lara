package pack4_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

@SuppressWarnings({"unchecked","rawtypes"})
public class M9_HashMap_iterator {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("test", 100);
		map.put("abc", 200);
		map.put("k1", 500);
		map.put("hello", 500);
		map.put(null, null);
		Set keys = map.keySet();
		Iterator it = keys.iterator();
		Object obj;
		while (it.hasNext()) {
			obj = it.next();
			it.remove();
			System.out.println(obj + " : " + map.get(obj));
		}
		System.out.println(map.size());
	}
	}
