package class01;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		//정수 2개를 입력받고 
		//연산자 1개를 입력받음
		Scanner sc = new Scanner(System.in);
		int num1, num2;//사용자에게 입력받을 정수
		String op;//연산자
		//문자열은 일반변수(원시타입변수)가 아니며,
		//연산자는 일반변수만 계산할 수 있다.
		//연산자로는 객체를 게산할수가 없다.
		int res = 0; //결과
		System.out.println("정수를 2개와 연산자를 입력하면 결과를 출력하는 프로그램입니다.");
		System.out.println("정수 1입력");
		num1=sc.nextInt();
		System.out.println("정수 2입력");
		num2=sc.nextInt();
		
		sc.nextLine(); //버퍼 공간 비우기
		
		System.out.println("연산자입력(+,-)");
		op=sc.nextLine();//버퍼에 이미 전달할 값이 남아있어서 사용자가 입력했구나
		//op=sc.next(); 공백을 제외한  모든 String을 받는 함수 >> 띄어쓰기는 입력받지 못함.
//		로그 찍은 후의 결과
//		1. 코드 에러 xxx
//		2. op는 데이터가 들어가 있다.
//		3. 공백 데이터였다.
		
		//정수 + 연산자 + 정수
		//연산자가 +였다면
		//정수 + 정수
		if(!(op.equals("+")||op.equals("-"))) {//op가 플러스나 마이너스가 아닌 연산자를 입력했다면
			//유형성 검사
			//+도 아니고, -도 아니면 : op!="+"&&op!="-"
			res=0;
		}
		else if(op == "+") {
			res=num1+num2;
		}
		else{
			res=num1-num2;
		}
		//연산자가 -였다면
		//정수 - 정수
		
		//전체 계산 결과를 출력
		System.out.println(num1+""+op+""+num2+"="+res);
		
		
		
		
	}
}
