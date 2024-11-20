package thread;

// [스레드]
//  : 실질적으로 일을 수행하는 주체
class Thread01 extends Thread {

   @Override
   public void run() {
      for(int i=1;i<=10;i++) {
         System.out.println(i+" 첫번째 스레드 일하는 중.....");
      }
   }

}

// 인터페이스를 "강제"할때 쓰는 이유 == 추상 메서드의 오버라이딩 "강제"
class Thread02 implements Runnable {

   @Override
   public void run() {
      for(int i=1;i<=10;i++) {
         System.out.println(i+" 두번째 스레드 일하는 중.....");
      }
   }

}

public class Test01 {
   public static void main(String[] args) {

      Thread01 t1=new Thread01();
      Thread t2=new Thread(new Thread02());

      t1.start();
      t2.start();

      /*
      앱:사용자가 실행시킨 SW
백그라운드 프로세스:원래 수행중인 SW

앱(어플리케이션) == SW == 프로그램
프로세스 == 작업 == 실행중인 프로그램 == 메모리를 할당받은 프로그램

사용자가 설치한 것은 프로그램
프로그램을 더블클릭해서 실행시키면(메모리,CPU,자원을 할당하면) 프로세스
프로세스에서 실질적으로 일을 수행하는 주체 == 스레드
★ 병렬적으로, 개별적으로, 비동기적으로 일을 수행함
결론) 스레드가 일을 수행하면서 화면에 무언가 출력을 할텐데,
            출력되는 순서가 랜덤이다!
       */

      for(int i=1;i<=5;i++){
         System.out.println(i+"초...");
         try {
            Thread.sleep(1000);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }









   }
}
