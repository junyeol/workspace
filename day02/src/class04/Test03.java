package class04;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
//		정수를 입력받습니다
//		입력된 정수가 짝수라면 총합에 더해주세요
//		0이하가 입력되면 멈춥니다
//		멈추고서 최종 총합을 출력해주세요
		
		Scanner sc = new Scanner(System.in);
		int num;//입력되는 값의 저장공간
		int res=0;//총합
		
		//입력되는 값의 횟수를 모름 - while
		//입력된 정수가 짝수라면 - if
		//총합에 더해주세요 - ?
		//그렇다면 홀수가 입력된다면?
		//만약 0이하가 입력되면 - if num<0
		//멈춥니다 - break
		//멈추고서 최종 총합을 출력 - syso res???
		
		while(true) {
			System.out.println("정수입력");
			 num=sc.nextInt();
				if (num%2==0) {//입력되는 값이 짝수라면
					res+=num; //총합에 더해주세요
				}
				if(num<=0) {//입력되는 값이 0이하라면
					System.out.println("종료");
					break;//종료
				}
		}
		System.out.println("총합의 합="+res);
		
		
		//종료조건을 먼저 했어야 했음
		}
	}

