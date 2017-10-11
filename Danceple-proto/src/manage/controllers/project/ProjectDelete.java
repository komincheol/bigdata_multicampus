package manage.controllers.project;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import basic.controllers.AbstractController;
import basic.controllers.ModelAndView;
import dandb.ProjectVO;
import info.model.InfoDAO;
import info.model.InfoDAOImpl;

public class ProjectDelete extends AbstractController{

	private static Logger logger = LoggerFactory.getLogger(ProjectDelete.class);
	
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		
		InfoDAO infoDAO = InfoDAOImpl.getInstance();
		
		try {
			long projectNo = Long.parseLong(request.getParameter("projectNo"));

			ProjectVO projectVO = infoDAO.getProjectDetail(projectNo);
			
			return new ModelAndView("/WEB-INF/manage/project/ProjectDelete.jsp", "projectVO", projectVO);
			
		} catch (Exception e) {
			logger.info(e.toString());
			
			ModelAndView mav = new ModelAndView("/WEB-INF/views/result.jsp");
			
			mav.addObject("msg", e.getMessage());
			mav.addObject("url", "../admin/project");
			
			return mav;
		}
	}
} //end class
