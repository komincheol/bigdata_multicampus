package manage.controllers.project;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import basic.controllers.AbstractController;
import basic.controllers.ModelAndView;
import dandb.TeamVO;
import manage.model.ProjectManageDAO;
import manage.model.ProjectManageDAOImpl;

public class ProjectDeleteAction extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
				
		ProjectManageDAO projectManageDAO = ProjectManageDAOImpl.getInstance();
		ModelAndView mav = new ModelAndView("/WEB-INF/views/result.jsp");
		
		try {
			long projectNo = Long.parseLong(request.getParameter("projectNo"));
			
			projectManageDAO.deleteProject(projectNo);
			mav.addObject("msg", "프로젝트 삭제");
			mav.addObject("url", "../admin/project");
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("msg", "프로젝트 삭제 실패");
			mav.addObject("url", "javascript:history.back();");
		}
		
		return mav;
		
		
	}
} //end class