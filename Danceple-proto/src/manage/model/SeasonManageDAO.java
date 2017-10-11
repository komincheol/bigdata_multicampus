package manage.model;

import dandb.SeasonVO;

public interface SeasonManageDAO {

	void insertSeason(SeasonVO seasonVO) throws Exception;
	
	void updateSeason(SeasonVO seasonVO) throws Exception;
	
	void deleteSeason(long seasonNo) throws Exception;

}
