package view;

import model.BoardDTO;

public class LoginView extends View {
	// 로그아웃
	// 글 작성
	// 글 삭제
	// 글 내용 변경
	// 회원탈퇴
	public BoardDTO inputBoardData() {
		System.out.print("제목 입력 >> ");
		String title=sc.next();
		System.out.print("내용 입력 >> ");
		String content=sc.next();
		
		BoardDTO data=new BoardDTO();
		data.setTitle(title);
		data.setContent(content);
		return data;
	}
	public void printMenuList() {
		System.out.println("7. 로그아웃");
		System.out.println("8. 글 작성");
		System.out.println("9. 글 삭제");
		System.out.println("10. 글 내용 변경");
		System.out.println("11. 회원탈퇴");
	}
}
