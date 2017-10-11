package manage.controllers.season;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import basic.controllers.AbstractController;
import basic.controllers.ModelAndView;
import dandb.ProjectVO;
import dandb.SeasonVO;
import info.model.InfoDAO;
import info.model.InfoDAOImpl;


public class SeasonUpdate extends AbstractController{

	private static Logger logger = LoggerFactory.getLogger(SeasonUpdate.class);
	
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {

		InfoDAO infoDAO = InfoDAOImpl.getInstance();
		ModelAndView mav = new ModelAndView("/WEB-INF/manage/season/SeasonUpdate.jsp");

		try {
			long seasonId = Long.parseLong(request.getParameter("seasonId"));

			SeasonVO seasonVO = infoDAO.getSeasonDetail(seasonId);
			List<ProjectVO> projectList = infoDAO.getProjectList();
			mav.addObject("seasonVO", seasonVO);
			mav.addObject("projectList", projectList);

			return mav;

		} catch (Exception e) {
			logger.info(e.toString());
			mav = new ModelAndView("/WEB-INF/views/result.jsp");

			mav.addObject("msg", e.getMessage());
			mav.addObject("url", "../admin/season");
			
			return mav;
		}

	}

}
