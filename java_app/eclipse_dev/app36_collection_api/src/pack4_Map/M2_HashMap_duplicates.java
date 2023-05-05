package pack4_Map;

import java.util.HashMap;

public class M2_HashMap_duplicates {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("abc", 120);
		map.put("abc", 121);
		map.put("abc", 122);
		map.put("abc", 123);
		map.put("abc", 124);
		map.put("abc", 125);
		map.put("abc", 129);		
		System.out.println(map);
	}
}
