package class01;

abstract class Shape { // abstract 추상 클래스
   private String name;
   protected double area;
   Shape(String name){
      this.name=name;
      this.area=0.0;
   }
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

class Circle extends Shape {
   private int radius;
   static final double PI=3.14;
   Circle(int radius){
      super("원");
      this.radius=radius;
      this.area=this.radius*this.radius*Circle.PI;
   }
   public int getRadius() {
      return radius;
   }
   public void setRadius(int radius) {
      this.radius = radius;
   }
}

public class Test02 {
   public static void main(String[] args) {

      //Shape s=new Shape("모양");
      // 추상 클래스로는 객체화(인스턴스화) 할 수 없음!!!
      // 객체를 생성하려고 존재하는게 아니라,
      // 클래스들을 정의하려고 존재하기때문에!!!!!
      //  == 클래스들의 틀
      
      
      
      
      
      
      
      
   }
}
