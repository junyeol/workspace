package model;

import java.util.ArrayList;

// CRUD(비즈니스 메서드, 핵심 관심, 핵심 로직)
// CRUD 인자를 DTO로 통합하자!!!!! == 코드의 결합도를 낮추기위함
public class BoardDAO {
	private ArrayList<BoardDTO> datas; // DB 역할
	public BoardDAO() {
		this.datas=new ArrayList<BoardDTO>();

		// 샘플 데이터 추가할수있는 공간
		BoardDTO data=new BoardDTO();
		data.setNum(101);
		data.setTitle("샘플");
		data.setContent("ㅈㄱㄴ");
		data.setCnt(0);
		this.datas.add(data);
	}

	public boolean insert(BoardDTO boardDTO) {
		BoardDTO data=new BoardDTO();
		data.setNum(boardDTO.getNum());
		data.setTitle(boardDTO.getTitle());
		data.setContent(boardDTO.getContent());
		data.setCnt(0);
		this.datas.add(data);
		return true;
	}
	public boolean update(BoardDTO boardDTO) {
		if(boardDTO.getCondition().equals("VIEW")) {
			for(BoardDTO data:this.datas) {
				if(data.getNum() == boardDTO.getNum()) {
					data.setCnt(data.getCnt()+1); // 현재방문자수+1
					return true;
				}
			}
			return false;
		}
		else if(boardDTO.getCondition().equals("CONTENT")) {
			for(BoardDTO data:this.datas) {
				if(data.getNum() == boardDTO.getNum()) {
					data.setContent(boardDTO.getContent());
					return true;
				}
			}
			return false;
		}
		else if(boardDTO.getCondition().equals("TITLE")) {
			for(BoardDTO data:this.datas) {
				if(data.getNum() == boardDTO.getNum()) {
					data.setTitle(boardDTO.getTitle());
					return true;
				}
			}
			return false;
		}
		return false;
	}
	public boolean delete(BoardDTO boardDTO) {
		for(int i=0;i<this.datas.size();i++) {
			if(datas.get(i).getNum() == boardDTO.getNum()) {
				datas.remove(i);
				return true;
			}
		}
		return false;
	}

	public ArrayList<BoardDTO> selectAll(BoardDTO boardDTO){
		ArrayList<BoardDTO> datas=new ArrayList<BoardDTO>();
		if(boardDTO.getCondition().equals("ALL")) {
			for(BoardDTO data:this.datas) {
				datas.add(data);
			}
		}
		else if(boardDTO.getCondition().equals("SEARCH_TITLE")) {
			for(BoardDTO data:this.datas) {
				if(data.getTitle().contains(boardDTO.getTitle())) {
					datas.add(data);
				}
			}
		}
		return datas;
	}
	public BoardDTO selectOne(BoardDTO boardDTO){
		for(BoardDTO data:this.datas) {
			if(data.getNum() == boardDTO.getNum()) {
				return data;
			}
		}
		return null;
	}
}
