package pack4_Map;

import java.util.HashMap;

public class M3_HashMap_put {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		HashMap map = new HashMap();
		/*
		 * put() : replacing the previous values with current value if identical keys. 
		 */
		System.out.println(map.put("abc", 100));
		System.out.println(map);
		System.out.println(map.put("abc", 101));
		System.out.println(map);
		System.out.println(map.put("abc", 102));
		System.out.println(map);
		System.out.println(map.put("abc", 103));
		System.out.println(map);
		System.out.println(map.put("abc", 104));
		System.out.println(map);
	}
}
