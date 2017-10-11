package member.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import basic.controllers.AbstractController;
import basic.controllers.ModelAndView;
import dandb.UserVO;
import member.model.MemberDAO;
import member.model.MemberDAOImpl;


public class MemberInsertAction extends AbstractController{

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {

		String memberId=request.getParameter("memberId");
		String memberPwd=request.getParameter("memberPwd");
		String memberName=request.getParameter("memberName");
		String phone=request.getParameter("phone");
		String birthday = request.getParameter("birthday");
		String email =request.getParameter("email");
		String gender =request.getParameter("gender");
		String gradeId =request.getParameter("gradeId");
		String imgUrl = request.getParameter("imgUrl");
		
		//이미지 업로드
		
		/*int uploadFileSizeLimit = 50 * 1024 * 1024;// 이미지 사이즈
		String uploadFilePath = "C:/dev/upload";//업로드 
		String encType = "UTF-8";
		String savePath = "upload";
		boolean isImage= false;*/
		
		
		UserVO memberVO= new UserVO();
		memberVO.setUserId(memberId);
		memberVO.setUserPwd(memberPwd);
		memberVO.setUserName(memberName);
		memberVO.setPhone(phone);
		memberVO.setBirthday(birthday);
		memberVO.setEmail(email);
		memberVO.setGender(gender);
		memberVO.setGradeId(gradeId);
		
		memberVO.setImgUrl(imgUrl);
		
		System.out.println(memberVO);
		
		MemberDAO memberDAO = MemberDAOImpl.getInstance();
		
		ModelAndView mav= new ModelAndView("/WEB-INF/views/result.jsp");
		
		try{
			
			memberDAO.uploadImg(memberVO, request);
			memberDAO.insertMember(memberVO);
			
			mav.addObject("msg","회원가입 성공.");
			mav.addObject("url","login");
		}catch(Exception e){
			e.printStackTrace();
			mav.addObject("msg","회원가입 실패");
			mav.addObject("url", "javascript:history.back();");
			}
		return mav;//new ModelAndView("/WEB-INF");
		
	}

}
