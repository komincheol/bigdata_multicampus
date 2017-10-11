package manage.controllers.team;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import basic.controllers.AbstractController;
import basic.controllers.ModelAndView;
import dandb.TeamVO;
import manage.model.TeamManageDAO;
import manage.model.TeamManageDAOImpl;

public class TeamDeleteAction extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {

		String teamId = request.getParameter("teamId");
				
		TeamManageDAO teamManageDAO = TeamManageDAOImpl.getInstance();
		ModelAndView mav = new ModelAndView("/WEB-INF/views/result.jsp");
		
		try {
			teamManageDAO .deleteTeam(teamId);
			mav.addObject("msg", "팀 삭제");
			mav.addObject("url", "../admin/team");
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("msg", "팀 삭제 실패");
			mav.addObject("url", "javascript:history.back();");
		}
		
		return mav;
		
		
	}
} //end class