package class03;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		//정수를 입력하는데 0이하의 정수가 입력되면 종료
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("정수입력");
			int num=sc.nextInt();
			if(num<=0){
				//0이하의 정수가 입력되었다면{
				break;//자신과 가장 가까운 반복문을 즉시 빠져나옵니다.
			}
				System.out.println("num="+num);
		}
		
		//학생의 이름을 입력하느데 "종료"라고 입려가면 종료
		while(true) {//무한반복문에는
			System.out.println("학생이름입력");
			String name=sc.next();
			
			if(name.equals("종료")) {//이름입력이 == 종료, 반드시 종료조건이 있다
				break;
			}
		}
		//정수를 입력해주세요. 총합이 100이 넘어가면 종료
		int sum=0;
				
		while(true) {
			System.out.println("정수입력");
			int num=sc.nextInt();
			sum+=num;
			System.out.println("sum="+sum);
			if(sum>100) {//총합이 100을 넘어가면
				break;
					}
				}
	
	
	
	}
}
