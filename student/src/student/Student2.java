package student;

import java.util.Scanner;

public class Student2 {

   public static int sample(String[] datas) {
      // 학생부 배열에 샘플 데이터를 저장해주고,
      // 몇명이 저장되었는지 반환해주는 함수
      datas[0]="티모";
      datas[1]="아리";
      datas[2]="모르가나"; // 배열은 call by reference ▶ 반환 x
      int cnt=3; // 원시타입 ▶ 반환 o
      return cnt;
   }

   public static int printMenu() {
      // 메뉴를 출력해주고,
      // 사용자로부터 메뉴번호로 입력받은 값을 반환해주는 함수
      Scanner sc=new Scanner(System.in);
      System.out.println("=== 메 뉴 ===");
      System.out.println("1. 학생추가");
      System.out.println("2. 학생부 전체출력");
      System.out.println("3. 이름으로 검색");
      System.out.println("4. 번호로 검색");
      System.out.println("5. 이름변경");
      System.out.println("0. 프로그램 종료");
      System.out.println("===============");
      System.out.print("메뉴 입력 >> ");
      int menu=sc.nextInt();
      return menu;
   }

   public static boolean isFull(int cnt,String[] datas) {
      // 더 이상 학생 데이터를 저장할 수 없을때
      if(cnt >= datas.length) {
         System.out.println("더이상 데이터를 저장할수없습니다!");
         return true;
      }
      return false;
   }
   public static boolean isEmpty(int cnt) {
      // 아직 저장된 학생 데이터가 전혀 없을때
      if(cnt<=0) { 
         System.out.println("저장된 학생 데이터가 없습니다.");
         return true;
      }
      return false;
   }

   public static String inputName(int cnt,String[] datas) {
      // 사용자가 이름을 입력하면 그 이름 값을 반환하는 함수
      Scanner sc=new Scanner(System.in);
      String name;
      while(true) {
         System.out.print("변경할 이름을 입력해주세요. >> ");
         name=sc.next();

         System.out.print("정말 "+name+"(으)로 하시겠습니까? (Y/N) >> ");
         String answer=sc.next();

         if(answer.equals("Y")) {

            boolean flag=false;

            for(int i=0;i<cnt;i++) {
               if(name.equals(datas[i])) {
                  flag=true;
                  System.out.println(name+"은(는) 이미 존재하는 이름입니다...");
               }
            }


            if(!flag) {
               break;
            }

         }
      }
      return name;

   }

   // 학생부 전체 출력 담당하는 기능의 함수
   // input, output 먼저 생각해보기!!!!!!!!!!
   // input : 학생부 데이터, 현재 저장된 학생의 수
   // output : x
   public static void printStudents(String[] datas,int cnt) {
      System.out.println("=== 학생 목록 ===");
      for(int i=0;i<cnt;i++) {
         System.out.println((i+1)+"번 학생 "+datas[i]);
      }
      System.out.println("====================");
   }

   public static boolean isRight(int num,int cnt) {
      if(1<=num && num<=cnt) {
         return true;
      }
      return false;
   }

   // 학생 번호로 검색
   // input : 학생부 데이터, 현재 저장된 학생의 수
   // output : x (대체적으로 출력(select,read,R)기능은 output이 없음)
   public static int selectOne(String[] datas,int cnt) {
      Scanner sc=new Scanner(System.in);
      int num;
      while(true) {
         System.out.print("검색할 번호 입력 >> ");
         num=sc.nextInt();
         if(isRight(num,cnt)) {
            break;
         }
      }      
      System.out.println(num+"번 학생은 "+datas[num-1]+"입니다.");
      return num;
   }
   public static boolean searchName(int cnt, String[] datas) {
	   Scanner sc=new Scanner(System.in);
       // 검색어를 입력 >> 
       // 이 검색어가 맞습니까? xxx : 사용자가 하는 입력이 데이터에 변화를주지않기때문
       System.out.print("검색어 입력 >> ");
       String searchContent=sc.next(); // searchKeyword

       boolean flag=false; // 검색결과가 없는 상태로 시작

       // 학생부를 하나하나 확인하면서
       System.out.println("===============");
       for(int i=0;i<cnt;i++) {
          // 학생의 이름안에 검색어가 있니? ==> 티모 == 모 xxxxx 티모안에 모가 있니? o
          if(datas[i].contains(searchContent)) { // 티모안에 모가 있니?
             System.out.println(datas[i]);
             flag=true; // 검색결과를 찾은 상태
          }
         
       }

       if(!flag) { // 검색결과가 없다면
          System.out.println("검색결과가 없습니다...");
       }
      

       System.out.println("===============");
	
       return flag;
	


    }
   


   public static void main(String[] args) {
      String[] datas = new String[5];
      Scanner sc=new Scanner(System.in);
      System.out.println("학생부 프로그램");

      int cnt=sample(datas);

      while(true) {
         int menu=printMenu();
         if(menu==0) {
            System.out.println("프로그램이 종료됩니다.");
            break;
         }
         else if(menu==1) { // 학생추가

            if(isFull(cnt,datas)) {
               continue;
            }



            String name=inputName(cnt, datas);
            datas[cnt]=name;
            cnt++;

            System.out.println(name+"이(가) 저장되었습니다!");

         }
         else if(menu==2) { // 학생부 전체출력

            if(isEmpty(cnt)) { 
               continue;
            }

            printStudents(datas,cnt);
         }
         else if(menu==3) { // 이름으로 검색
        	 searchName(cnt,datas);
         }
         else if(menu==4) { 
       
            if(isEmpty(cnt)) { 
               continue;
            }

            selectOne(datas,cnt);

         }
         else if(menu==5) { // 이름변경

       


            if(isEmpty(cnt)) { 
               continue;
            }


            int num=selectOne(datas,cnt);



            datas[num-1]=inputName(cnt, datas);
         }
         else { // 유효성 검사
            System.out.println("제대로 입력해주세요~~");
         }
      }


   }

}

