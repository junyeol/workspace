package class01;

class Product{
	int num; //PK
	String name;//이름
	int cnt;//재고
	int price;//가격
	//생성자 오버로딩
	Product(int num, String name){
		this.num=num;//(PK)시스템에서 부여하는 값;
		this.name=name;//상품명
		this.cnt=0;//재고
		this.price=0;//가격
	}
	Product(int num, String name,int cnt, int price){
		this.num=num;//(PK)시스템에서 부여하는 값;
		this.name=name;//상품명
		this.cnt=cnt;//재고
		this.price=price;//가격
	}
}

public class Test01 {
	
	
	
	public static void main(String[] args) {
	
		
		
		Product p1=new Product(1001,"운동화");
		Product p2=new Product(1002,"우산", 10, 4000);
		
	}
}	
