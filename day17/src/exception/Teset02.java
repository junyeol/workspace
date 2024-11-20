package exception;

import java.util.Scanner;

public class Teset02 {
   public static void main(String[] args) {

      int[] datas= {10,0,-1,2,3,4,5,6};
      Scanner sc=new Scanner(System.in);

      System.out.print("정수 1 >> ");
      int num1=sc.nextInt();
      try {
         num1=datas[num1];
      }
      catch(ArrayIndexOutOfBoundsException e) {
         System.out.print("없는 인덱스 번호를 입력해서 ");
         System.out.println("[0]의 값으로 설정했습니다.");
         num1=datas[0];
      }

      System.out.print("정수 2 >> ");
      int num2=sc.nextInt();
      try {
         num2=datas[num2];
      }
      catch(ArrayIndexOutOfBoundsException e) {
         System.out.print("없는 인덱스 번호를 입력해서 ");
         System.out.println("[0]의 값으로 설정했습니다.");
         num2=datas[0];
      }

      try {
         int res=num1/num2;
         System.out.println(num1+" / "+num2+" = "+res);
      }
      catch(ArithmeticException e) {
         System.out.println("0으로는 나누기를 수행할 수 없습니다.");
      }
      
   }
}
