package list.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import basic.controllers.AbstractController;
import basic.controllers.ModelAndView;
import dandb.DuescheckVO;
import info.model.InfoDAO;
import info.model.InfoDAOImpl;

public class DueschekList extends AbstractController {
	
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		
		InfoDAO infoDAO = InfoDAOImpl.getInstance();
		
		ModelAndView mav = new ModelAndView();
		
		try {
			List<DuescheckVO> duescheckList = infoDAO.getDuesCheckList(); 
			
			mav.setViewName("/WEB-INF/manage/list/DuescheckList.jsp");
			mav.addObject("duescheckList", duescheckList);
		} catch (Exception e) {
			e.printStackTrace();
			mav.setViewName("/WEB-INF/views/result.jsp");
			mav.addObject("msg", "리스트 출력에러\n관리자에게 문의하세요");
			mav.addObject("url", "test");
		}
		
		return mav;
	}
	
	

} //end class
