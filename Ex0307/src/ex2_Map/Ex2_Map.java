package ex2_Map;

import java.util.HashMap;

public class Ex2_Map {
	public static void main(String[] args) {
		HashMap<String, Float> map = new HashMap<String, Float>();
		map.put("k1", 100.0f);
		map.put("k2", 3.14f);
		map.put("k3", 1.23f);
		
		//알고있으면 도움이 되는 메서드
		//containsKey(key) : 해당 map 객체에 key값이 존재하면 true, 없으면 false
		if(map.containsKey("k3")) {
			System.out.println("k3라는 key가 존재합니다.");
		}
		
		//containsValue(value) : 해당 map 객체에 Value값이 존재하면 true, 없으면 false
		if(map.containsValue(3.14f)) {
			System.out.println("map은 3.14라는 value를 가지고 있습니다.");
		}
	}
}
