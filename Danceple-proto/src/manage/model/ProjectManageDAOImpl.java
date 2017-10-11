package manage.model;

import com.ibatis.sqlmap.client.SqlMapClient;

import basic.model.ConnectDAOImpl;
import dandb.ProjectVO;
import ibatis.QueryHandler;

public class ProjectManageDAOImpl implements ProjectManageDAO {

	private static ProjectManageDAOImpl projectManageDAO = null;
	
	public static ProjectManageDAOImpl getInstance() {
		
		if (projectManageDAO  == null) {
			projectManageDAO = new ProjectManageDAOImpl();
		}
		
		return projectManageDAO;
	} //end getInstance()
	
	@Override
	public void insertProject(ProjectVO projectVO) throws Exception {
		SqlMapClient sqlMap = QueryHandler.getInstance();
		sqlMap.insert("project.insertProject", projectVO);
	}
	
	@Override
	public void updateProject(ProjectVO projectVO) throws Exception {
		SqlMapClient sqlMap = QueryHandler.getInstance();
		
		if(sqlMap.update("project.updateProject", projectVO) == 0) {
			throw new RuntimeException("프로젝트 ID가 틀립니다.");
		}
	}
	
	@Override
	public void deleteProject(long projectNo) throws Exception {
		SqlMapClient sqlMap = QueryHandler.getInstance();
		
		if(sqlMap.update("project.deleteProject", projectNo) == 0) {
			throw new RuntimeException("프로젝트 ID가 틀립니다.");
		}
	}
	
} //end class
