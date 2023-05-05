package pack4_Map;

import java.util.HashMap;

public class M5_HashMap {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("k1", null);
		map.put("k2", 100);
		map.put("k3", null);
		map.put("k4", null);
		map.put("k5", 100);
		map.put("k6", 100);
		map.put("k7", 100);
		System.out.println(map);
	}
}
