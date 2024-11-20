package class02;
//함수2유형
//input o output x

public class Test02 {
	//정수를 1개 외부에서 받아오면
	//*100을 해서 화면에 출력해주는 함수
	public static void test(int num) {
		num*=100;
		System.out.println(num);
	}
	
	
	
	public static void main(String[] args) {
		int num=2;
		test(num);
		//함수를 호출할대 인자를 전달하는 방식
		// : 해당 변수의 값만을 전달
		// ==call by value(값에 의한 호출)
	}
}
