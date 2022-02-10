package app;

public class MemberVo {
	private String division_id;
	private String division_name;
	private String step0;
	private String step1;
	
	public MemberVo(String division_id, String division_name, String step0, String step1) {
		this.division_id = division_id;
		this.division_name = division_name;
		this.step0 = step0;
		this.step1 = step1;
	}

	public String getDivision_id() {
		return division_id;
	}

	public void setDivision_id(String division_id) {
		this.division_id = division_id;
	}

	public String getDivision_name() {
		return division_name;
	}

	public void setDivision_name(String division_name) {
		this.division_name = division_name;
	}

	public String getStep0() {
		return step0;
	}

	public void setStep0(String step0) {
		this.step0 = step0;
	}

	public String getStep1() {
		return step1;
	}

	public void setStep1(String step1) {
		this.step1 = step1;
	}
	
	
}
