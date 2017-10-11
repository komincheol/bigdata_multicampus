package member.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import basic.controllers.AbstractController;
import basic.controllers.ModelAndView;
import member.model.MemberDAO;
import member.model.MemberDAOImpl;

public class Logout extends AbstractController{

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession session = request.getSession();
		session.invalidate();
		
		MemberDAO memberDAO = MemberDAOImpl.getInstance();
		ModelAndView mav= new ModelAndView("/WEB-INF/views/result.jsp");		
		try {			
			mav.addObject("msg","로그아웃.");
			mav.addObject("url","login");
		} catch (Exception e) {
			mav.addObject("msg","로그아웃 실패");
			mav.addObject("url", "javascript:history.back();");
		}
		return mav;
	}

	
}
