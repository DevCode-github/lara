package pack6_collections_generics;

import java.util.HashMap;

@SuppressWarnings({"unused","unchecked","rawtypes"})
public class M2_HashMap {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		HashMap<String, Integer> map1 = new HashMap<>();
		map.put(3.4,5);
		map.put("abc", true);
		map.put('a', 50.5);
		map.put(400, 'a');
		int i = (Integer)map.get(3.4);
		
		map1.put("abc", 300);
		map1.put("test", 500);
		map1.put("hello", 600);
		int j = map1.get("test");
		
		
	}
	
}
