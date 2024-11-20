package view;

import model.MemberDTO;

public class LogoutView extends View {
	// 회원가입
	// 로그인
	public String inputMid() {
		System.out.print("아이디 입력 >> ");
		String mid=sc.next();
		return mid;
	}
	public MemberDTO inputJoinInfo() {
		System.out.print("비밀번호 입력 >> ");
		String password=sc.next();
		System.out.print("이름 입력 >> ");
		String name=sc.next();
		MemberDTO data=new MemberDTO();
		data.setPassword(password);
		data.setName(name);
		return data;
	}
	public void printMenuList() {
		System.out.println("5. 로그인");
		System.out.println("6. 회원가입");
	}
	public MemberDTO inputLoginInfo() {
		System.out.print("아이디 입력 >> ");
		String mid=sc.next();
		System.out.print("비밀번호 입력 >> ");
		String password=sc.next();
		MemberDTO data=new MemberDTO();
		data.setMid(mid);
		data.setPassword(password);
		return data;
	}
}
