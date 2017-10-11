package member.model;

import javax.servlet.http.HttpServletRequest;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import dandb.UserVO;
import ibatis.QueryHandler;

public class MemberDAOImpl implements MemberDAO {

	private static MemberDAOImpl memberDAO = null;
	
	public static MemberDAOImpl getInstance() {
		if (memberDAO == null) {
			memberDAO = new MemberDAOImpl();
		}
		return memberDAO;
	}

	@Override
	public void insertMember(UserVO userVO) throws Exception {
		SqlMapClient sqlMap = QueryHandler.getInstance();
		sqlMap.insert("user.insertUser",userVO);

	}

	@Override // 유저사용자인증확인
	public int userCheck(UserVO userVO) throws Exception {
		int result = -1;
		String pwd = null;
		
		SqlMapClient sqlMap = QueryHandler.getInstance();
		pwd = (String) sqlMap.queryForObject("user.userCheck", userVO.getUserId());
		
			if (pwd != null) {
				if (pwd.equals(userVO.getUserPwd())) {
					result = 1;

				} else {
					result = 0;
				}
			} else {
				result = -1;
			}
			
		return result;
	}

	@Override
	public UserVO getUser(UserVO userVO) throws Exception {

		SqlMapClient sqlMap = QueryHandler.getInstance();
		return (UserVO) sqlMap.queryForObject("user.getUser", userVO.getUserId());
	}
@Override
public void uploadImg(UserVO memberVO, HttpServletRequest request) throws Exception {
	

	int uploadFileSizeLimit = 50 * 1024 * 1024;// 이미지 사이즈
	String uploadFilePath = "C:/dev/upload";//서버 업로드 
	String encType = "UTF-8";
	String savePath = "upload";
	boolean isImage= false;
	
	
	try {
		MultipartRequest multi = new MultipartRequest(request, uploadFilePath, uploadFileSizeLimit, encType, new DefaultFileRenamePolicy());
		
		String fileName= multi.getFilesystemName("uploadimgUrl");
		
	/*	isImage = multi.getContentType("uploaimgUrl")
				.substring(0, 6)
				.toLowerCase()
				.equals("image/");
	*/	
		//확인
		
		if (fileName == null) {
			System.out.println("파일 업로드 되지않음");
		} else {
			System.out.println("<br> 글쓴이: " + multi.getParameter("name"));
			System.out.println("<br> 제 &nbsp; 목: " + multi.getParameter("title"));
			System.out.println("<br> 파일명: " + fileName);
		}
	} catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}
	return ;
}

}
