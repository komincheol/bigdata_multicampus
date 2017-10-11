package member.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import basic.controllers.AbstractController;
import basic.controllers.ModelAndView;
import dandb.UserVO;
import member.model.MemberDAO;
import member.model.MemberDAOImpl;

public class LoginAction extends AbstractController{
	
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		String memberId= request.getParameter("userId");
		String memberPwd= request.getParameter("userPwd");
		String gradeId= request.getParameter("gradeId");
		
		UserVO userVO= new UserVO();
		userVO.setUserId(memberId);
		userVO.setUserPwd(memberPwd);
		userVO.setGradeId(gradeId);
		
		System.out.println(userVO);
		
		MemberDAO memberDAO = MemberDAOImpl.getInstance();
		ModelAndView mav= new ModelAndView("/WEB-INF/views/result.jsp");
		
		try {
			
			int result= memberDAO.userCheck(userVO);
			System.out.println(result);
			
			if(result==1){
				
				UserVO mVO = memberDAO.getUser(userVO);
				HttpSession session=request.getSession();
				session.setAttribute("loginUser",mVO);
				
				if(mVO.getGradeId().equals("0")) { //admin
					mav.addObject("msg","로그인 성공.");
					mav.addObject("url","../admin/menu");
				} else { //일반 회원
					mav.addObject("msg","로그인 성공.");
					mav.addObject("url","../user/menu");
				}				
				
			}else {
				mav.addObject("msg","아이디 혹은 비밀번호가 맞지 않습니다.");
				mav.addObject("url", "login");
				System.out.println(userVO);
			}
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("msg","로그인 실패");
			mav.addObject("url", "javascript:history.back();");
		}
		return mav;
	}

}
