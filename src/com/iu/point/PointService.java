package com.iu.point;

import java.util.ArrayList;

public class PointService {

	private PointDAO pointDAO;

	public PointService() {
		this.pointDAO = new PointDAO();
	}

	// 1. List
	public ArrayList<PointDTO> pointList() throws Exception {
		return pointDAO.pointList();
	}

	// 2. select
	public PointDTO pointSelect(int num) throws Exception {
		return pointDAO.pointSelect(num);
	}

	// 3. deletes
	public int pointDelete(int num)throws Exception{
		return pointDAO.pointDelete(num);
	}
	
	// 4. Add
	public int pointAdd(PointDTO pointDTO) throws Exception {
		pointDTO.setTotal(pointDTO.getKor() + pointDTO.getEng() + pointDTO.getMath());
		pointDTO.setAvg(pointDTO.getTotal() / 3.0);
		int result = pointDAO.pointAdd(pointDTO);
		
		return result;
	}
	
	// 5. Mod
	public int pointMod(PointDTO pointDTO) throws Exception {
		pointDTO.setTotal(pointDTO.getKor() + pointDTO.getEng() + pointDTO.getMath());
		pointDTO.setAvg(pointDTO.getTotal() / 3.0);
		int result = pointDAO.pointMod(pointDTO);
		
		return result;
	}
	

}
