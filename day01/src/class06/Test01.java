package class06;
//특정 멤버변수의 값을 반드시 넣도록 "강제"하고싶을때?
//"강제" : 개발할때 강제하다 좋은것! 실수를 줄여준다!
//멤버변수의 값을 '강제'하고싶을때
// == 생성자를 선언(정의)하면된다

class pokemon{
	String name;
	int level;
	int exp;
	
	pokemon(String name){
		this.name=name;
		//외부에서 받아온 name 값을
		//멤버변수 name에 저장
		this.level=5;
		this.exp=0;//모든 멤버변수 초기화를 직접 작성하는것을 권장
	}
	
	void hello() {
		System.out.println(this.name);
		System.out.println("Lv"+this.level);
		System.out.println("exp"+this.exp);
	}
}


public class Test01 {
	public static void main(String[] args) {
		
		pokemon pika = new pokemon("피카츄");
		//pika.name="피카츄";// . 멤버(변수)접근 연산자 
		pokemon fire = new pokemon("파이리");
		//fire.name="파이리";
		
		pika.hello();
		fire.hello();
	}
}
