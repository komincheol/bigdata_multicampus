package member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import basic.controller.AbstractController;
import basic.controller.ModelAndView;

public class Login extends AbstractController{

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
	
		return new ModelAndView("/WEB-INF/member/login.jsp");
	}

}
