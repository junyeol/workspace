package class05;

import java.util.Random;

class Student02 {
	String name;
	int score;
	char grade;
	Student02(String name){
		this.name=name;
		this.score=new Random().nextInt(101);
		/*
		어? 코드를 복사하네? 코드를 재사용하네?
		== 함수화
		if(this.score>=80) {
			this.grade='A';
		}
		else if(this.grade>=60) {
			this.grade='B';
		}
		else {
			this.grade='C';
		}
		*/
		setGrade();
	}
	void hello() {
		System.out.println(this.name);
		System.out.println(this.score);
		System.out.println(this.grade);
	}
	void test() {
		this.score+=10;
		if(this.score>100) {
			this.score=100;
		}
		setGrade();
	}
	void setGrade() {
		if(this.score>=80) {
			this.grade='A';
		}
		else if(this.score>=60) {
			this.grade='B';
		}
		else {
			this.grade='C';
		}
	}
}

public class Test02 {
	public static void main(String[] args) {
		Student02 stu=new Student02("아리");
		
		stu.hello();
		stu.test();
		stu.hello();
		
		
		
		
		
		
		
		
		
		
	}
}
