package class06;

import java.util.Random;

//학생클래스 선언
//이름, 성적
//반드시 (강제)이름을 가져한다.
class Student01{
	String name;
	int result;

	Student01(String name){//성적을 초기화하지 않음
		this.name=name;
		Random rand=new Random();
		this.result = rand.nextInt(101);
	}
		void hello(){
			System.out.print(this.name);
			System.out.println(this.result);
		}
		

}



public class Test02 {
	//성적이 0~100점사이로 랜덤 저장
	//학생이 hello()인사를 하면
	//이름과 성적을 화면에 출력
	
 


	public static void main(String[] args) {
		Student01 pika = new Student01("피카츄");
		//pika.name="피카츄";// . 멤버(변수)접근 연산자 
		Student01 fire = new Student01("파이리");
		
		pika.hello();
		fire.hello();
		
	}
}
