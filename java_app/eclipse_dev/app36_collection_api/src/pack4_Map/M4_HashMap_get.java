package pack4_Map;

import java.util.HashMap;

public class M4_HashMap_get {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("k1", "hello");
		map.put("k2", 300);
		map.put("k3", "hello");
		map.put("k4", 4.5);
		map.put("k5", "hello");
		map.put("k6", true);
		System.out.println(map);
		System.out.println(map.get("k1"));
		System.out.println(map.get("k2"));
		System.out.println(map.get("k6"));
		System.out.println(map.get("k7"));//returns null, since there is no "k7" key in map.
	}
}
