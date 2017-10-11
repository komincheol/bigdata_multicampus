package manage.controllers.season;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import basic.controllers.AbstractController;
import basic.controllers.ModelAndView;
import dandb.SeasonVO;
import dandb.TeamVO;
import manage.model.SeasonManageDAO;
import manage.model.SeasonManageDAOImpl;
import manage.model.TeamManageDAO;
import manage.model.TeamManageDAOImpl;

public class SeasonDeleteAction extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {

		long seasonId = Long.parseLong(request.getParameter("seasonId"));
		

		SeasonManageDAO seasonManageDAO = SeasonManageDAOImpl.getInstance();
		ModelAndView mav = new ModelAndView("/WEB-INF/views/result.jsp");
		
		try {
			seasonManageDAO.deleteSeason(seasonId);
			mav.addObject("msg", "시즌 삭제");
			mav.addObject("url", "../admin/season");
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("msg", "시즌 삭제 실패");
			mav.addObject("url", "javascript:history.back();");
		}
		
		return mav;
		
		
	}
} //end class