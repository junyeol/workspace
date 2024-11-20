package class01;

import java.util.Random;

//주민 클래스 
//주민의 타입과 이름을 강제 한다
//주민이 인사하면 행복함 무난함 슬픔 화남 중에 1개 랜덤 출력
//고양이와 개구리에게 오버라이딩해서 고양이가 행복하면 야옹
//개구리가 무난하면 개굴로 오버라이딩 하자
//액션 도구를 쥐어주면
//잠자리채는 곤충채집
//낚시대는 생선낚시
//삽은 땅파기
//일단 해보면서 어케할지 정해보자
class Tool {
	   String name;
	   Tool(String name){
	      this.name=name;
	   }
	   void action() {
	      
	   }
	}
	class Fishing extends Tool {
	   Fishing(){
	      super("낚시대");
	   }
	   @Override
	   void action() {
	      System.out.println("생선낚시");
	   }
	}
	class Dragonfly extends Tool {
	   Dragonfly(){
	      super("잠자리채");
	   }
	   @Override
	   void action() {
	      System.out.println("곤충채집");
	   }
	}
	// 도구는 태어날때 부터 가지는 것이 아닌
	// 시스템에서 주어지는 것
	
	class Animal {
	   String type;
	   String name;
	   static String[] datas= {"행복해요","무난합니다","슬퍼요","화났어요"};
	   static Random rand=new Random();
	   Animal(String type,String name) {
	      this.type=type;
	      this.name=name;
	   }
	   void hello() {
	      // [1] 0 -> 행복, 1 -> 무난, ... : if문
	      // [2] 감정[] = {행복함 / 무난함 / 슬픔 / 화남} : 배열
	      int randNum=Animal.rand.nextInt(Animal.datas.length);
	      System.out.print(Animal.datas[randNum]+",");
	   }
	   void action(Tool tool) {
	      tool.action(); // 동적바인딩 -> 다형성 실현
	   }
	   @Override
	   public String toString() {
	      return this.type+" 주민 "+this.name;
	   }
	}
	class Cat extends Animal {
	   Cat(String name){
	      super("고양이",name);
	   }
	   @Override
	   void hello() {
	      super.hello();
	      System.out.println("야옹");
	   }
	}
	class Frog extends Animal {
	   Frog(String name){
	      super("개구리",name);
	   }
	   
	   @Override
	   void hello() {
	      super.hello();
	      System.out.println("개굴");
	   }
	}

	public class Test02 {
	   public static void main(String[] args) {
	      
	      Animal[] datas=new Animal[3];
	      datas[0]=new Cat("1호");
	      datas[1]=new Frog("레이니");
	      datas[2]=new Frog("아이다");
	      
	      for(int i=0;i<datas.length;i++) {
	         datas[i].hello();
	      }
	      /*
	      for(배열의 타입  변수명:배열의 이름) {
	         datas[i].hello();
	      }
	      */
	      for(Animal animal:datas) {
	         animal.hello();
	      }
	      
	      for(Animal animal:datas) {
	         Tool tool=new Dragonfly();
	         animal.action(tool);
	      }
	      
	      for(Animal animal:datas) {
	         System.out.println(animal);
	         System.out.println(animal.toString());
	      }
   
	      
	   }
	}

