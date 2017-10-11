package manage.controllers.project;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import basic.controllers.AbstractController;
import basic.controllers.ModelAndView;
import dandb.ProjectVO;
import manage.model.ProjectManageDAO;
import manage.model.ProjectManageDAOImpl;

public class ProjectUpdateAction extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {

		long projectNo = Long.parseLong(request.getParameter("projectNo"));
		String projectTitle = request.getParameter("projectTitle");
		String projectDate	= request.getParameter("projectDate");
		String projectDesc	= request.getParameter("ptojectDesc");
		
		ProjectVO projectVO = new ProjectVO();
		projectVO.setProjectNo(projectNo);
		projectVO.setProjectTitle(projectTitle);
		projectVO.setProjectDate(projectDate);
		projectVO.setProjectDesc(projectDesc);
		
		ProjectManageDAO projectManageDAO = ProjectManageDAOImpl.getInstance();
		ModelAndView mav = new ModelAndView("/WEB-INF/views/result.jsp");
		
		try {
			projectManageDAO.updateProject(projectVO);
			mav.addObject("msg", "프로젝트 수정 성공");
			mav.addObject("url", "../admin/project");
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("msg", "프로젝트 수정 실패");
			mav.addObject("url", "javascript:history.back();");
		}
		
		return mav;
		
		
	}
} //end class