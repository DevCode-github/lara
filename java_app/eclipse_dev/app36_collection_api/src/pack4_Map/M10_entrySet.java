package pack4_Map;

import java.util.HashMap;
import java.util.Set;

@SuppressWarnings({"unchecked","rawtypes"})
public class M10_entrySet {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("test", 100);
		map.put("abc", 200);
		map.put("k1", 500);
		map.put("hello", 500);
		Set entries = map.entrySet();
		for(Object obj : entries) {
			System.out.println(obj);
		}
	}
}
