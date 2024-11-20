package class04;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
//		정수를 2개 입력받아서 오름차순으로 출력해주세요
//		ex) a =3, b = 5  	3 4 5 
//		ex) a = 10, b = 8	 8 9 10
		//정수 2개를 저장할 변수선언
		//스캐너 입력
		//for문의 증감식을 이용해서 a부터 b까지의 또는 b부터 a까지의 오름차순 출력
		//만약 a가 b보다 크다면 a~b까지 출력
		//반대
		
		
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 2개 입력받아 오름차순으로 출력하는 프로그램입니다.");
		System.out.println("a정수 입력");
		a=sc.nextInt();
		System.out.println("b정수 입력");
		b=sc.nextInt();
		if(a<b) {
			for(int i=a;i<=b;i++) {
				System.out.print(i);
			}
		}
		else if(a>b) {
				for(int i=b;i<=a;i++) {
					System.out.print(i);
			}
		}
			
	}		

}
//삼항연산자(조건연산자)를 사용했으면 더 간단하게 할 수 있었음
//그러거나
//또한 현재 코드에서 tmp로 교환한다면 더 간단하게 할 수 있었음