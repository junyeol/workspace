package class05;

import java.util.Scanner;

public class Tast03 {
	public static void main(String[] args) {
		//2번
		//정수 3개 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		int num3= sc.nextInt();
		//총합과 평균 구하게 하기
		System.out.println(num1+num2+num3 + "총합입니다");
		//평균은 실수이기 때문에 더블을 사용해서 어케 해보기
		
		System.out.println((double)(num1+num2+num3)/3 + "평균입니다");
	}
}
