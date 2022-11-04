package pend.auurius.study28.dao;

import java.util.ArrayList;

import pend.auurius.study28.dto.ContentDto;

public interface IDao {
	// 추상 메소드 3개
	public void deleteDao(String mid); 		// 삭제만하면되니 매게변수 id만 필요하고 그외는 필요없다.
	public void writeDao(String mwriter, String mcontent);	
	public ArrayList<ContentDto> listDao();			//  
	
	
}
