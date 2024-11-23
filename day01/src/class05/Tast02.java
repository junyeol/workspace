package class05;

import java.util.Scanner;

public class Tast02 {
	public static void main(String[] args) {
		//1번
		
		//정수 3개 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		
		//오름차순이 되도록 데이터 변경
		if(a<b||b<c) {
			System.out.println("a="+a+ "b="+b+ "c="+c);
		}
		else if(a<b||b>c) {
			System.out.println("a=" +a+ "c="+b+ "b="+c);
		}
		
	}
}
