package app;

public class MemberVo {
	private String seller_id;
	private String seller_pwd;
	
	public MemberVo(String id, String pwd) {
		seller_id = id;
		seller_pwd = pwd;
	}
	
	public String getId() {
		return seller_id;
	}
	
	public String getPwd() {
		return seller_pwd;
	}
}
