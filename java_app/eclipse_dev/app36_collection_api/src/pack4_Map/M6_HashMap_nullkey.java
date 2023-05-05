package pack4_Map;

import java.util.HashMap;

public class M6_HashMap_nullkey {
	@SuppressWarnings({"unchecked","rawtypes"})
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("test", 300);
		map.put(null, 1300);
		System.out.println(map);
	}
}
