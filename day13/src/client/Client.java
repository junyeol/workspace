package client;

import view.View;

public class Client {
   public static void main(String[] args) {
      
      // 계산기 프로그램을 수행할 예정
      
      View view=new View();
      
      while(true) {
         view.printIntInfo();
         int num1=view.inputInt();
         view.printOpInfo();
         String op=view.inputOp();
         view.printIntInfo();
         int num2=view.inputInt();
         
         int result=num1+num2;
         
         view.printResult(num1, op, num2, result);
      }
      
   }
}
