package manage.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;

import basic.model.ConnectDAOImpl;
import dandb.GradeVO;
import ibatis.QueryHandler;

public class GradeManageDAOImpl implements GradeManageDAO {

	private static GradeManageDAOImpl gradeManageDAO = null;
	
	public static GradeManageDAOImpl getInstance() {
		
		if (gradeManageDAO == null) {
			gradeManageDAO = new GradeManageDAOImpl();
		}
		
		return gradeManageDAO;
	} //end getInstance()

	@Override
	public void insertGrade(GradeVO gradeVO) throws Exception {
		
		SqlMapClient sqlMap = QueryHandler.getInstance();
		sqlMap.insert("grade.insertGrade", gradeVO);
		
		/*
		StringBuffer sql = new StringBuffer();
		sql.append(" INSERT INTO tb_Grade");
		sql.append(" VALUES (?, ?)");
		
		Connection cn = null;
		PreparedStatement ps = null;
		
		try {
			cn = connectDAOImpl.getConnection();
			ps = cn.prepareStatement(sql.toString());

			ps.setString(1, gradeVO.getGradeId());
			ps.setString(2, gradeVO.getGradeName());
			ps.executeUpdate();
		} finally {
			connectDAOImpl.dbClose(ps, cn);
		}
		*/
		
	} //end insertArticle()
	
	@Override
	public void deleteGrade(String gradeId) throws Exception {
		
		SqlMapClient sqlMap = QueryHandler.getInstance();
		
		if(sqlMap.delete("grade.deleteGrade", gradeId) == 0) {
			throw new RuntimeException("등급 id가 틀립니다.");
		}
		
		/*
		StringBuffer sql = new StringBuffer();
		sql.append(" DELETE FROM tb_Grade");
		sql.append(" WHERE  gradeid=?");
		
		Connection cn = null;
		PreparedStatement ps = null;
		
		try {
			cn = connectDAOImpl.getConnection();
			ps = cn.prepareStatement(sql.toString());

			ps.setString(1, gradeVO.getGradeId());
			if (ps.executeUpdate() == 0){
				throw new RuntimeException("등급 ID 가 틀립니다.");
			}
		} finally {
			connectDAOImpl.dbClose(ps, cn);
		}
		*/
		
	} //end deleteTeam()
	
	@Override
	public void updateGrade(GradeVO gradeVO) throws Exception {
		
		SqlMapClient sqlMap = QueryHandler.getInstance();
		
		if(sqlMap.delete("grade.updateGrade", gradeVO) == 0) {
			throw new RuntimeException("등급 id가 틀립니다.");
		}
		
		/*
		StringBuffer sql = new StringBuffer();
		
		sql.append(" UPDATE tb_Grade SET");
		sql.append("       	gardename=?");
		sql.append(" WHERE  gradeid=?");
		
		Connection cn = null;
		PreparedStatement ps = null;
		
		try {
			cn = connectDAOImpl.getConnection();
			ps = cn.prepareStatement(sql.toString());

			ps.setString(1, gradeVO.getGradeName());
			ps.setString(2, gradeVO.getGradeId());
			
			if (ps.executeUpdate() == 0){
				throw new RuntimeException("등급 ID가 틀립니다.");
			}
		} finally {
			connectDAOImpl.dbClose(ps, cn);
		}
		*/
	} //end updateTeam()
}
