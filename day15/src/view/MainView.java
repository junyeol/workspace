package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.BoardDTO;

abstract class View {
	public static Scanner sc=new Scanner(System.in);
}

public class MainView extends View {
	// 글 전체 출력
	// 글 검색 : 제목
	// 글 검색 : 작성자
	// 글 1개 선택
	public int printBoardList(ArrayList<BoardDTO> datas) {
		for(int i=0;i<datas.size();i++) {
			System.out.println((i+1)+". "+datas.get(i));
		}
		
		int num;
		while(true) {
			System.out.print("번호입력 >> ");
			num=sc.nextInt();
			if(0<num && num<=datas.size()) {
				break;
			}
		}
		return datas.get(num-1).getNum();
	}
	public void printTrue() {
		System.out.println("성공!");
	}
	public void printFalse() {
		System.out.println("실패...");
	}
	public void printMenuList() {
		System.out.println("0. 종료");
		System.out.println("1. 글 전체 출력");
		System.out.println("2. 글 검색 : 제목");
		System.out.println("3. 글 검색 : 작성자");
		System.out.println("4. 글 1개 선택");
	}
	public int inputMenuNum() {
		System.out.print("메뉴입력 >> ");
		int num=sc.nextInt();
		return num;
	}
}
