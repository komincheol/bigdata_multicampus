package member.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import dandb.MemberVO;

public class MemberDAOImpl implements MemberDAO {

	private static MemberDAOImpl memberDAO = null;

	private String driver = null;
	private String url = null;
	private String username = null;
	private String password = null;

	private DataSource ds = null;

	private MemberDAOImpl() {

		try {
			Context context = new InitialContext();
			ds = (DataSource) context.lookup("java:/comp/env/jdbc/mydbcp");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private Connection getConnection() throws SQLException {
		return ds.getConnection();

	}

	public static MemberDAOImpl getInstance() {
		if (memberDAO == null) {
			memberDAO = new MemberDAOImpl();
		}
		return memberDAO;
	}

	private void dbClose(PreparedStatement ps, Connection cn) {
		if (ps != null)
			try {
				ps.close();
			} catch (Exception e) {
			}
		if (cn != null)
			try {
				cn.close();
			} catch (Exception e) {
			}
	}

	private void dbClose(ResultSet rs, PreparedStatement ps, Connection cn) {
		if (rs != null)
			try {
				rs.close();
			} catch (Exception e) {
			}
		if (ps != null)
			try {
				ps.close();
			} catch (Exception e) {
			}
		if (cn != null)
			try {
				cn.close();
			} catch (Exception e) {
			}
	}

	@Override
	public void insertMember(MemberVO memberVO) throws Exception {
		Connection cn = null;
		PreparedStatement ps = null;

		StringBuffer sql = new StringBuffer();
		sql.append(
				" INSERT INTO tb_user(userid, userpwd, name, birthday, gender, email, phone, gradeid,teamid,penalty,pictureurl)");
		sql.append(" VALUES(? , ? , ? , ? , ? , ? , ?, '1','000001','1','?')");

		/*
		 * sql.
		 * append(" INSERT INTO tb_user(userid, userpwd, name, birthday, gender, email, phone, gradeid,teamid,penalty)"
		 * ); sql.
		 * append(" VALUES('l357lh1' ,'1111','jkojkljj','19920511','man','jckmm@daum.net','01032793050','1','000001','1')"
		 * );
		 */
		try {
			cn = getConnection();
			ps = cn.prepareStatement(sql.toString());

			ps.setString(1, memberVO.getUserId());
			ps.setString(2, memberVO.getUserPwd());
			ps.setString(3, memberVO.getUserName());
			ps.setString(4, memberVO.getBirthday());
			ps.setString(5, memberVO.getGender());
			ps.setString(6, memberVO.getEmail());
			ps.setString(7, memberVO.getPhone());
			ps.setString(8, memberVO.getPictureUrl());
			
			ps.executeUpdate();
		} finally {
			dbClose(ps, cn);
		}

	}

	@Override
	public boolean duplicateIdCheck(String id) throws Exception {
		Connection cn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean x = false;

		try {
			// 쿼리
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT ID FROM JSP_MEMBER WHERE ID=?");

			cn = getConnection();
			ps = cn.prepareStatement(sql.toString());
			ps.setString(1, id);
			rs = ps.executeQuery();

			if (rs.next())
				x = true; // 해당 아이디 존재

			return x;

		} catch (Exception sqle) {
			throw new RuntimeException(sqle.getMessage());
		} finally {
			try {
				if (ps != null) {
					ps.close();
					ps = null;
				}
				if (cn != null) {
					cn.close();
					cn = null;
				}
			} catch (Exception e) {
				throw new RuntimeException(e.getMessage());
			}
		}
	}

	@Override // 유저사용자인증확인
	public int userCheck(MemberVO memberVO) throws Exception {
		int result = -1;
		
		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT userpwd FROM tb_user where userid= ?");

		Connection cn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;		
		try {
			cn = getConnection();
			ps = cn.prepareStatement(sql.toString());
			ps.setString(1, memberVO.getUserId());
			rs = ps.executeQuery();

			if (rs.next()) {
				if (rs.getString("userPwd") != null && rs.getString("userPwd").equals(memberVO.getUserPwd())) {
					result = 1;

				} else {
					result = 0;
				}
			} else {
				result = -1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (cn != null) {
					cn.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	@Override
	public MemberVO getMember(MemberVO memberVO) throws Exception {

		StringBuffer sql = new StringBuffer();
		sql.append(" select * from tb_user where userid= ? ");

		Connection cn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			cn = getConnection();
			ps = cn.prepareStatement(sql.toString());
			ps.setString(1, memberVO.getUserId());
			rs = ps.executeQuery();
			if (rs.next()) {
				memberVO = new MemberVO();
				memberVO.setUserName(rs.getString("name"));
				memberVO.setUserId(rs.getString("userId"));
				memberVO.setUserPwd(rs.getString("userPwd"));
				memberVO.setEmail(rs.getString("email"));
				memberVO.setPhone(rs.getString("phone"));
				memberVO.setBirthday(rs.getString("birthday"));
			}
		} catch (Exception e) {
			e.printStackTrace();

		} finally {

			try {
				if (rs != null)
					rs.close();
				if (ps != null)
					ps.close();
				if (cn != null)
					cn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return memberVO;
	}

		
}

