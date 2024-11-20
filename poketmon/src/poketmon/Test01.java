package poketmon;
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
      System.out.println(this.name + " " + "나는 멋쟁이~" + this.level + "레벨" + this.exp + "경험치");
   }

   void attack() { // 공격 메서드
      int randomAttack = Poketmon.random.nextInt(2); // randomAttack에서 50%확률
      if (randomAttack == 1) { // 1이면 공격 성공
         System.out.println("공격 성공!!!!");
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
      return "내 포켓몬> "+"타입:" + this.type +"|"+" 이름:" + this.name +"|"+ " 레벨:" + this.level +"|"+ " 보유 경험치:" + this.exp+"|";
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
   @Override
   void hello() {
      System.out.println("고라~~~~파덕~~~~~");
   }
   @Override
   void attack() {
      System.out.println("물대포");
      super.attack();
   }
}
class Totodile extends Poketmon {
   Totodile() {
      super("물", "리아코");
   }

   @Override
   void hello() {
      System.out.println("리아~~~~~~코~~~~~");
   }
   @Override
   void attack() {
      System.out.println("몸통박치기");
      super.attack();
   }
}

class MimeJr extends Poketmon { // 준열 에스퍼 포켓몬
   MimeJr() {
      super("에스퍼", "흉내내");
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
   @Override
   void hello() {
      System.out.println("콘팡콘팡");
   }
   @Override
   void attack() {
      System.out.println("전광석화");
      super.attack();
   }

}

class Bee extends Poketmon {
   Bee() {
      super("벌레", "독침붕");
   }
   @Override
   void hello() {
      System.out.println("독침붕~");
   }
   @Override
   void attack() {
      System.out.println("독침쏘기");
      super.attack();
   }
}

public class Test01 {
   public static int ball() { // 몬스터볼 선택 함수
      System.out.println("몬스터 볼 선택");
      System.out.println("1. 몬스터 볼 2. 마스터 볼");
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
   public static boolean collectPoke(int monsterBall) { // 몬스터볼 성공확률
      Random random = new Random();
      int master=0; //마스터볼 변수
      int nomal=0;   // 일반볼 변수
      if (monsterBall == 1) {// 일반볼

         System.out.println("일반 사용");
         nomal = random.nextInt(100);
      } 
      else {// 마스터볼
         // System.out.println("로그2");
         master = random.nextInt(100);
      }
      if(nomal<10 && master<50) {
         return true;
         //몬스터볼이 0이면 성공 = true 리턴
      }
      return false;
      //몬스터볼이 0이 아니면 포획실패 = false 리턴
   }
   public static void printInfo() { //시작을 알리는 함수

      System.out.println("포켓몬 게임~~~~~~~~뚠뚜둔");
      System.out.println("안녕? 난 오박사야, 태초마을에 온걸 환영 한다네 허허허");
      System.out.println("아직 포켓몬이 없구나? 포켓몬을 골라보렴");
      System.out.println("1. 콘팡 2.독침붕 3.으랏차");
      System.out.print("번호 입력>>");
   }
   //   public static boolean isEmpty(int num) { //1,2선택지 유효성검사   
   //      if(num>=1 && num<=2) { // fight값이 0 
   //         return true; //참이면 반환
   //      }
   //      System.out.println("올바른 번호를 선택해주세요~!!!!"); // 1이나 2 아니라면
   //      return false; //거짓이면 반환 
   //   }
   public static boolean check(int num,int min,int max) { // 유효성검사 최종 함수
      if(min<=num && num<=max) { // fight값이 0 
         return true; //참이면 반환
      }
      System.out.println("올바른 번호를 선택해주세요~!!!!");
      return false; //거짓이면 반환 
   }
   public static void printAll(int cnt,Poketmon[] datas) { //포켓몬 전체출력 함수
      for (int i = 0; i < cnt; i++) { // 1번부터 cnt번 까지의 포켓몬을 보여준뒤
         System.out.print((i + 1) + "번 ");
         System.out.println(datas[i]);
      }
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Random random = new Random();

      int cnt = 0;// 내가 가진 포켓몬 수
      String[] data = { "콘팡", "토게피", "치고마", "으랏차", "흉내내", "리아코", "고라파덕", "독침붕" }; //전체 포켓몬 배열
      Poketmon[] datas = new Poketmon[8];   //포켓몬을 담을 수 있는 배열

      // 시작화면
      printInfo();
      // 유효성 검사 필요
      while (true) {
         int user = sc.nextInt();
         if (check(user,1,3)) { // 유효성 검사
            if (user == 1) {
               datas[cnt] = new Conpang();
               System.out.println("오박사: " + datas[cnt].name + "은 너의 친구가 되었다네~허허허");
               cnt++;
            } 
            else if (user == 2) {
               datas[cnt] = new Bee();
               System.out.println("오박사: " + datas[cnt].name + "은 너의 친구가 되었다네~허허허");
               cnt++;
            } 
            else {
               datas[cnt] = new Timburr();
               System.out.println("오박사: " + datas[cnt].name + "은 너의 친구가 되었다네~허허허");
               cnt++;
            }
            break;
         }
         System.out.println("오박사: 여행자여 다시 입력하세용~");
      }
      // 게임 시작
      while (true) {
         System.out.println("=======================");
         System.out.println("메뉴 선택");
         System.out.println("1. 전투 2. 전체 상태창 보기 3. 교감하기 4. 새 포켓몬 잡기 0. 게임종료");
         System.out.print("번호 입력>>");
         int user = sc.nextInt();
         int menu = user;
         // 메뉴를 출력한다.
         // 메뉴 1. 싸우기
         // 2. 전체 상태 출력
         // 3. 울음소리 듣기
         // 4. 포켓몬 잡기
         // 0. 게임 종료
         //
         // 입력을 받아야한다.
         if (menu == 0) {//게임 종료
            System.out.println("==게임 종료==");
            break;
         } 
         else if (menu == 1) { //전투
            // 입력받은 값이 1이라면 싸우기로 넘어가기
            // 1번 랜덤으로 싸울상대 출력
            while(true) {
               System.out.println("=======================");
               int randNum=random.nextInt(data.length);// 랜덤으로 포켓몬 등장
               System.out.println("야생 포켓몬 "+data[randNum]+" 등장했다!!");

               // 싸울지말지 선택(싸우기, 도망가기)
               int fight; //선택 변수
               while(true) {
                  System.out.println("1. 싸우기 2. 도망가기"); // 싸울지말지 선택(싸우기, 도망가기)
                  System.out.print("번호입력>>");
                  fight=sc.nextInt();
                  if(check(fight,1,2)) { //유효성검사
                     break;
                  }
               }
               // 유효성검사 필요
               // 싸운다면 내 포켓몬 선택
               if(fight==1) { //싸우기
                  int num; // 포켓몬 수 출력 변수
                  System.out.println("싸우기를 선택했다!!");
                  System.out.println("==============");
                  System.out.println("내 포켓몬 선택");
                  System.out.println("=======================");
                  printAll(cnt,datas); // 가지고 있는 포켓몬 전체출력
                  System.out.println("=======================");
                  System.out.println("싸울 포켓몬의 번호를 선택하세요!");
                  System.out.print("번호 입력>>");
                  while (true) { // 올바른 번호를 입력할때까지=유효성검사
                     num = sc.nextInt(); // 번호를 입력받는다.
                     if (check(num,1,cnt)) { // 번호가 1~num라면
                        break;
                     }
                     System.out.println("올바른 번호를 선택해주세요"); // 유효성검사 = 번호가 1~cnt 아니라면
                     System.out.print("번호 입력>>");
                  }
                  System.out.println("=======================");
                  datas[num-1].attack();// 선택 후 공격 실행
                  System.out.println("=======================");
                  // 성공 한다면 경험치 획득
                  System.out.println(datas[num-1]); // 경험치 얻은후 상태를 보여준다~
               }

               else if(fight==2) {//도망가기
                  int ok; //번호 선택 변수
                  while(true) { 
                     System.out.println("=======================");
                     System.out.println("1. 다른 포켓몬 경쟁 2. 메뉴이동");
                     System.out.print("번호 입력>>");
                     ok=sc.nextInt();
                     if(check(ok,1,2)) {//유효성검사
                        System.out.println("=======================");
                        break;
                     }
                  }
                  if(ok==1) { //다른포켓몬 만나기
                     continue;
                  }
                  else if(ok==2) { //도망가기
                     System.out.println("==도망갔다.==");
                     break;
                  }
               }
            }
         }
         else if (menu == 2) {//내 모든 포켓몬 상태창 출력
            //System.out.println("cnt = " + cnt);
            System.out.println("=======================");
            printAll(cnt,datas); // 가지고 있는 포켓몬 전체출력
            // datas[i].printPoket();
         }

         else if (menu == 3) {//교감하기(울음소리 듣기)
            // 선택한 포켓몬 울음소리 출력
            // 유효성 검사 필요
            // 모든 울음소리 출력
            int i; //반복문 변수 사용
            int num;   //입력 받는 값 변수 사용
            System.out.println("=======================");
            printAll(cnt,datas); // 가지고 있는 포켓몬 전체출력
            System.out.println((cnt + 1) + "번 전체출력"); // (전체도 출력해보자)
            System.out.println("=======================");

            while (true) { // 올바른 번호를 입력할때까지
               System.out.println("듣고싶은 포켓몬의 번호를 선택하세요! ");
               System.out.print("번호 입력>>");
               num = sc.nextInt(); // 번호를 입력받는다.
               if (check(num,1,(cnt+1))) { // 번호가 1~전체라면
                  break;
               }
               System.out.println("올바른 번호를 선택해주세요! "); // 유효성검사 = 번호가 1~전체 아니라면
               System.out.print("번호 입력>>");
            }

            if (num !=(cnt+1)) { // 0번이 아니라면
               System.out.println("=======================");
               datas[num-1].hello(); // 울음소리 출력
               System.out.println("=======================");
            } else{ // 전체를 선택했다면
               for (i = 0; i < cnt; i++) { // datas[0]부터 datas[cnt-1]까지
                  datas[i].hello(); // 울음소리 모두출력
               }
            }

         }
         else if (menu == 4) { //새 포켓몬 잡기

            if (cnt > datas.length) { //배열이 모두 차있을 시 출력
               System.out.println("오박사 : 자넨 이미 포켓몬 마스터라네~");
               continue;
            }
            // 만약 0을 누르면 돌아가고
            // 다른 숫자를 누르면 다시 입력하게 만들기

            // 포켓몬 목록 출력
            System.out.println("=== 포켓몬 목록 ===");
            System.out.println("0번 : 도망가기");
            for (int i = 0; i < data.length; i++) { //잡을 수 있는 포켓몬 모두 출력
               System.out.println((i + 1) + "번 포켓몬 : " + data[i]);
            }
            System.out.println("===============");

            int catchPoke = 0;   //잡을 포켓몬 변수
            int monsterBall;   //몬스터볼 변수
            while (true) {
               System.out.print("포켓몬 선택 >> ");
               catchPoke = sc.nextInt();
               if(check(catchPoke,0,8)) { // 유효성검사
                  break;
               }
            }

            if (catchPoke == 1) { //1번 포켓몬
               System.out.println("앗! 야생" + data[0] + " 가(이) 나타났다!!");
               monsterBall = ball();
               // System.out.println("cnt1="+cnt);
               // System.out.println("cnt2="+cnt);
               // System.out.println("a="+percentage);
               if (collectPoke(monsterBall)) {
                  datas[cnt] = new Conpang();
                  System.out.println(datas[cnt].name + "넌 내꺼얌");
                  cnt++;
               } else {
                  System.out.println("실패");
               }
               for (int i = 1; i < cnt; i++) {
                  System.out.println(datas[i]);
               }
               //System.out.println("cnt3=" + cnt);
            } 
            else if (catchPoke == 2) { //2번 포켓몬
               System.out.println("앗! 야생" + data[1] + " 가(이) 나타났다!!");
               monsterBall = ball();
               // System.out.println("cnt1="+cnt);
               // System.out.println("cnt2="+cnt);
               if (collectPoke(monsterBall)) {
                  datas[cnt] = new Togepi();
                  System.out.println(datas[cnt].name + "넌 내꺼얌");
                  cnt++;
               } else {
                  System.out.println("실패");
               }
               for (int i = 1; i < cnt; i++) {
                  System.out.println(datas[i]);
               }
            } 
            else if (catchPoke == 3) { //3번 포켓몬
               System.out.println("앗! 야생" + data[2] + " 가(이) 나타났다!!");

               monsterBall = ball();
               // System.out.println("cnt1="+cnt);
               // System.out.println("cnt2="+cnt);
               // System.out.println("a="+percentage);
               if (collectPoke(monsterBall)) {
                  datas[cnt] = new Kubfu();
                  System.out.println(datas[cnt].name + "넌 내꺼얌");
                  cnt++;
               } else {
                  System.out.println("실패");
               }
               for (int i = 1; i < cnt; i++) {
                  System.out.println(datas[i]);
               }
            } 
            else if (catchPoke == 4) { //4번 포켓몬
               System.out.println("앗! 야생" + data[3] + " 가(이) 나타났다!!");

               monsterBall = ball();
               // System.out.println("cnt1="+cnt);
               // System.out.println("cnt2="+cnt);
               // System.out.println("a="+percentage);
               if (collectPoke(monsterBall)) {
                  datas[cnt] = new Timburr();
                  System.out.println(datas[cnt].name + "넌 내꺼얌");
                  cnt++;
               } else {
                  System.out.println("실패");
               }
               for (int i = 1; i < cnt; i++) {
                  System.out.println(datas[i]);
               }
            } 
            else if (catchPoke == 5) { //5번 포켓몬
               System.out.println("앗! 야생" + data[4] + " 가(이) 나타났다!!");

               monsterBall = ball();
               // System.out.println("cnt1="+cnt);
               // System.out.println("cnt2="+cnt);
               // System.out.println("a="+percentage);
               if (collectPoke(monsterBall)) {
                  datas[cnt] = new MimeJr();
                  System.out.println(datas[cnt].name + "넌 내꺼얌");
                  cnt++;
               } else {
                  System.out.println("실패");
               }
               for (int i = 1; i < cnt; i++) {
                  System.out.println(datas[i]);
               }
            } 
            else if (catchPoke == 6) { //6번 포켓몬
               System.out.println("앗! 야생" + data[5] + " 가(이) 나타났다!!");

               monsterBall = ball();
               // System.out.println("cnt1="+cnt);
               // System.out.println("cnt2="+cnt);
               // System.out.println("a="+percentage);
               if (collectPoke(monsterBall)) {
                  datas[cnt] = new Totodile();
                  System.out.println(datas[cnt].name + "넌 내꺼얌");
                  cnt++;
               } else {
                  System.out.println("실패");
               }
               for (int i = 1; i < cnt; i++) {
                  System.out.println(datas[i]);
               }
            } 
            else if (catchPoke == 7) { //7번 포켓몬
               System.out.println("앗! 야생" + data[6] + " 가(이) 나타났다!!");

               monsterBall = ball();
               // System.out.println("cnt1="+cnt);
               // System.out.println("cnt2="+cnt);
               // System.out.println("a="+percentage);
               if (collectPoke(monsterBall)) {
                  datas[cnt] = new Psyduck();
                  System.out.println(datas[cnt].name + "넌 내꺼얌");
                  cnt++;
               } else {
                  System.out.println("실패");
               }
               for (int i = 1; i < cnt; i++) {
                  System.out.println(datas[i]);
               }
            } 
            else if (catchPoke == 8) { //8번 포켓몬
               System.out.println("앗! 야생" + data[7] + " 가(이) 나타났다!!");

               monsterBall = ball();
               // System.out.println("cnt1="+cnt);
               // System.out.println("cnt2="+cnt);
               // System.out.println("a="+percentage);
               if (collectPoke(monsterBall)) {
                  datas[cnt] = new Bee();
                  System.out.println(datas[cnt].name + "넌 내꺼얌");
                  cnt++;
               } else {
                  System.out.println("실패");
               }
               for (int i = 1; i < cnt; i++) {
                  System.out.println(datas[i]);
               }
            } 
            else if(catchPoke ==0) { //도망가기
               System.out.println("==도망가기==");
            }
            else {
               System.out.println("오박사 : 제대로 선택해주길 바라네~");
            }
         }
      }
   }
}
