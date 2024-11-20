package model;

import java.util.ArrayList;

public class MemberDAO {
	private ArrayList<MemberDTO> datas;
	public MemberDAO() {
		this.datas = new ArrayList<MemberDTO>();
		
		MemberDTO data=new MemberDTO();
		data.setMid("teemo");
		data.setPassword("1234");
		data.setName("작은티모");
		this.datas.add(data);
	}
	
	public boolean insert(MemberDTO memberDTO) {
		for(MemberDTO data:this.datas) {
			if(data.getMid().equals(memberDTO.getMid())) {
				return false;
			}
		}
		
		MemberDTO data=new MemberDTO();
		data.setMid(memberDTO.getMid());
		data.setPassword(memberDTO.getPassword());
		data.setName(memberDTO.getName());
		this.datas.add(data);
		return true;
	}
	private boolean update(MemberDTO memberDTO) {
		return false;
	}
	public boolean delete(MemberDTO memberDTO) {
		for(int i=0;i<this.datas.size();i++) {
			if(this.datas.get(i).getMid().equals(memberDTO.getMid())){
				this.datas.remove(i);
				return true;
			}
		}
		return false;
	}

	private ArrayList<MemberDTO> selectAll(MemberDTO memberDTO) {
		ArrayList<MemberDTO> datas = new ArrayList<MemberDTO>();
		return datas;
	}
	public MemberDTO selectOne(MemberDTO memberDTO) {
		for(MemberDTO data:this.datas) {
			if(data.getMid().equals(memberDTO.getMid())) {
				if(data.getPassword().equals(memberDTO.getPassword())) {
					return data;
				}
			}
		}
		return null;
	}
}
