package member.model;


import dandb.MemberVO;

public interface MemberDAO {
	
	void insertMember(MemberVO memberVO) throws Exception;

	boolean duplicateIdCheck(String id) throws Exception;

	MemberVO getMember(MemberVO memberVO) throws Exception;

	int userCheck(MemberVO memberVO) throws Exception;


	
	
	
	



	

}
