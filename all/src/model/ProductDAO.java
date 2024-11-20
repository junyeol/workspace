package model;

import java.util.ArrayList;

public class ProductDAO {
	private ArrayList<ProductDTO> datas;
	private ArrayList<ProductDTO> cartDatas;

	public ProductDAO() {
		this.datas=new ArrayList<ProductDTO>();
		this.cartDatas= new ArrayList<ProductDTO>();

		// 초기 상품 데이터 추가
		ProductDTO product1 = new ProductDTO();
		product1.setNum(101);
		product1.setName("맥콜");
		product1.setPrice(20000);
		product1.setCnt(4);
		this.datas.add(product1);

		ProductDTO product2 = new ProductDTO();
		product2.setNum(102);
		product2.setName("솔의눈");
		product2.setPrice(10000);
		product2.setCnt(5);
		this.datas.add(product2);

		ProductDTO product3 = new ProductDTO();
		product3.setNum(103);
		product3.setName("아침햇살");
		product3.setPrice(40000);
		product3.setCnt(6);
		this.datas.add(product3);

		ProductDTO product4 = new ProductDTO();
		product4.setNum(104);
		product4.setName("닥터페퍼");
		product4.setPrice(30000);
		product4.setCnt(8);
		this.datas.add(product4);
	}

	public boolean insert(ProductDTO productDTO) { //장바구니 제작
	
		ProductDTO cartData = new ProductDTO(); // 새로운 정보를 저장할 데이터 공간을 생성
		cartData.setNum(productDTO.getNum()); // pk값
		cartData.setName(productDTO.getName());// 제품명
		cartData.setPrice(productDTO.getPrice()); //토탈가격
		cartData.setCnt(productDTO.getCnt()); // 구매하고싶은 개수
		this.cartDatas.add(cartData); //저장
	
		return true;
	}


	public boolean update(ProductDTO productDTO) {
		if (productDTO.getCondition().equals("PRODUCT")) { // 상품 조건인지 확인
			// 상품 재고 변화 로직
			
			boolean flag = false; // 상품 존재 여부 플래그
			for (ProductDTO data : this.datas) { // 모든 상품 데이터를 순회
				if (data.getNum() == productDTO.getNum()) { // 상품 번호 일치 여부 확인
					flag=true;
					data.setCnt(productDTO.getCnt()); // 재고 감소
					
					return true; // 성공 반환
				}
			}
			if(!flag) {
			
			}
		} 
		else if (productDTO.getCondition().equals("CART")) { // 장바구니 조건인지 확인
			// 장바구니 업데이트 로직
			
			boolean flag = false; // 장바구니에 상품 존재 여부 플래그
			for (ProductDTO data : this.cartDatas) { // 모든 장바구니 데이터를 순회
				if (data.getNum() == productDTO.getNum()) { // 상품 번호 일치 여부 확인
					flag = true; // 일치하는 상품 발견
					data.setCnt(data.getCnt()+productDTO.getCnt()); // 장바구니 수량 업데이트
					int totalPrice = data.getPrice()+productDTO.getPrice();// 총가격 변화
					data.setPrice(totalPrice); //총가격 변화
					
					return true; // 성공 반환
				}
			}
			if(!flag) {
				
				return false; // 실패 반환
			}
		}
		return false;// 조건이 맞지 않을 경우 실패 반환
	}

	public boolean delete(ProductDTO productDTO) { // 장바구니 삭제
		
		for (int i = 0; i < cartDatas.size(); i++) { // 장바구니 데이터 리스트를 순회
			if (cartDatas.get(i).getNum() == productDTO.getNum()) { // 현재 장바구니 품목과 담긴 번호가 삭제할 상품품목의 번호와 일치하는지 확인
				cartDatas.remove(i); // 일치하면 해당 장바구니 리스트에서 제거
				
				return true; // 삭제 성공 반환
			}
		}
		
		return false; // 삭제 실패 반환
	}

	public ArrayList<ProductDTO> selectAll(ProductDTO productDTO) { //전체출력
		// 상품 전체 출력
		ArrayList<ProductDTO> datas= new ArrayList<ProductDTO>();
		if (productDTO.getCondition().equals("PRODUCT")) {
			
			for(ProductDTO data:this.datas) {
				datas.add(data);
			}
		}
		// 장바구니 전체 출력
		else if (productDTO.getCondition().equals("CART")) {
			
			for(ProductDTO data:this.cartDatas) {
				datas.add(data);
			}
		}
		
		return datas;
	}

	public ProductDTO selectOne(ProductDTO productDTO) { 
		// 상품 1개 선택
		if (productDTO.getCondition().equals("PRODUCT")) { // 조건이 "상품"인지 확인
			
			for (ProductDTO data : this.datas) { // 모든 상품 데이터를 순회
				if (data.getNum() == productDTO.getNum()) { // 현재 데이터의 번호가 찾는 번호와 일치하는지 확인
					
					return data; // 일치하는 데이터 반환
				}
			}
			
			return null; // null 반환
		} else if (productDTO.getCondition().equals("CART")) { // 조건이 "장바구니"인지 확인
			// 장바구니 1개 선택
			
			for (ProductDTO data : this.cartDatas) { // 모든 장바구니 데이터를 순회
				if (data.getNum() == productDTO.getNum()) { // 현재 데이터의 번호가 찾는 번호와 일치하는지 확인
					
					return data; // 일치하는 데이터 반환
				}
			}
			
			return null; // null 반환
		}
		return null; // 조건이 맞지 않을 경우 null 반환
	}
}