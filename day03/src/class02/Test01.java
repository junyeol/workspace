package class02;
//함수 1유형
//input x output x
public class Test01 {
	//함수 선언 자리
	//void == output이 없다
	//static == 객체와 무관하게
	public static void hello() {
		System.out.println("안녕하세요");
		//기능구현
	}
	//함수라는 것을  개발할때 사용하는 이유
	//1.코드를 재사용할수있다
	//->오류가 없는 코드를 재사용하는것이기때문에
	//오류 검사 비용이 추가x->경제적
	//시간이 추가x->효율적
	//=>오류의 파급효과가 줄어든다
	//2.main의 코드 가독성이 좋아진다.
	public static void main(String[] args) {
		//함수를 선언하는 행위와	: 함수 정의
		//함수를 사용하는 행위는 서로 다르다	:	함수 호출

		hello();
	}
}
