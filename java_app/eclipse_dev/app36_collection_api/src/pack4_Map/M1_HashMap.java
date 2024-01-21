package pack4_Map;

import java.util.HashMap;

public class M1_HashMap {
	@SuppressWarnings({"rawtypes", "unchecked"})
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("abc", 35);
		map.put("key1", 315);
		map.put(34, true);
		map.put(314, "abc");
		map.put(134, "test");
		map.put(341, 'r');
		map.put("abc", 35);
		System.out.println(map.get("dsfs"));
		System.out.println(map);
	}
}