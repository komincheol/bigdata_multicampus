package manage.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;

import basic.model.ConnectDAOImpl;
import dandb.GenreVO;
import ibatis.QueryHandler;

public class GenreManageDAOImpl implements GenreManageDAO {

	private static GenreManageDAOImpl genreManageDAO = null;
	
	public static GenreManageDAOImpl getInstance() {
		
		if (genreManageDAO == null) {
			genreManageDAO = new GenreManageDAOImpl();
		}
		
		return genreManageDAO;
	} //end getInstance()

	@Override
	public void insertGenre(GenreVO genreVO) throws Exception {
		
		SqlMapClient sqlMap = QueryHandler.getInstance();
		sqlMap.insert("genre.insertGenre", genreVO);
		
		/*
		StringBuffer sql = new StringBuffer();
		sql.append(" INSERT INTO tb_Genre(genreid, genrename, genreurl)");
		sql.append(" VALUES (?, ?, ?)");
		
		Connection cn = null;
		PreparedStatement ps = null;
		
		try {
			cn = connectDAOImpl.getConnection();
			ps = cn.prepareStatement(sql.toString());

			ps.setString(1, genreVO.getGenreId());
			ps.setString(2, genreVO.getGenreName());
			ps.setString(3, genreVO.getGenreUrl());
			ps.executeUpdate();
		} finally {
			connectDAOImpl.dbClose(ps, cn);
		}
		*/
		
	} //end insertArticle()
	
	@Override
	public void deleteGenre(String genreId) throws Exception {
		
		SqlMapClient sqlMap = QueryHandler.getInstance();
		
		if(sqlMap.update("genre.deleteGenre", genreId) == 0) {
			throw new RuntimeException("장르 id가 틀립니다.");
		}
		
		/*
		StringBuffer sql = new StringBuffer();
		sql.append(" DELETE FROM tb_Genre");
		sql.append(" WHERE  genreid=?");
		
		Connection cn = null;
		PreparedStatement ps = null;
		
		try {
			cn = connectDAOImpl.getConnection();
			ps = cn.prepareStatement(sql.toString());

			ps.setString(1, genreVO.getGenreId());
			if (ps.executeUpdate() == 0){
				throw new RuntimeException("장르 ID 가 틀립니다.");
			}
		} finally {
			connectDAOImpl.dbClose(ps, cn);
		}
		*/
	} //end deleteTeam()
	
	@Override
	public void updateGenre(GenreVO genreVO) throws Exception {
		
		SqlMapClient sqlMap = QueryHandler.getInstance();
		
		if(sqlMap.update("genre.updateGenre", genreVO) == 0) {
			throw new RuntimeException("장르 id가 틀립니다.");
		}
		
		/*
		StringBuffer sql = new StringBuffer();
		
		sql.append(" UPDATE tb_Genre SET");
		sql.append("       	genrename=?");
		sql.append("       	genreurl=?");
		sql.append(" WHERE  genreid=?");
		
		Connection cn = null;
		PreparedStatement ps = null;
		
		try {
			cn = connectDAOImpl.getConnection();
			ps = cn.prepareStatement(sql.toString());

			ps.setString(1, genreVO.getGenreName());
			ps.setString(2, genreVO.getGenreUrl());
			ps.setString(3, genreVO.getGenreId());
			
			if (ps.executeUpdate() == 0){
				throw new RuntimeException("장르 ID가 틀립니다.");
			}
		} finally {
			connectDAOImpl.dbClose(ps, cn);
		}
		*/
	} //end updateTeam()
}
