package list.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import basic.controllers.AbstractController;
import basic.controllers.ModelAndView;
import dandb.TeamVO;
import info.model.InfoDAO;
import info.model.InfoDAOImpl;

public class TeamList extends AbstractController {
	
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		
		InfoDAO infoDAO = InfoDAOImpl.getInstance();
		
		ModelAndView mav = new ModelAndView();
		
		try {
			List<TeamVO> teamList = infoDAO.getTeamList(); 
			
			mav.setViewName("/WEB-INF/manage/list/TeamList.jsp");
			mav.addObject("teamList", teamList);
		} catch (Exception e) {
			e.printStackTrace();
			mav.setViewName("/WEB-INF/views/result.jsp");
			mav.addObject("msg", "리스트 출력에러\n관리자에게 문의하세요");
			mav.addObject("url", "test");
		}
		
		return mav;
	}

} //end class
