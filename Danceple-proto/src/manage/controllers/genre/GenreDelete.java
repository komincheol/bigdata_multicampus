package manage.controllers.genre;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import basic.controllers.AbstractController;
import basic.controllers.ModelAndView;
import dandb.GenreVO;
import info.model.InfoDAO;
import info.model.InfoDAOImpl;
import manage.controllers.team.TeamUpdate;

public class GenreDelete extends AbstractController{
	
	private static Logger logger = LoggerFactory.getLogger(TeamUpdate.class);

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {

		InfoDAO infoDAO = InfoDAOImpl.getInstance();

		try {
			String genreId = request.getParameter("genreId");

			GenreVO genreVO = infoDAO.getGenreDetail(genreId);

			return new ModelAndView("/WEB-INF/manage/genre/GenreDelete.jsp", "genreVO", genreVO);

		} catch (Exception e) {
			logger.info(e.toString());

			ModelAndView mav = new ModelAndView("/WEB-INF/views/result.jsp");

			mav.addObject("msg", e.getMessage());
			mav.addObject("url", "../admin/genre");

			return mav;
		}
	}

}
