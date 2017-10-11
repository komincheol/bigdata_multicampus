package article.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import article.models.ArticleDAO;
import article.models.ArticleDAOImpl;
import article.models.ArticleVO;

public class deleteAction extends AbstractController {

	private static Logger logger = Logger.getLogger(ArticleUpdate.class);

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		long no = Long.parseLong(request.getParameter("no"));
		String pwd = request.getParameter("pwd");


		ArticleVO articleVO = new ArticleVO();
		articleVO.setNo(no);
		articleVO.setPwd(pwd);
		
		ArticleDAO articleDAO = ArticleDAOImpl.getInstance();
		ModelAndView mav= new ModelAndView("/WEB-INF/views/result.jsp");
		
		try{
			articleDAO.deleteArticle(articleVO);
			mav.addObject("msg","글 삭제 성공.");
			mav.addObject("url","list");
		}catch(Exception e){
			logger.info(e.getMessage());
			e.printStackTrace();
			mav.addObject("msg", "글 삭제 실패");
			mav.addObject("url", "javascript:history.back();");
			}
	
		return mav;

	}
}
