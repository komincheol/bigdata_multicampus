package manage.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.ibatis.sqlmap.client.SqlMapClient;

import basic.model.ConnectDAOImpl;
import dandb.GradeVO;
import dandb.TeacherVO;
import ibatis.QueryHandler;

public class TeacherManageDAOImpl implements TeacherManageDAO {

	private static TeacherManageDAOImpl teacherManageDAO = null;
	
	public static TeacherManageDAOImpl getInstance() {

		if (teacherManageDAO == null) {
			teacherManageDAO = new TeacherManageDAOImpl();
		}

		return teacherManageDAO;
	} //end getInstance()

	@Override
	public void insertTeacher(TeacherVO teacherVO) throws Exception {

		SqlMapClient sqlMap = QueryHandler.getInstance();
		sqlMap.insert("teacher.insertTeacher", teacherVO);
		
		/*
		StringBuffer sql = new StringBuffer();
		sql.append(" INSERT INTO tb_Teacher (teacherid, teachername, genreid, teamid, seasonid)");
		sql.append(" VALUES (seq_teacher.nextval ,?, ?, ?, ?)");

		Connection cn = null;
		PreparedStatement ps = null;

		try {
			cn = connectDAOImpl.getConnection();
			ps = cn.prepareStatement(sql.toString());

			ps.setString(1, teacherVO.getTeacherName());
			ps.setString(2, teacherVO.getGenreId());
			ps.setString(3, teacherVO.getTeamId());
			ps.setString(4, teacherVO.getSeasonId());
			ps.executeUpdate();
		} finally {
			connectDAOImpl.dbClose(ps, cn);
		}
		*/
	} //end insertArticle()

	@Override
	public void updateTeacher(TeacherVO teacherVO) throws Exception {
		
		SqlMapClient sqlMap = QueryHandler.getInstance();
		
		if(sqlMap.update("teacher.updateTeacher", teacherVO) == 0) {
			throw new RuntimeException("강사 ID가 틀립니다.");
		}
		
		
		/*
		StringBuffer sql = new StringBuffer();
		sql.append(" UPDATE tb_Teacher SET");
		sql.append(" 		teachername=?,");
		sql.append(" 		genreid=?,");
		sql.append(" 		teamid=?,");
		sql.append("		seasonid=?");
		sql.append(" WHERE 	teacherid=?");
		Connection cn = null;
		PreparedStatement ps = null;

		try {
			cn = connectDAOImpl.getConnection();
			ps = cn.prepareStatement(sql.toString());

			ps.setString(1, teacherVO.getTeacherName());
			ps.setString(2, teacherVO.getGenreId());
			ps.setString(3, teacherVO.getTeamId());
			ps.setString(4, teacherVO.getSeasonId());
			ps.setLong(5, teacherVO.getTeacherId());
			ps.executeUpdate();
		} finally {
			connectDAOImpl.dbClose(ps, cn);
		}
		*/
	} //end updateTeacher()


} //end class
