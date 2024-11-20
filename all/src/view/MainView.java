package view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import model.ProductDTO;




public class MainView {
private static Scanner sc; 

public MainView(){
	sc = new Scanner(System.in);
}
	//0.종료
	//	4.상품 목록 출력


	//====상품목록====

	//메뉴번호입력받기 - 유효성
	//만약 0~6번사이가 아니라면
	//다시 입력





	public void printMenuList() {//메뉴보여주기
		System.out.println("0.종료");
		System.out.println("4.상품 목록 출력");
	}

	public int inputMenuNum() {//메뉴번호입력받기
		int action=0;
		while(true) {
			try {//트라이캐치문써서 에러 막기
				//메뉴입력 받기
				System.out.print("메뉴입력>>");
				action = sc.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("다시입력해주세요");//정수가 아니라면 다시입력
				sc.next();
			}
			return action;
		}
	}


//상품 출력
public void productInfo(ArrayList<ProductDTO> datas) {
	if(datas.size()>0) {
		for(ProductDTO data : datas) {//상품리스트에서
			if(data.getCnt()<=0) {//재고가 0이하라면 품절 출력
				System.out.println(data.getName() + "은(는) 품절입니다.");

			}
			else{//재고가 0초과라면 상품정보 출력
				System.out.println(data.getName() +" | 개수 : "+ data.getCnt() +" | 가격 : "+data.getPrice()+"원");
			}
		}

	}
}


}
