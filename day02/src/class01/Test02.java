package class01;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 3개 입력받아서 오름차순으로 저장하는 프로그램입니다.");
		System.out.println("정수 1 입력");
		int a =sc.nextInt();
		System.out.println("정수 2입력");
		int b=sc.nextInt();
		System.out.println("정수 3입력");
		int c=sc.nextInt();
		
		//a가 가장 작아야하니까
		//a가 b보다 작아? 아니라면 a와b를 교환
		if(a<b) {
			int tmp=a;
			a=b;
			b=tmp;
		}
		//a가 c버보다 작아? 아니라면 a와c를 교환
		if(a<c) {
			int tmp=a;
			a=c;
			c=tmp;
		}
		//b가c보다 작아야하니까
		if(b<c) {
			int tmp=b;
			b=c;
			c=tmp;
		}
		//b가 c보다 작아? 아니라면 b와c를 교환
		if(b<c) {
			int tmp=b;
			b=c;
			c=tmp;
		}
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		
		
	}
}
