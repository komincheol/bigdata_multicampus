package info.model;

import java.util.List;

import dandb.ApplyVO;
import dandb.DuescheckVO;
import dandb.GenreVO;
import dandb.GradeVO;
import dandb.ProjectVO;
import dandb.UserVO;
import dandb.SeasonVO;
import dandb.TeacherVO;
import dandb.TeamVO;

public interface InfoDAO {

	List<TeamVO> getTeamList() throws Exception;

	List<GenreVO> getGenreList() throws Exception;

	List<SeasonVO> getSeasonList() throws Exception;
	
	List<ProjectVO> getProjectList() throws Exception;
	
	List<DuescheckVO> getDuesCheckList() throws Exception;

	List<UserVO> getUserList() throws Exception;
	
	List<GradeVO> getGradeList() throws Exception;

	List<ApplyVO> getApplyList() throws Exception;

	TeamVO getTeamDetail(String teamId) throws Exception;

	GenreVO getGenreDetail(String genreId) throws Exception;

	GradeVO getGradeDetail(String gradeId) throws Exception;

	SeasonVO getSeasonDetail(long seasonId) throws Exception;
	
	ProjectVO getProjectDetail(long projectNo) throws Exception;

	

	

}
