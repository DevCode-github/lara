package pack4_Map;

import java.util.HashMap;
import java.util.Set;
@SuppressWarnings({"unchecked","rawtypes"})
public class M8_HashSet_keys {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("test", 100);
		map.put("abc", 200);
		map.put("k1", 500);
		map.put("hello", 500);
		map.put(null, null);
		Set keys = map.keySet();
		for (Object obj: keys) {
			System.out.println(obj + ":" + map.get(obj));
		}
	}
}
