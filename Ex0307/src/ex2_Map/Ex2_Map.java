package ex2_Map;

import java.util.HashMap;

public class Ex2_Map {
	public static void main(String[] args) {
		HashMap<String, Float> map = new HashMap<String, Float>();
		map.put("k1", 100.0f);
		map.put("k2", 3.14f);
		map.put("k3", 1.23f);
		
		//�˰������� ������ �Ǵ� �޼���
		//containsKey(key) : �ش� map ��ü�� key���� �����ϸ� true, ������ false
		if(map.containsKey("k3")) {
			System.out.println("k3��� key�� �����մϴ�.");
		}
		
		//containsValue(value) : �ش� map ��ü�� Value���� �����ϸ� true, ������ false
		if(map.containsValue(3.14f)) {
			System.out.println("map�� 3.14��� value�� ������ �ֽ��ϴ�.");
		}
	}
}
