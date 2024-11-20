package class01;

import java.util.HashMap;
import java.util.Map;

/*
문제 2

Point 클래스가 있습니다.
점은 x,y좌표를 속성으로 갖습니다.
x,y 좌표 위치를 반드시 정하여 point 객체를 생성합니다.
101번 점 p1, 102번 점 p2 를 생성하여
map 컬렉션으로 관리해주세요
 */
class Point {
   private int x;
   private int y;

   Point(int x,int y){
      this.x=x;
      this.y=y;
   }

   public int getX() {
      return x;
   }
   public void setX(int x) {
      this.x = x;
   }
   public int getY() {
      return y;
   }
   public void setY(int y) {
      this.y = y;
   }

   @Override
   public String toString() {
      return "Point [x=" + x + ", y=" + y + "]";
   }
}
public class Test04 {
   public static void main(String[] args) {

      Map<Integer, Point> map=new HashMap<Integer, Point>();
      
      int PK=101;
      
      map.put(PK++, new Point(10,11));
      map.put(PK++, new Point(12,22));
      map.put(PK++, new Point(100,200));
      
      System.out.println(map);
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
   }
}
