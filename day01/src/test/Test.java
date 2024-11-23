package test;

import java.util.Random;

class Student{
	String name;
	int result;
	char grade;

	Student(String name){//성적 또한 초기화 하지 않았다.
		this.name=name;
		Random rand=new Random();
		this.result = rand.nextInt(101);
		//만약 성적이 이러면 C B A
		if(0<=result && result<=59) {
			this.grade='C';
			
		}
		
		else if(60<=result && result<=79) {
			this.grade='B';
		}
		else{
			this.grade='A';
		}
	//this.grade라고 했어야함	
	}
		void hello(){
			System.out.print(this.name);
			System.out.println(this.result);
			System.out.println(this.grade);
		}
		void test() {//유효성검사 하지 않음, test밑에  if문을 똑같이 한번 더쓰기 때문에
						//함수화 하여 생략 가능
			this.result+=10;
			
		}

}
public class Test {
	public static void main(String[] args) {
		
		Student pika = new Student("피카츄");
		//pika.name="피카츄";// . 멤버(변수)접근 연산자 
		Student fire = new Student("파이리");
		
		pika.hello();
		fire.hello();
}
}