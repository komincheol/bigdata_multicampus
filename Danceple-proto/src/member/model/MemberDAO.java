package member.model;


import javax.servlet.http.HttpServletRequest;

import dandb.UserVO;

public interface MemberDAO {
	
	void insertMember(UserVO userVO) throws Exception;

	int userCheck(UserVO userVO) throws Exception;

	UserVO getUser(UserVO userVO) throws Exception;


	void uploadImg(UserVO memberVO, HttpServletRequest request) throws Exception;


}
