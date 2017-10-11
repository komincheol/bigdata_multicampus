package manage.model;

import com.ibatis.sqlmap.client.SqlMapClient;

import basic.model.ConnectDAOImpl;
import dandb.SeasonVO;
import dandb.SeasonVO;
import ibatis.QueryHandler;

public class SeasonManageDAOImpl implements SeasonManageDAO {

	private static SeasonManageDAOImpl seasonManageDAO = null;
	
	public static SeasonManageDAOImpl getInstance() {
		
		if (seasonManageDAO  == null) {
			seasonManageDAO  = new SeasonManageDAOImpl();
		}
		
		return seasonManageDAO ;
	} //end getInstance()
	
	@Override
	public void insertSeason(SeasonVO seasonVO) throws Exception {
		SqlMapClient sqlMap = QueryHandler.getInstance();
		sqlMap.insert("season.insertSeason", seasonVO);
	}
	
	@Override
	public void updateSeason(SeasonVO seasonVO) throws Exception {
		SqlMapClient sqlMap = QueryHandler.getInstance();
		
		if(sqlMap.update("season.updateSeason", seasonVO) == 0) {
			throw new RuntimeException("시즌 ID가 틀립니다.");
		}
	}
	
	@Override
	public void deleteSeason(long seasonNo) throws Exception {
		SqlMapClient sqlMap = QueryHandler.getInstance();
		
		if(sqlMap.update("season.deleteSeason", seasonNo) == 0) {
			throw new RuntimeException("시즌 ID가 틀립니다.");
		}
	}
	
} //end class
