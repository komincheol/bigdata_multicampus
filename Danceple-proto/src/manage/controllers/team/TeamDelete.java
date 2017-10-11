package manage.controllers.team;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import basic.controllers.AbstractController;
import basic.controllers.ModelAndView;
import dandb.TeamVO;
import info.model.InfoDAO;
import info.model.InfoDAOImpl;

public class TeamDelete extends AbstractController{

	private static Logger logger = LoggerFactory.getLogger(TeamUpdate.class);
	
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		
		InfoDAO infoDAO = InfoDAOImpl.getInstance();
		
		try {
			String teamId = request.getParameter("teamId");

			TeamVO teamVO = infoDAO.getTeamDetail(teamId);
			
			return new ModelAndView("/WEB-INF/manage/team/TeamDelete.jsp", "teamVO", teamVO);
			
		} catch (Exception e) {
			logger.info(e.toString());
			
			ModelAndView mav = new ModelAndView("/WEB-INF/views/result.jsp");
			
			mav.addObject("msg", e.getMessage());
			mav.addObject("url", "../admin/team");
			
			return mav;
		}
	}
} //end class
