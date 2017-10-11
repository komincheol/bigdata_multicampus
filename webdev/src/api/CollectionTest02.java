package api;

import java.util.HashMap;
import java.util.Map;

public class CollectionTest02 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("브래드피트", "010-1111-1111");
		map.put("하이", "010-1111-1112");
		map.put("넌", "010-1111-1113");
		map.put("is", "010-1111-1114");
		map.put("뭔들", "010-1111-1115");
		map.put("쿠쿠", "010-1111-1116");
		map.put("켜켜", "010-1111-1117");
		
	//System.out.println(map.get("켜켜"));
	for(String key:map.keySet()){
		System.out.println(key);
	}
	}

}
