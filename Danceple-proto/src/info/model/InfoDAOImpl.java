package info.model;

import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;
import ibatis.QueryHandler;

import dandb.ApplyVO;
import dandb.DuescheckVO;
import dandb.GenreVO;
import dandb.GradeVO;
import dandb.ProjectVO;
import dandb.UserVO;
import dandb.SeasonVO;
import dandb.TeamVO;

public class InfoDAOImpl implements InfoDAO{

	private static InfoDAOImpl infoDAO = null;
	
	public static InfoDAOImpl getInstance() {
		
		if (infoDAO == null) {
			infoDAO = new InfoDAOImpl();
		}
		
		return infoDAO;
	} //end getInstance()
	
	
	@Override
	public List<TeamVO> getTeamList() throws Exception {
		SqlMapClient sqlMap = QueryHandler.getInstance();
		return sqlMap.queryForList("info.getTeamList");
	} //end getTeamList
	
	@Override
	public TeamVO getTeamDetail(String teamId) throws Exception {
		SqlMapClient sqlMap = QueryHandler.getInstance();
		return (TeamVO) sqlMap.queryForObject("info.getTeamDetail", teamId);
	}
	
	@Override
	public List<GenreVO> getGenreList() throws Exception {
		SqlMapClient sqlMap = QueryHandler.getInstance();
		return sqlMap.queryForList("info.getGenreList");
	} //end getGenreList
	
	@Override
	public GenreVO getGenreDetail(String genreId) throws Exception {
		SqlMapClient sqlMap = QueryHandler.getInstance();
		return (GenreVO) sqlMap.queryForObject("info.getGenreDetail", genreId);
	}
	
	@Override
	public List<SeasonVO> getSeasonList() throws Exception {
		SqlMapClient sqlMap = QueryHandler.getInstance();
		return sqlMap.queryForList("info.getSeasonList");
	}
	
	@Override
	public SeasonVO getSeasonDetail(long seasonId) throws Exception {
		SqlMapClient sqlMap = QueryHandler.getInstance();
		return (SeasonVO) sqlMap.queryForObject("info.getSeasonDetail", seasonId);
	}
	
	@Override
	public List<ProjectVO> getProjectList() throws Exception {
		SqlMapClient sqlMap = QueryHandler.getInstance();
		return sqlMap.queryForList("info.getProjectList");
	}
	
	@Override
	public ProjectVO getProjectDetail(long projectNo) throws Exception {
		SqlMapClient sqlMap = QueryHandler.getInstance();
		return (ProjectVO) sqlMap.queryForObject("info.getProjectDetail", projectNo);
	}
	
	@Override
	public List<DuescheckVO> getDuesCheckList() throws Exception {
		SqlMapClient sqlMap = QueryHandler.getInstance();
		return sqlMap.queryForList("info.getDuesCheckList");
	}
	
	
	@Override
	public List<ApplyVO> getApplyList() throws Exception {
		SqlMapClient sqlMap = QueryHandler.getInstance();
		return sqlMap.queryForList("info.getApplyList");
	}
	@Override
	public List<UserVO> getUserList() throws Exception {
		SqlMapClient sqlMap = QueryHandler.getInstance();
		return sqlMap.queryForList("info.getUserList");
	}
	
	@Override
	public List<GradeVO> getGradeList() throws Exception {
		SqlMapClient sqlMap = QueryHandler.getInstance();
		return sqlMap.queryForList("info.getGradeList");
	}
	
	@Override
	public GradeVO getGradeDetail(String gradeId) throws Exception {
		SqlMapClient sqlMap = QueryHandler.getInstance();
		return (GradeVO) sqlMap.queryForObject("info.getGradeDetail", gradeId);
	}	
} //end class
