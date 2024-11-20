package view;

import java.util.Scanner;

public class   View {
   static Scanner sc=new Scanner(System.in);

   public void printIntInfo() {
      System.out.println("정수 1개를 입력하세요.");
      System.out.print(">> ");
   }
   public void printOpInfo() {
      System.out.println("연산자를 입력하세요.");
      System.out.println("단, 연산자는 +, -, x 만 지원됩니다.");
      System.out.print(">> ");
   }   
   public void printResult(int num1,String op,int num2,int result) {
      System.out.println(num1+" "+op+" "+num2+" = "+result+" 입니다.");
   }

   public int inputInt() {
      int num=sc.nextInt();
      return num;
   }
   public String inputOp() {
      String op;
      while(true) {
         op=sc.next();
         if(op.equals("+") || op.equals("-") || op.equals("x")) {
            break;
         }
         System.out.println("다시 입력해주세요!");
         System.out.print(">> ");
      }
      return op;
   }
}
