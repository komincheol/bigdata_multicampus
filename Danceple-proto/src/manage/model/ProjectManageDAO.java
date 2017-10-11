package manage.model;

import dandb.ProjectVO;

public interface ProjectManageDAO {

	void insertProject(ProjectVO projectVO) throws Exception;

	void updateProject(ProjectVO projectVO) throws Exception;
	
	void deleteProject(long projectNo) throws Exception;

}
