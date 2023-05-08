package pack4_Map;

import java.util.LinkedHashMap;

@SuppressWarnings({"unchecked","rawtypes"}) 
public class M13_LinkedHashMap {
	public static void main(String[] args) {
		LinkedHashMap map = new LinkedHashMap();
		map.put("abc", 100);
		map.put("xyz", 200);
		map.put("test", 300);
		map.put("k1", 400);
		map.put("r3", 500);
		map.put(400, 600);
		map.put(4.5, 700);
		System.out.println(map);
	}
}
