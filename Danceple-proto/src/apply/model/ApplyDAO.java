package apply.model;

import java.util.List;

import dandb.ApplyVO;
import dandb.GenreVO;
import dandb.TeamVO;
import dandb.UserVO;

public interface ApplyDAO {
    UserVO getUser() throws Exception;
//	void insertApply(ApplyVO applyVO) throws Exception;
	
	List<TeamVO> getTeamList() throws Exception;
	List<GenreVO> getGenreList() throws Exception;
//	List<SeasonVO> getSeasonList() throws Exception;
	
}
