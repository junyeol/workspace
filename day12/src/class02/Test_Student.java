package class02;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
   private int num;
   private String name;
   private int score;
   Student(int num, String name, int score){
      this.num=num;
      this.name=name;
      this.score=score;
   }
   public int getNum() {
      return num;
   }
   public void setNum(int num) {
      this.num = num;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public int getScore() {
      return score;
   }
   public void setScore(int score) {
      this.score = score;
   }
   @Override
   public String toString() {
      return "Student [num=" + num + ", name=" + name + ", score=" + score + "]";
   }
}

public class Test_Student {

   public static Student hasStudent(ArrayList<Student> datas,int num) {
      for(Student data:datas) {
         if(num == data.getNum()) {
            return data;
         }
      }
      for(int i=0;i<datas.size();i++) {
         if(num == datas.get(i).getNum()) {
            return datas.get(i);
         }
      }
      return null;
   }
   public static ArrayList<Student> hasStudent(ArrayList<Student> datas,String searchKeyword) {
      ArrayList<Student> al=new ArrayList<Student>();
      // 1. 반환할 배열을 생성
      for(Student data:datas) {
         if(data.getName().contains(searchKeyword)) {
            // 2. 이름에 keyword가 들어가있다면,
            al.add(data);
            // 3. 반환할 배열에 저장
         }
      }
      return al;
      // 4. 반환
   }

   public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);

      ArrayList<Student> datas=new ArrayList<Student>();
      // 배열 역할을 하는 컬렉션 배열리스트
      // 학생부 역할

      // [샘플 데이터 생성]
      int PK=1001; // 시스템에서 부여
      datas.add(new Student(PK++,"오리아나",50));
      datas.add(new Student(PK++,"모르가나",88));
      datas.add(new Student(PK++,"티모",67));
      // [전체출력]
      // [학생추가]

      while(true) {

         System.out.println("=== 메 뉴 ===");
         System.out.println("1. 학생추가");
         System.out.println("2. 전체출력");
         System.out.println("3. 번호검색");
         System.out.println("4. 이름검색");
         System.out.println("5. 평균출력");
         System.out.println("6. 점수변경");
         System.out.println("7. 학생삭제");
         System.out.println("0. 프로그램 종료");
         System.out.println("==========");

         System.out.print("메뉴입력 >> ");
         int action=sc.nextInt();

         if(action==0) {
            break;
         }
         else if(action==1) { // 학생추가
            System.out.print("이름입력 >> ");
            String name=sc.next();

            System.out.print("성적입력 >> ");
            int score=sc.nextInt();

            datas.add(new Student(PK++,name,score));
            System.out.println("학생 데이터 추가 완료!");
         }
         else if(action==2) { // 전체출력
            if(datas.isEmpty()) {
               System.out.println("출력할 데이터가 없습니다!");
               continue;
            }

            for(Student data:datas) {
               System.out.println(data);
            }
         }
         else if(action==3) { // 번호검색 == PK로 검색 == selectOne
            if(datas.isEmpty()) {
               System.out.println("출력할 데이터가 없습니다!");
               continue;
            }

            System.out.print("번호입력 >> ");
            int num=sc.nextInt();

            Student data=hasStudent(datas,num);
            if(data != null) {
               System.out.println("[검색결과]");
               System.out.println(data);
            }
            else {
               System.out.println("검색 결과가 없음!");
            }

            /*
            boolean flag=false;
            for(Student data:datas) {
               if(num == data.getNum()) {
                  System.out.println("[검색결과]");
                  System.out.println(data);
                  flag=true;
               }
            }
            for(int i=0;i<datas.size();i++) {
               if(num == datas.get(i).getNum()) {
                  System.out.println("[검색결과]");
                  System.out.println(datas.get(i));
                  // datas[i]==datas.get(i)
                  flag=true;
               }
            }
            if(!flag) {
               System.out.println("검색 결과 없음!");
            }
             */
         }
         else if(action==4) { // 이름검색 == selectAll
            System.out.print("검색어입력 >> ");
            String searchKeyword=sc.next();

            ArrayList<Student> al=hasStudent(datas,searchKeyword);

            if(al.size() <= 0) {
               System.out.println("검색 결과가 없음!");
               continue;
            }

            System.out.println("[검색결과]");
            for(Student s:al) {
               System.out.println(s);
            }
         }
         else if(action==5) { // 평균출력
            if(datas.isEmpty()) {
               System.out.println("출력할 데이터가 없습니다!");
               continue;
            }

            int sum=0;
            for(Student data:datas) {
               sum+=data.getScore();
            }

            double avg=sum*1.0/datas.size();
            System.out.println("평균 : "+avg+"점");
         }
         else if(action==6) { // 점수변경
            System.out.print("번호입력 >> ");
            int num=sc.nextInt();

            Student data=hasStudent(datas,num);
            if(data == null) {
               System.out.println("검색 결과가 없음!");
               continue;
            }

            System.out.print("성적입력 >> ");
            int score=sc.nextInt();
            data.setScore(score);
            System.out.println("변경완료!");
         }
         else if(action==7) { // 학생삭제
            System.out.print("번호입력 >> ");
            int num=sc.nextInt();

            boolean flag=false;
            for(int i=0;i<datas.size();i++) {
               if(datas.get(i).getNum() == num) {
                  flag=true;
                  datas.remove(i);
                  break;
               }
            }
            if(!flag) {
               System.out.println("검색 결과가 없음!");
            }
            /*
            Student data=hasStudent(datas,num);
            if(data == null) {
               System.out.println("검색 결과가 없음!");
               continue;
            }

            for(int i=0;i<datas.size();i++) {
               if(datas.get(i).getNum() == data.getNum()) {
                  datas.remove(i);
                  break;
               }
            }
            */
         }
         else {
            System.out.println("잘못된 입력입니다!");
         }
      }



























   }

}
