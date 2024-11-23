package cote;

import java.util.Scanner;
import java.util.Stack;

public class NoZero {
	public static void main(String[] args) {

		//N 크기 만큼의 스택 공간 형성
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		Stack<Integer> stack= new Stack<Integer>();

		//N개의 데이터를 입력받을것임
		//int N=sc.nextInt();요거를 N번 입력받는다는 뜻
		//ctrl C,V가 나오면 반복문 사용
		for(int i=0;i<N;i++) {
			int data=sc.nextInt();
			if(data != 0) {
				stack.push(data);
			}
			else {
				stack.pop();
			}
		}		
		//0이 아니면 그냥 스택에 저장저장
		//0이면 데이터 제거

		//마지막에 스택에 남아있는 모든 데이터 총합
		int total=0;
		for(int v:stack) {
			total+=v;
		}
		System.out.println(total);
		sc.close();

	}
}
