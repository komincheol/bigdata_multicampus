package manage.controllers.season;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import basic.controllers.AbstractController;
import basic.controllers.ModelAndView;
import dandb.SeasonVO;
import manage.model.SeasonManageDAO;
import manage.model.SeasonManageDAOImpl;
import manage.model.TeamManageDAO;
import manage.model.TeamManageDAOImpl;

public class SeasonUpdateAction extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {

		long seasonId = Long.parseLong(request.getParameter("seasonId"));
		String snMonth = request.getParameter("snMonth");
		String startDate	= request.getParameter("startDate");
		String endDate	= request.getParameter("endDate");
		long projectNo	= Long.parseLong(request.getParameter("projectNo"));
		
		SeasonVO seasonVO = new SeasonVO();
		seasonVO.setSeasonId(seasonId);
		seasonVO.setSnMonth(snMonth);
		seasonVO.setStartDate(startDate);
		seasonVO.setEndDate(endDate);
		seasonVO.setProjectNo(projectNo);
		
		SeasonManageDAO seasonManageDAO = SeasonManageDAOImpl.getInstance();
		ModelAndView mav = new ModelAndView("/WEB-INF/views/result.jsp");
		
		try {
			seasonManageDAO .updateSeason(seasonVO);
			mav.addObject("msg", "시즌 수정 성공");
			mav.addObject("url", "../admin/season");
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("msg", "시즌 수정 실패");
			mav.addObject("url", "javascript:history.back();");
		}
		
		return mav;
		
		
	}
} //end class