package member.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import basic.controllers.AbstractController;
import basic.controllers.ModelAndView;
import dandb.MemberVO;
import member.model.MemberDAO;
import member.model.MemberDAOImpl;

public class LoginAction extends AbstractController{
	
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		String memberId= request.getParameter("userId");
		String memberPwd= request.getParameter("userPwd");
		
		MemberVO memberVO= new MemberVO();
		memberVO.setUserId(memberId);
		memberVO.setUserPwd(memberPwd);
		System.out.println(memberVO);
		
		MemberDAO memberDAO = MemberDAOImpl.getInstance();
		ModelAndView mav= new ModelAndView("/WEB-INF/views/result.jsp");
		
		try {
			
			int result= memberDAO.userCheck(memberVO);
			System.out.println(result);
			if(result==1){
				
			memberDAO.getMember(memberVO);
				
				
			mav.addObject("msg","로그인 성공.");
			mav.addObject("url","main");
			
			}else if (result==0){
				mav.addObject("msg","비밀번호가 맞지 않습니다.");
				mav.addObject("url", "javascript:history.back();");
				System.out.println(memberVO);
			}else if(result == -1){
				mav.addObject("msg","존재하지 않는 회원 입니다.");
				mav.addObject("url", "javascript:history.back();");
				System.out.println(memberVO);
			}
		} catch (Exception e) {
			mav.addObject("msg","로그인 실패");
			mav.addObject("url", "javascript:history.back();");
		}
		return mav;
	}

}
