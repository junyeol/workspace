package service.model;

import java.util.ArrayList;

import service.model.StudentDAO;
import service.model.StudentDTO;
import view.StudentView;

public class StudentController {
	private StudentDAO model;
	private StudentView view;
	private int PK;
	public StudentController() {
		this.model=new StudentDAO();
		this.view=new StudentView();
		this.PK=104;
	}

	// 사용자(Client)에게 [M과 V를 조합해서] 서비스를 제공하는 역할
	public void start() {
		while(true) {
			view.print01();
			int action=view.inputAction();

			if(action==1) {
				view.print02();
				String name=view.inputName();
				view.print03();
				int score=view.inputScore();
				
				StudentDTO dto=new StudentDTO();
				dto.setNum(PK++);
				dto.setName(name);
				dto.setScore(score);
				boolean flag=model.insert(dto);
				if(flag) {
					view.print04();
				}
				else {
					// 실패했습니다.
				}
			}
			else if(action==2) {
				StudentDTO dto=new StudentDTO();
				dto.setCondition("ALL");
				ArrayList<StudentDTO> datas=model.selectAll(dto);
				view.print05(datas);
			}
			else if(action==3) {
				view.print07();
				int num=view.inputNum(PK);
				
				StudentDTO dto=new StudentDTO();
				dto.setNum(num);
				StudentDTO data=model.selectOne(dto);
				
				view.print08(data);			
			}
			else if(action==4) {
				view.print12();
				String searchKeyword=view.inputName();
				
				StudentDTO dto=new StudentDTO();
				dto.setName(searchKeyword);
				dto.setCondition("SEARCH_NAME");
				ArrayList<StudentDTO> datas=model.selectAll(dto);
				view.print13(datas);
			}
			else if(action==5) {
				StudentDTO dto=new StudentDTO();
				dto.setCondition("ALL");
				ArrayList<StudentDTO> datas=model.selectAll(dto);
				
				// 데이터 정제, 가공
				int sum=0;
				for(StudentDTO data:datas) {
					sum+=data.getScore();
				}
				double avg=sum*1.0/datas.size();
				
				/*
				StudentDTO data=model.selectOne();
				double avg=data.getAvg();
				*/
				
				view.print14(avg);
			}
			else if(action==6) {
				view.print07();
				int num=view.inputNum(PK);
				view.print03();
				int score=view.inputScore();
				
				StudentDTO dto=new StudentDTO();
				dto.setNum(num);
				dto.setScore(score);
				boolean flag=model.update(dto);
				
				if(flag) {
					view.print15();
				}
				else {
					view.print16();
				}
			}
			else if(action==7) {
				view.print09();
				int num=view.inputNum(PK);
				
				StudentDTO dto=new StudentDTO();
				dto.setNum(num);
				boolean flag=model.delete(dto);
				if(flag) {
					view.print10();
				}
				else {
					view.print11();
				}
			}
			else if(action==0) {
				break;
			}
		}
	}
}
