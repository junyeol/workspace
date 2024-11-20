package fileInOut;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

// [파일 입출력]
public class Test01 {
	
	public static void main(String[] args) {
		
		String filePath="D:\\KIM\\workspace\\day020\\src\\class01\\";
		// 실습경로
		String fileName="test.txt";
		// 확장자를 반드시 함께 작성
		
		FileReader fileReader;
		String line="";
		try {
			fileReader = new FileReader(filePath+fileName);
			
			BufferedReader reader=new BufferedReader(fileReader);
				
			line=reader.readLine();
			/*
			while( (line=reader.readLine()) != null ) {
				System.out.println("line : "+line);
			}
			*/
			// 코드가 패턴화(템플릿화)되었다.
		} catch (FileNotFoundException e) {
			System.out.println("파일명이 올바르지않습니다!");
		} catch (IOException e) {
			System.out.println("입출력 과정중에 에러가 발생했습니다!");
		}
		
		// 자료형변환(타입캐스팅)을 담당하는 클래스
		//  == Wrapper 클래스
		int ansNum=Integer.parseInt(line);
		int startNum=1;
		int endNum=50;
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print(startNum+" ~ "+endNum+" 중에서 정수 입력 >> ");
			int num=sc.nextInt();
			
			if(ansNum < num) {
				System.out.println("DOWN!");
				endNum=num-1;
			}
			else if(ansNum > num) {
				System.out.println("UP!");
				startNum=num+1;
			}
			else {
				break;
			}
		}
		System.out.println("정답입니다! :D");
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
