package class05;

import java.util.Scanner;

//JAVA로 객체지향 코딩
//기본단위 == Class

//학생에 대한 정의를 하기위해 존재하는 class
// 이 객체의 값을 "식별"할수있는 데이터가 있는지 물어봄
// == PK

class Student{
	int num;//학번. PK역할
	String name;
	int score;
	char grade;
}
//Student 라는 자료형이 있습니다/
//[학번,이름, 점수, 등급]을 저장할수있습니다.

// main()을 수행하기 위해 존재하는 class
public class Test01 {
	public static void main(String[] args) {
		int num =10;
		//new => 개발자(힙) 메모리 영역
		int[]datas = new int[5];
		Scanner sc = new Scanner(System.in);
		Student stu1 = new Student();
		//객체지향 언어JAVA는
		//기본 생성자 함수를
		//기본으로 제공해줍니다
		
		
	}
}
