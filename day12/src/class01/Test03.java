package class01;

import java.util.ArrayList;
import java.util.Scanner;

/*
문제 1

1~100 사이의 정수를 사용자가 입력합니다.
짝수라면 배열리스트에 추가해주시고,
짝수가 아니라면 x2 하여 배열리스트에 추가해주세요.
배열리스트의 요소개수가 3개가 되면 더이상 입력받지않고,
그동안 저장했던 요소들을 출력해주시고
총합을 출력해주세요!
 */
public class Test03 {
   public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      ArrayList<Integer> al=new ArrayList<Integer>();
      while(true) {
         System.out.print("정수 입력 >> ");
         int num=sc.nextInt();
         
         if(num<1 || 100<num) {
            System.out.println("1~100 사이의 정수를 입력해주세요!");
            continue;
         }
         
         al.add(num%2 == 0 ? num : num*2);
         
         if(al.size() >= 3) {
            break;
         }
      }
      
      System.out.println(al);
      
      int sum=0;
      for(int v:al) {
         sum+=v;
      }
      System.out.println("총합 : "+sum);
      
      
      
      
      
      
      
      
      
      
      
      
   }
}
