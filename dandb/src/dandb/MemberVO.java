package dandb;

public class MemberVO {
	
	private String memberId;
	private String memberPwd;
	private String memberName;
	private String phone;
	private String birthday;
	private String email;
	private String gender;
	private String gradeId;
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPwd() {
		return memberPwd;
	}
	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGradeId() {
		return gradeId;
	}
	public void setGradeId(String gradeId) {
		this.gradeId = gradeId;
	}
	
	@Override
	public String toString() {
		return "MemberVO [memberId=" + memberId + ", memberPwd=" + memberPwd + ", memberName=" + memberName + ", phone="
				+ phone + ", birthday=" + birthday + ", email=" + email + ", gender=" + gender + ", gradeId=" + gradeId
				+ "]";
	}
	
} //end class
