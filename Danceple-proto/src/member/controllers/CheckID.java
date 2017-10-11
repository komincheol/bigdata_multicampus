package member.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import basic.controllers.AbstractController;
import basic.controllers.ModelAndView;


public class CheckID extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		String userId = request.getParameter("memberId");
		//DAO
		//select count(*) AS cnt from member
		//where user_id= ?
		
		ModelAndView mav = new ModelAndView("/WEB-INF/views/member/checkID.jsp");
		mav.addObject("memberId", userId);
		//mav.addObject("cnt", cnt);
		//mav.addObject("msg", "aaa는 이미 사용중인 아이디 입니다.");
		return mav;
	}
}
