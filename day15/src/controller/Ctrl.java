package controller;

import java.util.ArrayList;

import model.BoardDAO;
import model.BoardDTO;
import model.MemberDAO;
import model.MemberDTO;
import view.LoginView;
import view.LogoutView;
import view.MainView;

// 로그아웃
public class Ctrl {
	private BoardDAO boardDAO;
	private MemberDAO memberDAO;
	private MainView mainView;
	private LoginView loginView;
	private LogoutView logoutView;
	private int PK;
	private MemberDTO user;
	// 현재 로그인상태인지 아닌지를 판단하는 변수
	public Ctrl() {
		this.boardDAO=new BoardDAO();
		this.memberDAO=new MemberDAO();
		this.mainView=new MainView();
		this.loginView=new LoginView();
		this.logoutView=new LogoutView();
		this.PK=1001;
		this.user=null;
		// 로그아웃 상태
	}

	public void start() {
		while(true) {
			mainView.printMenuList();
			if(user == null) { // 로그아웃 상태라면,
				logoutView.printMenuList();
			}
			else {
				loginView.printMenuList();
			}
			int menu=mainView.inputMenuNum();

			if(menu==0) {
				break;
			}
			else if(menu==1) {

			}
			else if(menu==2) {

			}
			else if(menu==3) {

			}
			else if(menu==4) {

			}
			else if(menu==5) { // 로그인
				MemberDTO data=logoutView.inputLoginInfo();
				System.out.println("로그 01");
				System.out.println(data);
				data=memberDAO.selectOne(data);
				System.out.println("로그 02");
				System.out.println(data);

				if(data != null) { // 로그인에 성공한 경우
					user=data; // 로그인 상태로 변환 !!!
					mainView.printTrue();
				}
				else {
					mainView.printFalse();
				}
			}
			else if(menu==6) { // 회원가입
				MemberDTO memberDTO;
				String mid;
				while(true) {
					mid=logoutView.inputMid();

					memberDTO=new MemberDTO();
					memberDTO.setMid(mid);
					memberDTO = memberDAO.selectOne(memberDTO);
					if(memberDTO == null) { // 아이디 중복 x
						break;
					}
				}
				memberDTO=logoutView.inputJoinInfo();

				MemberDTO dto=new MemberDTO();
				dto.setMid(mid);
				dto.setPassword(memberDTO.getPassword());
				dto.setName(memberDTO.getName());
				boolean flag = memberDAO.insert(dto);
				if(flag) {
					mainView.printTrue();
				}
				else {
					mainView.printFalse();
				}
			}
			else if(menu==7) { // 로그아웃
				user = null;
				mainView.printTrue();
			}
			else if(menu==8) {
				BoardDTO data=loginView.inputBoardData();
				System.out.println("로그01");
				System.out.println(data);

				data.setNum(PK++);
				data.setWriter(user.getMid());
				System.out.println("로그02");
				System.out.println(data);
				boolean flag=boardDAO.insert(data);

				if(flag) {
					mainView.printTrue();
				}
				else {
					mainView.printFalse();
				}
			}
			else if(menu==9) {
				BoardDTO boardDTO=new BoardDTO();
				boardDTO.setWriter(user.getMid());
				boardDTO.setCondition("WRITER");
				ArrayList<BoardDTO> datas=boardDAO.selectAll(boardDTO);

				int num=mainView.printBoardList(datas);

				boardDTO=new BoardDTO();
				boardDTO.setNum(num);
				boolean flag=boardDAO.delete(boardDTO);

				if(flag) {
					mainView.printTrue();
				}
				else {
					mainView.printFalse();
				}
			}
			else if(menu==10) {

			}
			else if(menu==11) {			
				BoardDTO boardDTO=new BoardDTO();
				boardDTO.setWriter(user.getMid());
				boardDTO.setCondition("WRITER");
				ArrayList<BoardDTO> datas=boardDAO.selectAll(boardDTO);

				// ※※※ FK 먼저 제거하고, PK 제거 ※※※
				boolean flag=false;
				for(int i=0;i<datas.size();i++) {
					boardDTO=new BoardDTO();
					boardDTO.setNum(datas.get(i).getNum());
					flag=boardDAO.delete(boardDTO);
					if(!flag) {
						mainView.printFalse();
						break;
					}
				}
				
				if(!flag) {
					continue;
				}
				
				MemberDTO memberDTO=new MemberDTO();
				memberDTO.setMid(user.getMid());
				flag=memberDAO.delete(memberDTO);
				if(flag) {
					user = null; // 로그아웃 처리하기 !
					mainView.printTrue();
				}
				else {
					mainView.printFalse();
				}
			}












		}
	}
}
