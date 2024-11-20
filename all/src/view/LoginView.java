package view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import model.ProductDTO;

public class LoginView {
	private static Scanner sc; 

	public LoginView(){
		sc = new Scanner(System.in);
	}

	public void printMenuList() {//메뉴리스트 출력
		System.out.println("3.로그아웃");
		System.out.println("5.장바구니에 상품담기");
		System.out.println("6.장바구니 상품 목록 출력");
		System.out.println("7.장바구니 상품 목록 구매");
		System.out.println("8.장바구에서 상품 빼기");
	}

	//상품번호 입력받기
	public ProductDTO inputProductNum(ArrayList<ProductDTO> datas) {
		while(true) {
			cartInfo(datas);//상품보여주기
			//입력받기
			int cartNum=0;
			try {//정수가 아닌값을 입력했을 때를 대비
				System.out.print("상품번호를 입력하세요>>");
				cartNum = sc.nextInt();
			}
			catch(InputMismatchException e) {//정수가 아니라면 다시 입력
				System.out.println("번호를 입력해주세요");
				sc.next();
			}
			//0보다크고 데이터사이즈보다 작거나 같고 선택한 상품의 재고가 있을 때
			if(0<cartNum && cartNum<=datas.size() && datas.get(cartNum-1).getCnt() > 0 ) {

				return datas.get(cartNum-1);//선택한 상품 반환
			}
			System.out.println("다른 상품을 선택해주세요.");
		}
	}


	
	//장바구니에 담을 상품 개수 입력
	public int addCart(int num) {
		while(true) {
			//몇개 담을지
			int cntNum=0;
			try {//정수가 아닌값을 입력했을 때를 대비
				System.out.print("담고싶은 개수를 입력하세요>>");
				cntNum = sc.nextInt();
			}
			catch(InputMismatchException e) {//정수가 아니라면 다시
				System.out.println("개수를 입력해 주세요");
				sc.next();
			}
			if(0<cntNum && cntNum<=num) {//0~상품의 남은 재고만큼이라면
				return cntNum;
			}
			System.out.println("다시 입력해주세요");
		}
	}


	//장바구니출력
	public void cartInfo(ArrayList<ProductDTO> datas) {
		if(datas.size()>0) {
			for(int i=0;i<datas.size();i++) {
				if(datas.get(i).getCnt()<=0) {//상품의 재고가 0이하라면 품절
					System.out.println((i+1)+"번 "+datas.get(i).getName() + "은(는) 품절입니다.");
				}
				else{//상품의 재고가 남아있다면 상품 정보 출력
					System.out.println((i+1)+"번 | "+datas.get(i).getName() +" | 개수 :"+ datas.get(i).getCnt() +" | 가격 : "+ datas.get(i).getPrice()+"원");
				}
			}
		}
	}



	//장바구니 구매
	public ArrayList<ProductDTO> buyCart(ArrayList<ProductDTO> productList, ArrayList<ProductDTO> whishList) {
		ArrayList<ProductDTO> datas = new ArrayList<ProductDTO>(); 
		ProductDTO hash = new ProductDTO();
		int total=0;//구매가격의 총합
		for(ProductDTO data:productList) {//상품

			for(int i=0;i<whishList.size();i++){//장바구니

				if(data.getNum() == whishList.get(i).getNum()){//상품번호와 장바구니번호가 같으면
					int cnt = data.getCnt()-whishList.get(i).getCnt(); //상품재고 - 장바구니구매개수
					if(cnt>=0) { //재고에서 장바구니구매개수를 뺀 값이 0보다 크거나 같다면
						hash.setNum(data.getNum());
						hash.setName(data.getName());
						hash.setPrice(data.getPrice());
						hash.setCnt(cnt);//뺀값을 넣어서 반환
						datas.add(hash);
						total += whishList.get(i).getPrice();
					}
					else {
						hash.setNum(data.getNum());
						hash.setName(data.getName());
						hash.setPrice(data.getPrice());
						hash.setCnt(0);
						datas.add(hash);
						total += data.getCnt()*data.getPrice();
						//다살거야
					}

				}

			}

		}
		totalCost(total);//총합 보여주기
		return datas;//
	}

	//구매된 전체 금액 출력
	public void totalCost(int total) {
		System.out.println("구매된 전체금액은"+total+"입니다");
	}
	//장바구니에 담기 성공
	public void successCart() {
		//장바구니에 담겼습니다
		System.out.println("장바구니에 담겼습니다.");
	}
	//장바구니에 담기 실패
	public void failCart() {
		System.out.println("장바구니에 상품을 담는데 실패 하셨습니다.");
	}
	//구매 성공했을 때
	public void successBuy() {
		//구매 완료
		System.out.println("구매를 성공적으로 마쳤습니다.");
	}
	//구매 실패했을 때
	public void failBuy() {
		System.out.println("구매에 실패하였습니다.");
	}
	//빼기 성공했을 때
	public void removeCart() {
		//빼기 성공!
		System.out.println("장바구니를 성공적으로 비웠습니다.");
	}
	//장바구니 비우기 실패했을때
	public void removeFail() {
		System.out.println("삭제되지 못한 장바구니가 있습니다 이후 로그인시 장바구니가 남아있을 수 있습니다");
	}

}
