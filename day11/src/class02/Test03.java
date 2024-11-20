package class02;

abstract class Shape { // abstract 추상 클래스
   private String name;
   protected double area;
   Shape(String name){
      this.name=name;
      this.area=0.0;
   }

   // 메서드는 쓰라고 만드는거라서,
   // public 공개정책을 사용
   abstract public void draw();
   // abstract이 붙은 메서드를
   // "추상 메서드"라 부른다.
   // "오버라이딩 강제"하는 역할!!!!!★
   // 기능의 내용이 필요없기때문에,
   // {} 메서드 바디가 필요없음!

   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public double getArea() {
      return area;
   }
   public void setArea(double area) {
      this.area = area;
   }
   @Override
   public String toString() {
      return this.name+"의 넓이 : "+this.area;
   }
}

class Rect extends Shape {
   int x;
   int y;
   Rect(int x,int y){
      super("네모"); ////////
      this.x=x;
      this.y=y;
      this.area=this.x*this.y;
   }
   @Override
   public void draw() {
      System.out.println("네모 그리기"); ////////
   }
}

class Circle extends Shape {
   private int radius;
   static final double PI=3.14;
   Circle(int radius){
      super("원");
      this.radius=radius;
      this.area=this.radius*this.radius*Circle.PI;
   }


   @Override
   public void draw() {
      System.out.println("동그라미 그리기");
      // 개발자가 실수로라도 빠뜨리는 일없이 구현할수있다!!!!!
   }

   public int getRadius() {
      return radius;
   }
   public void setRadius(int radius) {
      this.radius = radius;
   }



}

public class Test03 {
   public static void main(String[] args) {

      //Shape s=new Shape("모양");
      // 추상 클래스로는 객체화(인스턴스화) 할 수 없음!!!
      // 객체를 생성하려고 존재하는게 아니라,
      // 클래스들을 정의하려고 존재하기때문에!!!!!
      //  == 클래스들의 틀

      Circle c=new Circle(10);
      System.out.println(c);

















   }
}

