package pack4_Map;

import java.util.HashMap;
import java.util.TreeMap;

@SuppressWarnings({"unchecked","rawtypes"})
public class M14_TreeMap {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(100, "test");
		map.put(10, "test1");
		map.put(0, "test2");
		map.put(500, "test4");
		map.put(200, "test8");
		map.put(400, "test9");
		map.put(800,"test10");
		System.out.println(map);
		
		TreeMap map1 = new TreeMap();
		map1.put(900, "test11");
		map1.putAll(map);
		System.out.println(map1);
	}
}
