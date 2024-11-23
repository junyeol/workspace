package class05;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 1개 입력받아서 10의 약수인지 알려주는 프로그램");
//		System.out.println("정수 입력");
//		int num= sc.nextInt();
//		if(10%num == 0) {//입력된 정수가 10의 약수라면
//			System.out.println("ㅇㅋ");
//		}
//		if(num==0) {
//			System.out.println("0으로는 나누기를 할 수 없습니다");
//			return;//긴급종료
//		}
//		else //아니라면 x
//			System.out.println("x");
//		프로그램은 if문 1개당 1개의 기능으로 판단
//		1개의 if문 당 1개의 기능만을 수행해야함
		
		
		
		
		Scanner sc = new Scanner(System.in);
		//사용자에게 정수를 1개 입력받음
		System.out.println("정수를 입력하면 계절이 나옵니다");
		System.out.println("정수 입력");
		int month= sc.nextInt();
		
		//"월"의 번위에 해당하지않는 값
		//개발자가 "사용자의 입력값"이 올바른지 체크해줘야만 함
		//"유효성 검사"
		
		//만약 3이거나 4이거나 5라면 봄
		if(month<1||12<month) {//유효성 검사
			System.out.println("올바른 입력값이 아닙니다");
		}
		else if(month == 3|| month ==4|| month ==5) {
			System.out.println("봄");
		}
		//만약  여름
		else if(month == 6|| month ==7|| month ==8) {
			System.out.println("여름");
		}
		//만약 가을
		else if(month == 9|| month ==10|| month ==11) {
				System.out.println("가을");
		}
		//만약 겨울 
		else {
				System.out.println("겨울");
				}
		
	}
	
}
//가독성은 중요하다
//블록구간 {} 생략 x