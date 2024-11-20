package service.model;

import java.util.ArrayList;

// MVC 패턴에서 DBMS를 DAO라고 함
public class StudentDAO {
	private ArrayList<StudentDTO> datas;

	public StudentDAO() {
		System.out.println("   service.model.StudentDAO  StudentDAO() 생성자 시작");
		datas=new ArrayList<StudentDTO>();

		StudentDTO data1=new StudentDTO();
		data1.setNum(101);
		data1.setName("오리아나");
		data1.setScore(50);
		datas.add(data1);

		StudentDTO data2=new StudentDTO();
		data2.setNum(102);
		data2.setName("모르가나");
		data2.setScore(89);
		datas.add(data2);

		StudentDTO data3=new StudentDTO();
		data3.setNum(103);
		data3.setName("티모");
		data3.setScore(67);
		datas.add(data3);
		System.out.println("   service.model.StudentDAO  StudentDAO() 생성자 종료");
	}

	// CUD : output이 booelan
	public boolean insert(StudentDTO studentDTO) {
		System.out.println("   service.model.StudentDAO  insert() 시작");
		// DBMS에 data를 추가 == AL에 DTO를 추가
		StudentDTO data=new StudentDTO();
		data.setNum(studentDTO.getNum());
		data.setName(studentDTO.getName());
		data.setScore(studentDTO.getScore());
		datas.add(data);
		System.out.println("   service.model.StudentDAO  insert() 종료");
		return true;
	}
	public boolean update(StudentDTO studentDTO) {
		System.out.println("   service.model.StudentDAO  update() 시작");
		for(StudentDTO data:datas) {
			if(data.getNum() == studentDTO.getNum()) {
				data.setScore(studentDTO.getScore());
				System.out.println("   service.model.StudentDAO  update() 종료 : 성공");
				return true;
			}
		}
		System.out.println("   service.model.StudentDAO  update() 종료 : 실패");
		return false;
	}
	public boolean delete(StudentDTO studentDTO) {
		System.out.println("   service.model.StudentDAO  delete() 시작");
		for(int i=0;i<datas.size();i++) {
			if(studentDTO.getNum() == datas.get(i).getNum()) {
				datas.remove(i);
				System.out.println("   service.model.StudentDAO  delete() 성공");
				return true;
			}
		}
		System.out.println("   service.model.StudentDAO  delete() 실패");
		return false;
	}

	public ArrayList<StudentDTO> selectAll(StudentDTO studentDTO) {
		ArrayList<StudentDTO> datas=new ArrayList<StudentDTO>();

		if(studentDTO.getCondition().equals("ALL")) {
			for(StudentDTO data:this.datas) {
				datas.add(data);
			}
			return datas;
		}
		else if(studentDTO.getCondition().equals("SEARCH_NAME")) {
			for(StudentDTO data:this.datas) {
				if(data.getName().contains(studentDTO.getName())) {
					datas.add(data);
				}
			}
		}

		return datas;
	}
	public StudentDTO selectOne(StudentDTO studentDTO) {
		System.out.println("   service.model.StudentDAO  selectOne() 시작");
		for(StudentDTO data:datas) {
			if(data.getNum()==studentDTO.getNum()) {
				System.out.println("   service.model.StudentDAO  selectOne() 데이터 일치");
				return data;
			}
		}
		System.out.println("   service.model.StudentDAO  selectOne() 데이터 불일치");
		return null;
	}
	/*
	public StudentDTO selectOne() {
		System.out.println("   service.model.StudentDAO  selectOne() 시작 : 평균");
		int sum=0;
		for(StudentDTO data:datas) {
			sum+=data.getScore();
		}
		double avg=sum*1.0/datas.size();
		StudentDTO dto=new StudentDTO();
		dto.setAvg(avg);
		System.out.println("   service.model.StudentDAO  selectOne() 종료 : 평균");
		return dto;
	}
	*/
}
