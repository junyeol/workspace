package project;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

		// 학생이 3명있습니다.
		// 학생의 점수를 입력받아주세요.

		
		// 학생의 번호를 입력하세요.
		// >> 3
		// 3번학생의 점수를 출력해주세요.
		
		
			

		// 학생이 3명있습니다.
		int[] stu=new int[3];
		// 학생의 점수를 입력받아주세요.
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<stu.length;i++) {
			while(true) {
				System.out.print((i+1)+"번 학생의 점수를 입력해주세요. >> ");
				stu[i]=sc.nextInt();
				if(0<=stu[i] && stu[i]<=100) {
					break;
				}
				System.out.println("0~100점 사이로 입력해주세요!");
			}
		}

		int num;
		// 학생의 번호를 입력하세요.
		while(true) {
			System.out.print("점수를 알고싶은 학생의 번호 입력 >> ");
			num=sc.nextInt();
			if(1<=num && num<=stu.length) {
				break;
			}
			System.out.println("1~"+stu.length+"번 사이로 입력해주세요!");
		}
		// >> 3
		// 3번학생의 점수를 출력해주세요.

		System.out.println(num+"번 학생의 점수는 "+stu[num-1]+"점입니다.");




	}

}
