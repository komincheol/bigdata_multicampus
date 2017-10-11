package apply.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import apply.model.ApplyDAO;
import apply.model.ApplyDAOImpl;
import basic.controllers.AbstractController;
import basic.controllers.ModelAndView;
import dandb.GenreVO;
import dandb.TeamVO;
import dandb.UserVO;

public class ApplyInsert extends AbstractController{

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
	    UserVO userVO = null;
        ApplyDAO applyDAO = ApplyDAOImpl.getInstance();
        ModelAndView mav = new ModelAndView();
        String page = "000001";
        try {
            page = request.getParameter("page");
        } catch(Exception e) {
            
        }
        try {
            userVO = applyDAO.getUser();
            List<TeamVO> teamlist = applyDAO.getTeamList();
            List<GenreVO> genrelist = applyDAO.getGenreList();
            
            mav.setViewName("/WEB-INF/apply/insert.jsp");
            mav.addObject("teamlist", teamlist);
            mav.addObject("genrelist", genrelist);
            mav.addObject("page", page);
        } catch (Exception e) {
            e.printStackTrace();
            mav.setViewName("/WEB-INF/views/result.jsp");
            mav.addObject("msg", "리스트못띄운다.");
            mav.addObject("url", "index.jsp");

        }
        HttpSession session = request.getSession();
        session.setAttribute("user", userVO);
	    
		return mav;
	}

}
