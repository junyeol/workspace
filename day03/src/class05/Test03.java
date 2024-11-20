package class05;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		String[]datas=new String[5];//학생5명
		Scanner sc=new Scanner(System.in);
		int cnt=0;
		
		
		while(true) {
			System.out.println("메뉴");
			System.out.println("1. 학생추가");
			System.out.println("2. 학생부 전체출력");
 			System.out.println("3. 이름으로 검색");
			System.out.println("4. 번호로 검색");
			System.out.println("5. 이름변경");
			System.out.println("6. 프로그램 종료");
			System.out.println("0.메뉴입력");
			int menu=sc.nextInt();
			if(menu==0){
				break;//0번을 누른다면)
			}
	        else if(menu==1) {
	        	 // 학생추가
	        	// 저장할수있는 최대로 이미 저장이 되어있는 경우라면
					//저장할수있는(5) 학생의 수가 현재 학생의 수보다 크거나 같다면
	        	 if(cnt>=datas.length) {
	        		 continue;
	        	 }
	        	 
	        	// 정말 _____으로 하시겠습니까?
	        	 String name;
	        	 while(true) {
	        		 System.out.println("저장하고 싶은 학생의 이름을 입력");
	        		 name=sc.next();
	        		 System.out.println("정말"+name+"로 하시겠습니까?");
	        		 String answer=sc.next();
	        		 if(answer.equals("Y")) {
	        		
	        			 boolean flag=false;//학생부에 name이 없는 상태
	        		 		//기본적으로 사용자가 입력한 name이 학생부에 없는것을 가정
	        		 		//학생부 데이터들을 하나하나 확인하면서
	        		 		//데이터 일치여부를 판단
	        		 for(int i=0;i<cnt;i++) {
	        			 if(name.equals(datas[i])) {
	        				 //사용자가 입력한 name값이
	        				 //학생부 데이터와 일치합니다?
	        				 
	        				 //학생부에 name이 있는 상탱
	        				 flag=true;
	        				 System.out.println();
	     			//내가 이름을 추가할때
//	     			만약 이름이 이미 저장되어있다면
//	     			다시 이름을 입력받도록
	        		 
	        	 }
	        }
	        		 	if(!flag) {
	        		 		break;
	        		 	}
	        	 
	        	 datas[cnt]=name;
					cnt++;

					System.out.println(name+"이(가) 저장되었습니다!");
	         }
	         else if(menu==2) {
	            // 학생부 전체출력
	        	// 1번부터 "저장된 학생의 수"만큼 출력
	        	 
	        	 if(cnt<=0) { // 보여줄 데이터가 없다면 == 저장된 데이터가 없음
						System.out.println("보여줄 학생 데이터가 없습니다.");
						continue;
					}
	        	 for(int i=0; i<cnt; i++) {
	        		 System.out.println((i+1)+"번 학생 : "+datas[i]);
	        	 }
	         }
	         else if(menu==3) {
	        	 
	            // 이름으로 검색
	         }
	         else if(menu==4) {
	        	
	            // 번호로 검색
	         }
	         else if(menu==5) {
	            // 이름변경
	         }
	         else { // 유효성 검사
	            System.out.println("제대로 입력해주세요~~");
	         }
	      }
		}
	}
}
}