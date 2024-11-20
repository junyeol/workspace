package class01;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		//정수를 2개 입력받아서
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 2개 입력받아서 오름차순으로 저장하는 프로그램입니다.");
		System.out.println("정수 1 입력");
		int a =sc.nextInt();
		System.out.println("정수 2입력");
		int b=sc.nextInt();
		
		//a와 b에 저장
		
		//a가 b보다 항상 작도록 데이터를 서로 변경할수도 있고 안할수도 있는 상황
//		if(a가 b보다 항상 작아야하는데 그렇지 못한경우에) {
//			서로 변경
		if(a>b) {
			// 데이터 교환 알고리즘(로직)
			int tmp=a;
			//tmp, temp, 임시저장변수>>값을 교환할때 주로 사용됨
			a=b;
			b=tmp;
	}
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		
		
		
	}
}
