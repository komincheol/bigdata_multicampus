package manage.controllers.season;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import basic.controllers.AbstractController;
import basic.controllers.ModelAndView;
import dandb.SeasonVO;
import info.model.InfoDAO;
import info.model.InfoDAOImpl;

public class SeasonDelete extends AbstractController{

	private static Logger logger = LoggerFactory.getLogger(SeasonDelete.class);
	
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		
		InfoDAO infoDAO = InfoDAOImpl.getInstance();
		
		try {
			long seasonId = Long.parseLong(request.getParameter("seasonId"));

			SeasonVO seasonVO = infoDAO.getSeasonDetail(seasonId);
			
			return new ModelAndView("/WEB-INF/manage/season/SeasonDelete.jsp", "seasonVO", seasonVO);
			
		} catch (Exception e) {
			logger.info(e.toString());
			
			ModelAndView mav = new ModelAndView("/WEB-INF/views/result.jsp");
			
			mav.addObject("msg", e.getMessage());
			mav.addObject("url", "../admin/season");
			
			return mav;
		}
	}
} //end class
