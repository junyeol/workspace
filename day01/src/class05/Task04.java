package class05;

import java.util.Scanner;

public class Task04 {
	public static void main(String[] args) {
		//3번
		
		//정수 2개 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.println("정수2개와 연산자를 입력하면 계산해주는 프로그램");
		System.out.println("정수2개 입력");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		//연산자 1개 입력 받기  +,- ??
		sc.nextLine();
		System.out.println("연산자입력");
		String pm = sc.next();
		if(pm != "+" || "-") 
			System.out.println("잘못된 입력입니다.");
		
		
		//전체 계산 결과 출력
		if(pm == "+")
		System.out.println(num1+pm+num2+"="+num1+num2);
		
	}
}
