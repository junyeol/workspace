package project;

import java.util.Random;
import java.util.Scanner;



class Poketmon { // 전체 포켓몬
   String type; // 타입
   String name; // 이름
   int level; // 레벨
   int exp; // 경험치

   // 랜덤 목록 (공격시 50% , 경험치 획득 , 잡을 포켓몬 랜덤 출력)
   static Random random = new Random();

   Poketmon(String type, String name) { // 생성자 함수(맴버변수 초기화)
      this.type = type; // 타입받기
      this.name = name; // 이름받기
      this.level = Poketmon.random.nextInt(5) + 1; // 1~5랜덤 레벨 받기
      this.exp = 0; // 경험치 0
   }

   void hello() { // 울음소리 메서드
      System.out.println(this.name + " " + "나는 멋쟁이~" + this.level + "레벨임" + this.exp + "경험치");
   }

   void attack() { // 공격 메서드
      int randomAttack = Poketmon.random.nextInt(2); // randomAttack에서 50%확률
      if (randomAttack == 1) { // 1이면 공격 성공
         int randomExp = Poketmon.random.nextInt(451) + 50;
         this.recieveExp(randomExp);
      } else { // 1이 아니면 실패
         System.out.println("공격 실패!!!!");
      }
   }

   void recieveExp(int randomExp) {// 공격과 경험치 획득을 분리
      // 경험치 50~500 랜덤 획득
      for (int i = 0; i < (randomExp + this.exp) / 100; i++) {
         this.levelup();// 100으로 나눈 몫 /(기존 경험치+새로얻은 경험치)는 100당 1레벨업한다.
      }
      this.exp = (randomExp + this.exp) % 100;// 100으로 나눈 나머지(기존 경험치+새로얻은 경험치)에서 100당 1레벨업한 후 남은경험치는
      // 현재 경험치가 된다.
   }

   void levelup() { // 1레벨업
      this.level++;

   }

   @Override
   public String toString() {
      return "타입" + this.type + " 이름" + this.name + " 레벨" + this.level + " 보유 경험치" + this.exp;
   }

   // void rand() { //랜덤 함수 가져가세여~
   // int randomAttack=random.nextInt(1); // 공격확률 50%
   // int randomExp=random.nextInt(451)+50; // 경험치 획득50~500
   // int randomlevel=random.nextInt(5)+1; // 새로 포획시 첫 레벨
   // }
}

class Psyduck extends Poketmon { // 선호 물 포켓몬들
   Psyduck() {
      super("물", "고라파덕");
   }

   Psyduck(String name) {
      super("물", name);
   }

   @Override
   void hello() {
      System.out.println("고라~~~~파덕~~~~~");
   }
}

class Totodile extends Poketmon {
   Totodile() {
      super("물", "리아코");
   }

   Totodile(String name) {
      super("물", name);
   }

   @Override
   void hello() {
      System.out.println("리아~~~~~~코~~~~~");
   }
}

class MimeJr extends Poketmon { // 준열 에스퍼 포켓몬
   MimeJr() {
      super("에스퍼", "흉내내");
   }

   MimeJr(String name) {
      super("에스퍼", name);
   }

   @Override
   void hello() {
      System.out.println("흉내!흉내!흉내내~~~!");
   }

   @Override
   void attack() {
      System.out.println("흉내내기");
      super.attack();
   }
}

class Togepi extends Poketmon {
   Togepi() {
      super("에스퍼", "토게피");
   }

   Togepi(String name) {
      super("에스퍼", name);
   }

   @Override
   void hello() {
      System.out.println("토게~~피리리리리리리~");
   }

   @Override
   void attack() {
      System.out.println("애교 부리기");
      super.attack();
   }
}

class Timburr extends Poketmon { // 무건 격투 포켓몬들
   Timburr() {
      super("격투", "으랏차");
   }

   Timburr(String name) {
      super("격투", name);
   }

   @Override
   void hello() {
      System.out.println("으라챠챠챠챠~~!!!!");
   }

   @Override
   void attack() {
      System.out.println("벌크업!");
      super.attack();
   }

}

class Kubfu extends Poketmon { // 무건 격투 포켓몬들
   Kubfu() {
      super("격투", "치고마");
   }

   Kubfu(String name) {
      super("격투", name);
   }

   @Override
   void hello() {
      System.out.println("배아마아~~!!!!");
   }

   @Override
   void attack() {
      System.out.println("째려보기 ㅡ3ㅡ");
      super.attack();
   }
}

class Conpang extends Poketmon {
   Conpang() {
      super("벌레", "콘팡");
   }

   Conpang(String name) {
      super("벌레", name);
   }

   @Override
   void hello() {
      System.out.println("콘팡콘팡");
   }

}

class Bee extends Poketmon {
   Bee() {
      super("벌레", "독침붕");
   }

   Bee(String name) {
      super("벌레", name);
   }

   @Override
   void hello() {
      System.out.println("독침붕~");
   }

}

public class Te {
	public static int ball() {
		System.out.println("몬스터 볼 선택");
        System.out.println("1. 몬스터 볼 2. 마스터 볼");

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int monsterBall;

        while(true){
           System.out.print("몬스터볼 선택 >> ");
           monsterBall=sc.nextInt();   

           if(1<=monsterBall&&monsterBall<=2) {
               //System.out.println("로그3");
              break;
           }
           System.out.println("다시 입력해주세요");
        }
        return monsterBall;
	}
        
       // System.out.println("로그1");
        public static int collectPoke(int monsterBall) {
        	Random random = new Random();
        	if(monsterBall==1){//일반볼
        	 
           System.out.println("일반 사용");
           int nomal = random.nextInt(10);
              return nomal;
        }
        else{//마스터볼
              //System.out.println("로그2");
              int master = random.nextInt(2);
               return master;  
           }
        }
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int cnt = 0;// 내가 가진 포켓몬 수
      String[] data = { "콘팡", "토게피", "치고마", "으랏차", "흉내내", "리아코", "고라파덕", "독침붕" };
      Poketmon[] datas = new Poketmon[8];
      // 시작화면
      Conpang conpang = new Conpang();// 콘팡
      Togepi togepi = new Togepi();// 토게피
      Kubfu kubfu = new Kubfu();// 치고마
      Timburr timburr = new Timburr();// 으랏차
      MimeJr mimejr = new MimeJr();// 흉내내
      Totodile totodile = new Totodile();// 리아코
      Psyduck psyduck = new Psyduck();// 고라파덕
      Bee bee = new Bee();// 독침붕
         // 만약 0을 누르면 돌아가고
         // 다른 숫자를 누르면 다시 입력하게 만들기

         System.out.println("=== 포켓몬 목록 ===");
         System.out.println("0번 : 도망가기");
         for (int i = 0; i < data.length; i++) {
            System.out.println((i + 1) + "번 포켓몬 : " + data[i]);
         }
         System.out.println("===============");

         int catchPoke = 0;
         int monsterBall;
         
         String name;
         while (true) {
            System.out.print("포켓몬 선택 >> ");
            catchPoke = sc.nextInt();

            if (0 <= catchPoke && catchPoke <= 8) {
               break;
            }
            System.out.println("다시 입력해주세요");
         }
         for(int i=0;i<datas.length;i++) {
        	 System.out.println(datas[i]);
         }

         if (catchPoke == 1) {
            System.out.println("앗! 야생" + data[0] + " 가(이) 나타났다!!");
            monsterBall = ball();
//            System.out.println("cnt1="+cnt);
            int percentage=collectPoke(monsterBall);
//            System.out.println("cnt2="+cnt);
//            System.out.println("a="+percentage);
            if(percentage==0) {
            	datas[cnt] =  conpang;
            	System.out.println(datas[cnt].name+"넌 내꺼얌");
                cnt++;
            }
            else {
            	System.out.println("실패");
            }
            for(int i=0;i<datas.length;i++) {
           	 System.out.println(datas[i]);
            }
            
            
            
            
            System.out.println("cnt3="+cnt);
         } else if (catchPoke == 2) {
            System.out.println("앗! 야생" + data[1] + " 가(이) 나타났다!!");
            monsterBall = ball();
//            System.out.println("cnt1="+cnt);
            int percentage=collectPoke(monsterBall);
//            System.out.println("cnt2="+cnt);
            if(percentage==0) {
            	datas[cnt] = togepi;
            	System.out.println(datas[cnt].name+"넌 내꺼얌");
                cnt++;
            }
            else {
            	System.out.println("실패");
            }
         } else if (catchPoke == 3) {
            System.out.println("앗! 야생" + data[2] + " 가(이) 나타났다!!");
            
            monsterBall = ball();
//            System.out.println("cnt1="+cnt);
            int percentage=collectPoke(monsterBall);
//            System.out.println("cnt2="+cnt);
//            System.out.println("a="+percentage);
            if(percentage==0) {
            	datas[cnt] =  kubfu;
            	System.out.println(datas[cnt].name+"넌 내꺼얌");
                cnt++;
            }
            else {
            	System.out.println("실패");
            }
            
         } else if (catchPoke == 4) {
            System.out.println("앗! 야생" + data[3] + " 가(이) 나타났다!!");
           
            monsterBall = ball();
//            System.out.println("cnt1="+cnt);
            int percentage=collectPoke(monsterBall);
//            System.out.println("cnt2="+cnt);
//            System.out.println("a="+percentage);
            if(percentage==0) {
            	datas[cnt] =  timburr;
            	System.out.println(datas[cnt].name+"넌 내꺼얌");
                cnt++;
            }
            else {
            	System.out.println("실패");
            }
            
         } else if (catchPoke == 5) {
            System.out.println("앗! 야생" + data[4] + " 가(이) 나타났다!!");
            
            monsterBall = ball();
//            System.out.println("cnt1="+cnt);
            int percentage=collectPoke(monsterBall);
//            System.out.println("cnt2="+cnt);
//            System.out.println("a="+percentage);
            if(percentage==0) {
            	datas[cnt] =  mimejr;
            	System.out.println(datas[cnt].name+"넌 내꺼얌");
                cnt++;
            }
            else {
            	System.out.println("실패");
            }
            
         } else if (catchPoke == 6) {
            System.out.println("앗! 야생" + data[5] + " 가(이) 나타났다!!");
            
            monsterBall = ball();
//            System.out.println("cnt1="+cnt);
            int percentage=collectPoke(monsterBall);
//            System.out.println("cnt2="+cnt);
//            System.out.println("a="+percentage);
            if(percentage==0) {
            	datas[cnt] =  totodile;
            	System.out.println(datas[cnt].name+"넌 내꺼얌");
                cnt++;
            }
            else {
            	System.out.println("실패");
            }
            
         } else if (catchPoke == 7) {
            System.out.println("앗! 야생" + data[6] + " 가(이) 나타났다!!");
            
            monsterBall = ball();
//            System.out.println("cnt1="+cnt);
            int percentage=collectPoke(monsterBall);
//            System.out.println("cnt2="+cnt);
//            System.out.println("a="+percentage);
            if(percentage==0) {
            	datas[cnt] =  psyduck;
            	System.out.println(datas[cnt].name+"넌 내꺼얌");
                cnt++;
            }
            else {
            	System.out.println("실패");
            }
            
         } else if (catchPoke == 8) {
            System.out.println("앗! 야생" + data[7] + " 가(이) 나타났다!!");
            
            monsterBall = ball();
//            System.out.println("cnt1="+cnt);
            int percentage=collectPoke(monsterBall);
//            System.out.println("cnt2="+cnt);
//            System.out.println("a="+percentage);
            if(percentage==0) {
            	datas[cnt] =  bee;
            	System.out.println(datas[cnt].name+"넌 내꺼얌");
                cnt++;
            }
            else {
            	System.out.println("실패");
            }
            
         } else {
            System.out.println("오박사 : 제대로 선택해주길 바라네~");
         }

//         System.out.println("몬스터 볼 선택");
//         System.out.println("1. 몬스터 볼 2. 마스터 볼");
//
//         Random random = new Random();
//
//         int monsterBall;
//
//         while (true) {
//            System.out.print("몬스터볼 선택 >> ");
//            monsterBall = sc.nextInt();
//
//            if (1 <= monsterBall && monsterBall <= 2) {
//               // System.out.println("로그3");
//               break;
//            }
//            System.out.println("다시 입력해주세요");
//         }
//         // System.out.println("로그1");
//         if (monsterBall == 1) {// 일반볼
//
//            System.out.println("일반 사용");
//            int nomal = random.nextInt(10);
//            if (nomal == 0) {
//               System.out.println(datas[cnt].name + "넌 내꼬얌");
//               datas[cnt] = conpang;
//               cnt++;
//
//            }
//         } else {// 마스터볼
//            // System.out.println("로그2");
//            int master = random.nextInt(2);
//            if (master == 0) {
//               // System.out.println("로그4");
//               // System.out.println("cnt ="+cnt);
//               String answer = "사용자 입력";
//               datas[cnt] = new Togepi(answer);
//               System.out.println(datas[cnt].name + " 넌 내꼬얌");
//               cnt++;
//               datas[cnt] = new Togepi();
//            } else {
//               System.out.println("포획 실패");
//            }
//         }
//         // System.out.print(datas[1]);
      }

   }
