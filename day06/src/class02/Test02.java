package class02;

import java.util.Scanner;

class Car{
	String name;
	int speed;
	int maxSpeed;
	Car(){
		this.name="무명";
		this.speed=0;
		this.maxSpeed=120; 

		Scanner sc=new Scanner(System.in);
		System.out.print("차주의 이름을 등록해주세요 >>");
		this.name = sc.next();

		System.out.print("원하는 최고속도를 입력해주세요 >>");
		this.maxSpeed = sc.nextInt();
		System.out.println(this.name + " 현재속도" + this.speed + " 최고속도" + this.maxSpeed);
	}
	void speedup() {//유효성 검사
		this.speed+=50;
		//만약 최고속도를 넘어가면 최고속도
		if(this.speed>this.maxSpeed) {
			this.speed=this.maxSpeed;
		}
	}
	void speedDown() {
		this.speed-=100;
		//만약 0이하로 내려가면 0
		if(this.speed<0) {
			this.speed = 0;
		}
	}
	
}



public class Test02 {
	public static void main(String[] args) {

		
		Car c1=new Car();
		c1.speedup();
		System.out.println(c1.speed);
		
		Car c2=new Car();
		c2.speedDown();
		
		
	}
}
