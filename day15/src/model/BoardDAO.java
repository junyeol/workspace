package model;

import java.util.ArrayList;

public class BoardDAO {
	private ArrayList<BoardDTO> datas;
	public BoardDAO() {
		this.datas = new ArrayList<BoardDTO>();
		
		BoardDTO data1=new BoardDTO();
		data1.setNum(101);
		data1.setTitle("제목");
		data1.setWriter("teemo");
		this.datas.add(data1);
		
		BoardDTO data2=new BoardDTO();
		data2.setNum(102);
		data2.setTitle("제목");
		data2.setWriter("ari");
		this.datas.add(data2);
		
		BoardDTO data3=new BoardDTO();
		data3.setNum(103);
		data3.setTitle("제목");
		data3.setWriter("teemo");
		this.datas.add(data3);
	}
	
	public boolean insert(BoardDTO boardDTO) {
		BoardDTO data=new BoardDTO();
		data.setNum(boardDTO.getNum());
		data.setTitle(boardDTO.getTitle());
		data.setContent(boardDTO.getContent());
		data.setWriter(boardDTO.getWriter());
		data.setCnt(0);
		this.datas.add(data);		
		return true;
	}
	public boolean update(BoardDTO boardDTO) {
		for(BoardDTO data:this.datas) {
			if(data.getNum()==boardDTO.getNum()) {
				data.setContent(boardDTO.getContent());
			}
		}
		return true;
	}
	public boolean delete(BoardDTO boardDTO) {
		for(int i=0;i<this.datas.size();i++) {
			if(this.datas.get(i).getNum()==boardDTO.getNum()) {
				this.datas.remove(i);
				return true;
			}
		}
		return false;
	}

	public ArrayList<BoardDTO> selectAll(BoardDTO boardDTO) {
		ArrayList<BoardDTO> datas = new ArrayList<BoardDTO>();
		if(boardDTO.getCondition().equals("ALL")) {
			for(BoardDTO data:this.datas) {
				datas.add(data);
			}
		}
		else if(boardDTO.getCondition().equals("TITLE")) {
			for(BoardDTO data:this.datas) {
				if(data.getTitle().contains(boardDTO.getTitle())) {
					datas.add(data);
				}
			}
		}
		else if(boardDTO.getCondition().equals("WRITER")) {
			for(BoardDTO data:this.datas) {
				if(data.getWriter().contains(boardDTO.getWriter())) {
					datas.add(data);
				}
			}
		}
		return datas;
	}
	public BoardDTO selectOne(BoardDTO boardDTO) {
		for(BoardDTO data:this.datas) {
			if(data.getNum()==boardDTO.getNum()) {
				return data;
			}
		}
		return null;
	}
}
