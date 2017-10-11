package member.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import basic.controllers.AbstractController;
import basic.controllers.ModelAndView;

public class Login extends AbstractController{

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession session=request.getSession();
		
		if(session.getAttribute("userVO") == null) {
			return new ModelAndView("/WEB-INF/member/login.jsp");
		} else {
			ModelAndView mav = new ModelAndView("/WEB-INF/views/result.jsp");
			
			mav.addObject("msg", "로그아웃을 해주세요.");
			mav.addObject("url", "/WEB-INF/member/result.jsp");
			
			return mav;
		}
		
	}

}
