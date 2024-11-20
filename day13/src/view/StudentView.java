package view;

import java.util.ArrayList;
import java.util.Scanner;


import service.model.StudentDTO;

public class StudentView {
	static Scanner sc=new Scanner(System.in);

	public void print01() {
		System.out.println("=== 메 뉴 ===");
		System.out.println("1. 학생추가");
		System.out.println("2. 전체출력");
		System.out.println("3. 번호검색");
		System.out.println("4. 이름검색");
		System.out.println("5. 평균출력");
		System.out.println("6. 점수변경");
		System.out.println("7. 학생삭제");
		System.out.println("0. 프로그램 종료");
		System.out.println("==========");
	}
	public void print02() {
		System.out.print("추가할 학생의 이름 입력 >> ");
	}
	public void print03() {
		System.out.print("추가할 학생의 성적 입력 >> ");
	}
	public void print04() {
		System.out.println("학생 추가 완료!");
	}
	public void print05(ArrayList<StudentDTO> datas) {
		System.out.println("=== 전체 목록 ===");
		for(StudentDTO data:datas) {
			System.out.println(data);
		}
		System.out.println("===============");
	}
	public void print06() {
		System.out.println("출력할 데이터가 없습니다!");
	}
	public void print07() {
		System.out.print("검색할 학생의 번호 입력 >> ");
	}
	public void print08(StudentDTO data) {
		if(data==null) {
			System.out.println("검색 결과가 없습니다!");
			return;
		}

		System.out.println("=== 검색 결과 ===");
		System.out.println(data);
		System.out.println("===============");
	}
	public void print09() {
		System.out.print("삭제할 학생의 번호 입력 >> ");
	}
	public void print10() {
		System.out.println("학생 삭제 완료!");
	}
	public void print11() {
		System.out.println("학생 삭제 실패...");
		System.out.println("관리자에게 문의하세요.");
	}
	public void print12() {
		System.out.print("검색할 이름 입력 >> ");
	}
	public void print13(ArrayList<StudentDTO> datas) {
		if(datas.size() <= 0) {
			System.out.println("검색 결과가 없습니다!");
			return;
		}

		System.out.println("=== 검색 결과 ===");
		for(StudentDTO data:datas) {
			System.out.println(data);
		}
		System.out.println("===============");
	}
	public void print14(double avg) {
		// 학생이 많아질수록, 성적이 다양해질수록, V에 로직이 있으면 느려질것으로 예상
		// 평균 로직을 백단에 위치시킬예정
		System.out.println("전체 평균은 "+avg+"점 입니다.");
	}
	// 1. V  ex) 쿠팡의 총합금액 로직 등은 V에 위치함
	// 2. M vs C  ex) 오피지지의 승률픽률 로직 등은 백단에 위치함(C)
	public void print15() {
		System.out.println("학생 점수 변경 완료!");
	}
	public void print16() {
		System.out.println("학생 점수 변경 실패...");
		System.out.println("관리자에게 문의해주세요!");
	}

	public int inputAction() {
		int action=sc.nextInt();
		return action;
	}
	public String inputName() {
		String name=sc.next();
		return name;
	}
	public int inputScore() {
		int score=sc.nextInt();
		return score;
	}
	public int inputNum(int lastPK) {
		int num;
		while(true) {
			num=sc.nextInt();
			if(100 < num && num < lastPK) {
				break;
			}
			System.out.println("제대로 입력해주세요!");
		}
		return num;
	}
}
