package api;

import java.util.HashMap;
import java.util.Map;

public class CollectionTest03 {
	public static void main(String[] args) {
		Map<String, FriendVO> friendMap= new HashMap<String, FriendVO>();
		friendMap.put("고민철", new FriendVO("010-1111-1111", 26, 1));
		friendMap.put("고민철1", new FriendVO("010-1111-1121", 21, 2));
		friendMap.put("야임마", new FriendVO("010-1111-1311", 23, 1));
		friendMap.put("왜임마", new FriendVO("010-1111-4111", 24, 2));
		friendMap.put("그냥임마", new FriendVO("010-1111-5111", 26, 1));
		friendMap.put("그래임마", new FriendVO("010-1111-1611", 25, 2));
		friendMap.put("고맙다임마", new FriendVO("010-1111-8111", 27, 1));
		
		for(String key:friendMap.keySet()){
		
			FriendVO friendVO = friendMap.get(key); 
			System.out.print(key + "의 전화번호는 " + friendVO.getPhone());
			System.out.print(", 나이는 " + friendVO.getAge() + "이며 ");
			System.out.print(friendVO.getGender() == 1 ? "남자" : "여자" );
			System.out.println("입니다.");
		}
		System.out.println(friendMap.get("고민철1"));
	}

}
