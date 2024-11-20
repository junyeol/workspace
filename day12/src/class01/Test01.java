package class01;

import java.util.ArrayList;

//컬렉션 프레임워크
//배열리스트




public class Test01 {
	
	
	
	
	
	public static void main(String[] args) {
		//배열[] 개수가 정해져 있다
		//배열리스트 : 개수 무제한 -> 얼마나 있을지 모를 때
		//모든 컬렉션들은 자료형을 제한하지않고 저장가능하다
		//그러나, 자료형 제한없이 사용하는 것은 개발자가 불리하다.
		//자료형 "강제"를 해줘야한다.
		//==제네릭
	ArrayList al=new ArrayList();
	//ArrayList<Integer> al = new ArrayList<Integer>(); //== 제네릭 - 필수
	al.add(10);
	al.add(1, 123);//1번자리에 123을 넣어줘
	//al.clear(); //비우기 모두 지워짐
	 al.add("apple");
    al.add('A');
    boolean ans = al.contains(124);//124가 있니? 있다면 true 없다면 false
    System.out.println(ans);
    System.out.println(al.get(1));//1번자리의 아이를 보여줘
    ans = al.isEmpty();//al이 비어었니? 비어있다면 true 아니면 false
    System.out.println(ans);
    System.out.println(al);
    System.out.println(al.size()); // .length
    al.remove(1);//길이를 1줄여줘
    System.out.println(al.size());


	System.out.println(al);
	//최상위 object  클래스로부터
	//toString()을 '오버라이딩'했다.
		
		
		
		
	}
}
