package model;

import java.util.ArrayList;

public class ProductDAO {
	private ArrayList<ProductDTO> datas;
	public ProductDAO() {
		this.datas=new ArrayList<ProductDTO>();
		
		public ProductDTO selectOne(ProductDTO productDTO) {
			for(ProductDTO data : this.datas) {
				if(productDTO.getNum() == data.getNum()) {
					return data;
				}
			}
			return null;
		}
		public ArrayList<ProductDTO> selectAll(ProductDTO productDTO){
			ArrayList<ProductDTO> datas=new ArrayList<ProductDTO>();
			for(ProductDTO data : this.datas) {
				return datas;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
