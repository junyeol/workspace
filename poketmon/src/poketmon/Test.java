package poketmon;

import java.util.Random;
import java.util.Scanner;

//포켓몬 게임
class Poketmon { // 전체 포켓몬
	String type; // 타입
	String name; // 이름
	int level; // 레벨
	int exp; // 경험치

	// 랜덤 목록 (공격시 50% , 경험치 획득 , 잡을 포켓몬 랜덤 출력)
	static Random random = new Random();

	Poketmon(String type, String name) { // 생성자 함수(맴버변수 초기화)
		this.type = type; // 타입받기
		this.name = name; // 이름받기
		this.level = Poketmon.random.nextInt(5) + 1; // 1~5랜덤 레벨 받기
		this.exp = 0; // 경험치 0
	}

	void hello() { // 울음소리 메서드
		System.out.println(this.name + " " + "나는 멋쟁이~" + this.level + "레벨임" + this.exp + "경험치");
	}

	void attack() { // 공격 메서드
		int randomAttack = Poketmon.random.nextInt(2); // randomAttack에서 50%확률
		if (randomAttack == 1) { // 1이면 공격 성공
			int randomExp = Poketmon.random.nextInt(451) + 50; // 경험치 50~500 랜덤 획득
			this.levelup(randomExp); // 레벨업 메서드에게 경험치 전달
		} else { // 1이 아니면 실패
			System.out.println("공격 실패!!!!");
		}
	}

	void levelup(int levelUpExp) { // 이겨서 얻는 경험치 //////////////////고쳐야됩니다!!
		this.level += (levelUpExp + this.exp) / 100; // 100으로 나눈 몫 /(기존 경험치+새로얻은 경험치)는 100당 1레벨업한다.
		this.exp = (levelUpExp + this.exp) % 100;// 100으로 나눈 나머지(기존 경험치+새로얻은 경험치)에서 100당 1레벨업한 후 남은경험치는
		// 현재 경험치가 된다.
	}
	// void rand() { //랜덤 함수 가져가세여~
	// int randomAttack=random.nextInt(1); // 공격확률 50%
	// int randomExp=random.nextInt(451)+50; // 경험치 획득50~500
	// int randomlevel=random.nextInt(5)+1; // 새로 포획시 첫 레벨
	// }
}

class MimeJr extends Poketmon {
	MimeJr() {
		super("에스퍼", "흉내내");
	}

	@Override
	void hello() {
		System.out.println("흉내!흉내!흉내내~~~!");
	}

	@Override
	void attack() {
		System.out.println("흉내내기");
		super.attack();
	}

}

class Togepi extends Poketmon {
	Togepi() {
		super("에스퍼", "토게피");
	}

	@Override
	void hello() {
		System.out.println("토게~~피리리리리리리~");
	}

	@Override
	void attack() {
		System.out.println("애교 부리기");
		super.attack();
	}

}

public class Test {

	public static void newname(String name, String[] datas, int cnt) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("저장하고싶은 포켓몬의 이름을 입력해주세요. >> ");
			name = sc.next();

			System.out.print("정말 " + name + "(으)로 하시겠습니까? (Y/N) >> ");
			String answer = sc.next();

			if (answer.equals("Y")) {

			} 
			else {
				break;
			}
		}
		datas[cnt] = name;
		cnt++;

		System.out.println(name + "이(가) 저장되었습니다!");
	}
	
	public static void ball(String[]datas, int cnt) {
		System.out.println("몬스터 볼 선택");
        System.out.println("1. 몬스터 볼 2. 마스터 볼");

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int monsterBall;

        while(true){
           System.out.print("몬스터볼 선택 >> ");
           monsterBall=sc.nextInt();   

           if(1<=monsterBall&&monsterBall<=2) {
               //System.out.println("로그3");
              break;
           }
           System.out.println("다시 입력해주세요");
        }
	}
        
       // System.out.println("로그1");
        public static void collectPoke(String[]datas, int cnt, int monsterBall,String name) {
        	Random random = new Random();
        	if(monsterBall==1){//일반볼
        	 
           System.out.println("일반 사용");
           int nomal = random.nextInt(10);
           if(nomal == 0) {
              System.out.println(datas[cnt].name+"넌 내꼬얌");
             
             
           }
        }
        else{//마스터볼
              //System.out.println("로그2");
              int master = random.nextInt(2);
              if(master==0) {
                 //System.out.println("로그4");
                 //System.out.println("cnt ="+cnt);
                 
                 
                 System.out.println(datas[cnt].name+" 넌 내꼬얌");
                 
              }
              else {
                 System.out.println("포획 실패");
              }
           }
        System.out.print(datas[1]);

  
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cnt=8;
		String[] datas=new String[cnt];
		
		//시작화면
		System.out.println("포켓몬 게임~~~~~~~~뚠뚜둔");
		System.out.println("안녕? 난 오박사야, 태초마을에 온걸 환영 한다네 허허허");
		System.out.println("아직 포켓몬이 없구나? 포켓몬을 골라보렴");
		System.out.println("1. 잉어킹  2. 단대기  3. 마자용");
		System.out.print("번호 입력>>>");
		//유효성 검사 필요
		while(true) {
			int user=sc.nextInt();
			if (1<=user&&user<=3) { //유효성 검사
				if(user==1) {
					System.out.println("오박사: 잉어킹은 너의 친구가 되었다네~허허허");
					datas[0]="잉어킹";
				}
				else if (user==2) {
					System.out.println("오박사: 단대기는 너의 친구가 되었다네~허허허");
					datas[0]="단대기";
				}
				else{
					System.out.println("오박사: 마자용은 너의 친구가 되었다네~허허허");
					datas[0]="마쟈용";
				}
				break;
			}
			System.out.println("오박사: 여행자여 다시 입력하세용~");
		}
		// 게임 시작
		//      메뉴를 출력한다.
		//      메뉴 1. 싸우기
		//      2. 전체 상태 출력
		//      3. 울음소리 듣기
		//      4. 포켓몬 잡기
		//      0. 게임 종료
		//
		//      입력을 받아야한다.
		//      0번 게임 종료
		//      break;
		//
		//      입력받은 값이 1이라면 싸우기로 넘어가기
		//      1번 랜덤으로 싸울상대 출력
		//      싸울지말지 선택(싸우기, 도망가기)
		//      유효성검사 필요
		//      싸운다면 내 포켓몬 선택
		//      유효성검사 필요
		//      선택 후 공격 실행
		//      성공 한다면 경험치 획득
		//
		//      2번 내 모든 포켓몬 상태창 출력
		//
		//      3번 내 포켓몬 출력         
		//      선택한 포켓몬 울음소리 출력
		//      유효성 검사 필요
		//      모든 울음소리 출력
		while(true) {
			System.out.println("메뉴 선택");
			System.out.println("1. 싸우기 2. 전체 상태창 보기 3. 교감하기 4. 새 포켓몬 잡기 0. 게임종료");
			int user = sc.nextInt();
			System.out.println(user);
			int menu = user;
			//      메뉴를 출력한다.
			//      메뉴 1. 싸우기
			//      2. 전체 상태 출력
			//      3. 울음소리 듣기
			//      4. 포켓몬 잡기
			//      0. 게임 종료
			//
			//      입력을 받아야한다.
			if(menu==0) {
				//0번 게임 종료
				break;
			}
			else if(menu==1) {
				//         입력받은 값이 1이라면 싸우기로 넘어가기
				//         1번 랜덤으로 싸울상대 출력
				//         싸울지말지 선택(싸우기, 도망가기)
				//         유효성검사 필요
				//         싸운다면 내 포켓몬 선택
				//         유효성검사 필요
				//         선택 후 공격 실행
				//         성공 한다면 경험치 획득
			}
			else if(menu==2) {
				//2번 내 모든 포켓몬 상태창 출력
				System.out.println("cnt = "+cnt);
				for(int i=0;i<cnt;i++) {
					System.out.println(datas[i]);
					//datas[i].printPoket();
				}
			}
			else if(menu==3) {
				//         3번 내 포켓몬 출력         
				//         선택한 포켓몬 울음소리 출력
				//         유효성 검사 필요
				//         모든 울음소리 출력
			}




			//
			//      4번 포켓몬 잡기
			//      유효성 검사(사용자 배열이 꽉 차있는경우 게임시작으로~)
			//      전체 포켓몬 출력
			//      출력 후 잡고싶은 포켓몬 입력
			//      확률 몬스터볼 선택(일반 볼10%, 마스터볼50%)
			//      만약 잡았다면 사용자 배열에 추가
			//잡은 포켓몬의 이름 지어주기
			//유효성 검사 : 정말 이 이름으로 하시겠습니까?
			//음음음음음음음음음음 8마리의 포켓몬을
			//또다른 배열에 미리 다 넣어놓고
			//그 아이들을 빼서 출현시켜야 할 듯
			else if(menu==4) {

	               if(cnt > datas.length) {
	                  System.out.println("오박사 : 자넨 이미 포켓몬 마스터라네~");
	                  continue;
	               }

	               String[] data=new String[8];
	               data[0]="으랏차";
	               data[1]="치고마";
	               data[2]="흉내내";
	               data[3]="토게피";
	               data[4]="리아코";
	               data[5]="고라파덕";
	               data[6]="으랏차";
	               data[7]="으랏차";


	               //만약 0을 누르면 돌아가고
	               //다른 숫자를 누르면 다시 입력하게 만들기

	               System.out.println("=== 포켓몬 목록 ===");
	               System.out.println("0번 : 도망가기");
	               for(int i=0;i<data.length;i++) { 
	                  System.out.println((i+1)+"번 포켓몬 : "+data[i]);
	               }
	               System.out.println("===============");

	               int monsterBall;
	               int catchPoke =0;
	               String name;
	               while(true){
	                  System.out.print("포켓몬 선택 >> ");
	                  catchPoke=sc.nextInt();   

	                  if(0<=catchPoke&&catchPoke<=8) {
	                     break;
	                  }
	                  System.out.println("다시 입력해주세요");
	               }

	               if(catchPoke==1) {
	                  System.out.println("앗! 야생"+data[0]+" 가(이) 나타났다!!");
	                  ball(datas, cnt);
	                  collectPoke(datas, cnt,monsterBall,name);
	                  newname(name,datas, cnt);
	                  datas[cnt++] = new 으랏차();
	                  
	               }
	               else if(catchPoke==2) {
	                  System.out.println("앗! 야생"+data[1]+" 가(이) 나타났다!!");
	                  datas[cnt++] = new ();
	                  
	               }
	               else if(catchPoke==3) {
	                  System.out.println("앗! 야생"+data[2]+" 가(이) 나타났다!!");
	                  datas[cnt++] = new Conpang();
	                  
	               }
	               else if(catchPoke==4) {
	                  System.out.println("앗! 야생"+data[3]+" 가(이) 나타났다!!");
	                  datas[cnt++] = new Conpang();
	                  
	               }
	               else if(catchPoke==5) {
	                  System.out.println("앗! 야생"+data[4]+" 가(이) 나타났다!!");
	                  
	                  
	               }
	               else if(catchPoke==6) {
	                  System.out.println("앗! 야생"+data[5]+" 가(이) 나타났다!!");
	                  datas[cnt++] = new Conpang();
	                  
	               }
	               else if(catchPoke==7) {
	                  System.out.println("앗! 야생"+data[6]+" 가(이) 나타났다!!");
	                  
	                  datas[cnt++] = new Conpang();
	               }
	               else if(catchPoke==8) {
	                  System.out.println("앗! 야생"+data[7]+" 가(이) 나타났다!!");
	                  
	                  datas[cnt++] = new Conpang();
	               }
	               else {
	                  System.out.println("오박사 : 제대로 선택해주길 바라네~");
	               }
	            }

	            System.out.println("몬스터 볼 선택");
	            System.out.println("1. 몬스터 볼 2. 마스터 볼");

	            Random random = new Random();

	            int monsterBall;

	            while(true){
	               System.out.print("몬스터볼 선택 >> ");
	               monsterBall=sc.nextInt();   

	               if(1<=monsterBall&&monsterBall<=2) {
	                   //System.out.println("로그3");
	                  break;
	               }
	               System.out.println("다시 입력해주세요");
	            }
	           // System.out.println("로그1");
	            if(monsterBall==1){//일반볼
	               
	               System.out.println("일반 사용");
	               int nomal = random.nextInt(10);
	               if(nomal == 0) {
	                  System.out.println(datas[cnt].name+"넌 내꼬얌");
	                  datas[cnt]=to;
	                  cnt++;
	                 
	               }
	            }
	            else{//마스터볼
	                  //System.out.println("로그2");
	                  int master = random.nextInt(2);
	                  if(master==0) {
	                     //System.out.println("로그4");
	                     //System.out.println("cnt ="+cnt);
	                     
	                     datas[cnt]=to;
	                     System.out.println(datas[cnt].name+" 넌 내꼬얌");
	                     cnt++;
	                  }
	                  else {
	                     System.out.println("포획 실패");
	                  }
	               }
	            System.out.print(datas[1]);

	      }

				}
			}
		}
	}