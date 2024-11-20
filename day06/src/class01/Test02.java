package class01;

//반지름
//넓이 = 반지름 * 반지름 * PI(3.14)
class Circle{
	String name;
	int radius;//반지름
	double area;//넓이
	static final double PI = 3.14;//원주율
	//객체c1의 값을 변경해도
	//객체c2의 값에 영향xxx==>객체와 무관하게
	//주인이 객체x 클래스o
	Circle(String name, int radius){
		//생성자의 역할 : 멤버변수 초기화
		this.name=name;
		this.radius=radius;
		this.area=this.radius*this.radius*Circle.PI;
	
	}

}


public class Test02 {
	public static void main(String[] args) {
		Circle c1=new Circle("원01",1);
		Circle c2=new Circle("원02",2);
		
		
	}
}
