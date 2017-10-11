package member.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import basic.controller.AbstractController;
import basic.controller.ModelAndView;
import member.model.MemberDAO;
import member.model.MemberDAOImpl;

public class MemberIdCheckAction extends AbstractController  {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception{
		String id = request.getParameter("tb_memberId");
        MemberDAO dao = MemberDAOImpl.getInstance();
        
        boolean result=false;
		try {
			result = dao.duplicateIdCheck(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
        if(result)    out.println("0"); // 아이디 중복
        else        out.println("1");
        
        out.close();
       
		return null;
	}

}
