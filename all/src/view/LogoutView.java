package view;

import java.util.Scanner;

import model.MemberDTO;

public class LogoutView {
	private static Scanner sc; 

	public LogoutView(){
		sc = new Scanner(System.in);
	}
	
	//메뉴리스트출력
	public void printMenuList() {
		//로그인
		//회원가입
		System.out.println("1.로그인");
		System.out.println("2.회원가입");
	}
	//회원가입
	//아이디입력

	public String inputMemberId() {
		//아이디입력
		System.out.print("아이디 입력 >> ");
		String memberId=sc.next();
		return memberId;

	}
	//아이디 중복 체크 실패시
	public void failID() {
		System.out.println("아이디가 중복되었습니다 다시 입력해주세요");
	}
	//비밀번호입력
	public String inputPassword() {
		String password;
		String secondPassword;
		while(true) {
			System.out.print("비밀번호 입력 >> ");
			password=sc.next();
			//비밀번호 확인유효성
			//2번째 비밀번호 입력
			System.out.print("비밀번호 확인 >>");
			secondPassword=sc.next();
			if(password.equals(secondPassword) ) {//첫번째 비밀번호와 두번째 비밀번호가 같다면
				//비밀번호 입력

				return password;
			}
			System.out.println("다시입력해주세요");
		}
	}
	public void createMember() {
		//회원가입 성공
		System.out.println("회원가입에 성공하셨습니다! 환영합니다!");
	}
	public void failMember() {
		//회원가입 실패
		System.out.println("회원가입에 실패하셨습니다");
	}



	
	public MemberDTO inputLoginInfo() {
		//아이디입력
		//비밀번호입력
		System.out.print("아이디 입력 >> ");
		String loginId=sc.next();
		System.out.print("비밀번호 입력 >> ");
		String loginPassword=sc.next();
		MemberDTO data=new MemberDTO();
		data.setMemberId(loginId);
		data.setPassword(loginPassword);
		return data;

	}
	//로그인 성공
	public void loginSuccess() {
		//로그인에 성공했습니다! 환영합니다!
		System.out.println("로그인에 성공했습니다! 환영합니다!");
	}
//로그인 실패
	public void loginFail() {
		System.out.println("로그인 정보가 잘못되었습니다");
	}

}
