package poketmon;

import java.util.Random;
import java.util.Scanner;

public class TestProject {

	public static void main(String[] args) {
		
		// 사용할 변수 선언
		String name = null;		//명예전당 이름 변수
		int answer = 0;	// 첫 게임 때 명예 전당 나오지 않도록 방지용 
		int bestScore = 6;		//최고 점수 넣는 변수(처음 기준점 : 6미만)
		long bestTime = 0; //  최단 시간
		
		Scanner sc=new Scanner(System.in);
		
		while (true) {			// 게임을 시작하는 것
			// 게임이 시작시 리셋되어야하는 변수
			// 최대값, 최소값, 사용자 입력값, 
			int max = 100, min = 1, num, tryTime = 0;		//범위 값(max, min), 시도 횟수
			int collect = 0;	//정답

			System.out.println(" UP/DOWM 게임이 시작됩니다. "+(answer+1)+"회차");
			if(answer != 0) {		//만약 첫 게임이 아니라면
				//명예전당 출력
				System.out.println("[🏆 명예의 전당 : "+ name +" 🏆]");
			} 

			Random rand=new Random();	//랜덤 객체 생성
			
			//정답
			collect = rand.nextInt(100)+1; // 1~100까지의 랜덤 숫자 생성, 정답

			long startTime = System.currentTimeMillis();	//게임 시작시간 측정
			//System.out.println("랜덤 숫자 : "+collect);

			while(true) {				// 값을 입력하면서 맞추는 부분

				while(true) { // 사용자가 입력한 번호가 랜덤번호보다 작을 때 까지 실행

					System.out.println(min+"~"+max+" 사이값만 쓰세요");
					System.out.print("어디 한번 맞춰보세요 : ");
					num=sc.nextInt();
					
					if(min<=num && num <=max) {	//입력값이 1과 100사이면
						tryTime++;				//시도횟수
						break;
					}
				}
				
				if(num == collect) { //입력값이 정답과 같으면
					break;
				}
				
				
				if(num>collect) { // 입력값이 정답보다 크면
					System.out.println("Down!");
					max = num;
				}
				else {				// 입력값이 정답보다 작으면
					System.out.println("Up!");
					min = num;
				}

			}
			answer++;
			long finishTime = System.currentTimeMillis();    // 게임이 끝난 시간            
			long time = finishTime - startTime;             // 걸린 시간 
			System.out.println("elapsedTime(ms) : " + time);	 // 걸린시간 출력

			// 1s = 1,000ms
	       
	 //-----------------------------------------------------------------
	
	       	       
		if(tryTime < bestScore) {  //시도한 횟수가 최고 기록보다 적으면
			//명예전당에 이름을 등록
			System.out.print("명예의 전당에 이름을 등록하세요 >> ");
			sc.nextLine();
			name = sc.nextLine();
			bestTime = time;		// 걸린시간도 기록
			
		}
		
	    else if(tryTime == bestScore && time < bestTime) {	//시도한 횟수가 같고, 걸린시간이 최고기록보다 빠르면
	    	//명예전당에 이름 등록
	    	System.out.print("명예의 전당에 이름을 등록하세요 >> ");
	    	sc.nextLine();
			name = sc.nextLine();
			bestTime = time;	;	//걸린시간도 기록
			
	   }
		
		}
	}
}
