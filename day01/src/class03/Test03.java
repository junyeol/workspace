package class03;

import java.util.Scanner;
		// Scanner는 java.util안에 있다

public class Test03 {
	public static void main(String[] args) {
		// 사용자에게 입력을 받아오기
		// Scanner 라는 것이 필요함
		
		// Scanner는 일반변수 x 객체 o
		// 대문자로 시작한다면 클래스 출신
		// JAVA는 자동 import지원 : Ctrl + Shift + O
		
		Scanner sc = new Scanner(System.in);
		// Scanner 일반변수x 대문자로 시작하기 때문 클래스출신
		// 객체 O -> 함수와 함께 생성됨
		
		System.out.println("정수를 입력해주세요.>>");
		int data=sc.nextInt();
		
		System.out.println("프로그램 종료");
		System.out.println("data = "+data);
		
		
	}
}
