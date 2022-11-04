package pend.auurius.study28.dao;

import java.util.ArrayList;

import pend.auurius.study28.dto.ContentDto;

public interface IDao {
	// 추상 메소드 3개
	public void deleteDao(String mid);
	public void writeDao(String mwriter, String mcontent);
	public ArrayList<ContentDto> listDao();			//  
	
	
}
