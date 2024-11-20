package class03;



//모양 클래스를 부모클래스로
//원과 사각형 클래스를 자식클래스로 만든다.
//모양클래스에는 이름을 강제하고 색의 초기값은 검정으로 한다.
//원클래스에는 반지름의 초기값을 1로 잡는다.

class Shape{//부모 클래스
	String name;
	double area;// 넓이
	String color;// 색
	
	void draw() {
		System.out.println(this.color+"색"+" 누구의 모양은"+this.area+"만큼의 넓이");
	}
	Shape(String name){
		this.name = name;
		this.color = "검정";
		//넓이의 초기값을 넣지 않았다. double area =0.0;
	}
	Shape(String name, String color){
		this.name = name;
		this.color = color;
		//오버로딩 되었기 때문에 코드 생략 가능했다.
	}
}
	class Circle extends Shape{//자식 클래스
		int radius;// 반지름
		static final double PI = 3.14;//파이는 바뀌지 않는다.final 상수화
		//static은 클래스 변수이기 때문에 이곳에서 바로 초기화 시킨다.
		Circle(String name){//이름만 입력받음
			this(name, "검정", 1);
		}
		
		Circle(String name,String color){//이름과 색깔을 입력받음
			this(name, color, 1);
			
		}
		
		Circle(String name, String color,int radius){//이름,색깔, 반지름을 입력받음
			
			super(name,color);
			this.radius = radius;
			
			this.area=this.radius*this.radius*Circle.PI;
		}
	}
	class Rectangle extends Shape{
		int x, y;//가로 세로
		//x*y=area
		Rectangle(int x){
			x = y;
			
		}
		Rectangle(int x,int y){
			this.x = x;
			this.y = y;
		}
	
	}





public class Test01 {

	public static void main(String[] args) {
		Circle sh = new Circle("원");
		sh.draw();
		
		
		
		
	}
}
