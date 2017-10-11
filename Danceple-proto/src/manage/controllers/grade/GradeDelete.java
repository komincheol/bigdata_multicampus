package manage.controllers.grade;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import basic.controllers.AbstractController;
import basic.controllers.ModelAndView;
import dandb.GradeVO;
import info.model.InfoDAO;
import info.model.InfoDAOImpl;
import manage.controllers.team.TeamUpdate;

public class GradeDelete extends AbstractController{
	
	private static Logger logger = LoggerFactory.getLogger(TeamUpdate.class);
	
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {

		InfoDAO infoDAO = InfoDAOImpl.getInstance();

		try {
			String gradeId = request.getParameter("gradeId");

			GradeVO gradeVO = infoDAO.getGradeDetail(gradeId);
			return new ModelAndView("/WEB-INF/manage/grade/GradeDelete.jsp", "gradeVO", gradeVO);

		} catch (Exception e) {
			logger.info(e.toString());

			ModelAndView mav = new ModelAndView("/WEB-INF/views/result.jsp");

			mav.addObject("msg", e.getMessage());
			mav.addObject("url", "../admin/grade");

			return mav;
		}
	}

}
