package admin.menu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import basic.controllers.AbstractController;
import basic.controllers.ModelAndView;
import dandb.GenreVO;
import dandb.GradeVO;
import dandb.TeacherVO;
import dandb.TeamVO;
import info.model.InfoDAO;
import info.model.InfoDAOImpl;

public class AdminHome extends AbstractController{
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		
		TeamVO teamVO = new TeamVO();
		GenreVO genreVO = new GenreVO();
		TeacherVO teacherVO = new TeacherVO();
		GradeVO gradeVO = new GradeVO();
		
		InfoDAO infoDAO = InfoDAOImpl.getInstance();
		
		ModelAndView mav = new ModelAndView();
		
		try {
			List<TeamVO> teamList = infoDAO.getTeamList(); 
			List<GenreVO> genreList = infoDAO.getGenreList();
			List<GradeVO> gradeList = infoDAO.getGradeList();
			
			mav.setViewName("/WEB-INF/admin/adminHome.jsp");
			mav.addObject("teamList", teamList);
			mav.addObject("genreList", genreList);
			mav.addObject("gradeList", gradeList);
		} catch (Exception e) {
			e.printStackTrace();
			mav.setViewName("/WEB-INF/views/result.jsp");
			mav.addObject("msg", "리스트 출력에러\n관리자에게 문의하세요");
			mav.addObject("url", "test");
		}
		
		return mav;
	}
} //end class
