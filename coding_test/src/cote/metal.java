package cote;

import java.util.Stack;

public class metal {

   public static int[] test(int N,int[] tower) {
      int[] result=new int[N];
      Stack<int[]> stack=new Stack<int[]>();
      // {탑의 높이, 탑의 위치}를 저장 == int[] 제네릭으로 설정
      
      for(int i=0;i<N;i++) { // O(n) == 반복문을 반드시 1개는 사용해야함!
         // 1) 현재비교대상이 되는 탑보다 높은 탑이 스택에 있나?
         while(!stack.isEmpty() && stack.peek()[0] < tower[i]) {
            stack.pop(); // 임시 저장 공간에서 제거됨
         }
         // 스택에 저장된 데이터가 있을때,
         // 저장된 탑의 높이가 나(==현재비교대상이 되는 탑)보다 작다면,
         // 신호를 수신할수없으니 스택에서 제거!
         
         // 2) 신호를 받을 탑이 없으면 result를 0으로 저장
         //    탑이 있으면 위치정보 저장
         if(stack.isEmpty()) {
            result[i]=0;
         }
         else {
            result[i]= stack.peek()[1]+1; // [index]와 N번째의 차이 
         }
         
         // 3) 현재비교대상이었던 탑은 다음 비교대상이됨
         //    ===>> 스택에 저장해야함
         stack.push(new int[]{tower[i],i});
      }
      
      return result;
   }
   
   public static void main(String[] args) {
      
      int N=5;
      int[] tower={6,9,5,7,4};
      int[] result=test(N,tower);
      
      for(int v:result) {
         System.out.print(v+" ");
      }
   }

}
