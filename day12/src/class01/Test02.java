package class01;

import java.util.HashMap;
import java.util.Map;

//컬렉션
//맵
public class Test02 {
	public static void main(String[] args) {
	
	// key - value
	//키 값 - 데이터 값  이 한쌍
	//키 : 다른 데이터와 중복되어서는 안된다. == PK
	//데이터 : 실제 데이터 중복 가능
	//Map<키 값의 자료형,데이터의 자료형>map = new HashMap<INteger, String>();
		 Map<Integer, String> map = new HashMap<Integer, String>();
	map.put(1001,"홍길동");
	 map.put(1002, "아무무");
	 System.out.println(map.containsKey(1001));
     System.out.println(map.containsValue("티모"));
     System.out.println(map.get(1003));
     //map.clear();
     //System.out.println(map.isEmpty());
     System.out.println(map.size());
	//map.clear();
	System.out.println();
	System.out.println(map);
	
	
	
	
	
	}
}
