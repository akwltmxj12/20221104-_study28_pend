package pend.auurius.study28.dto;

public class ContentDto {

	
	private int mid;	//게시판 글 번호
	private String mwriter;	// 게시판 글쓴이
	private	String mcontert;	// 게시판 내용

	
	public ContentDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ContentDto(int mid, String mwriter, String mcontert) {
		super();
		this.mid = mid;
		this.mwriter = mwriter;
		this.mcontert = mcontert;
	}


	public int getMid() {
		return mid;
	}


	public void setMid(int mid) {
		this.mid = mid;
	}


	public String getMwriter() {
		return mwriter;
	}


	public void setMwriter(String mwriter) {
		this.mwriter = mwriter;
	}


	public String getMcontert() {
		return mcontert;
	}


	public void setMcontert(String mcontert) {
		this.mcontert = mcontert;
	}

	
}
