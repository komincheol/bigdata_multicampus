package basic.exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ExceptionTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// String pw= "12345678";
		// System.out.println(DigestUtils.sha512Hex(pw));
		
		System.out.println("ID: ");String user_id = sc.nextLine();
		System.out.println("PW: ");String user_pw = sc.nextLine();
		MemberVO userInfo = new MemberVO();
		userInfo.setUser_id(user_id);
		userInfo.setUser_pw(user_pw);
		try {
			userInfo = login(userInfo);
			System.out.println(userInfo.getUser_name()+"님이 로그인하셨습니다.");
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}


private static MemberVO login(MemberVO userInfo) throws Exception{
	Connection cn= null;
	PreparedStatement st=null;
	ResultSet rs =null;
	
	StringBuffer sql = new StringBuffer();
	sql.append(" SELECT USER_name");
	sql.append(" FROM t_mem");
	sql.append(" WHERE user_id=?");
	sql.append(" and user_pw=?");
	
	
	//sql.append(" WHERE user_id='"+userInfo.getUser_id()+"'");
	//sql.append(" and user_pw='" +userInfo.getUser_pw()+"'");
	
	try{
		Class.forName("oracle.jdbc.OracleDriver");
		cn= DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "bigdata", "bigdata");
	//st= cn.createStatement();
	st = cn.prepareStatement(sql.toString());
	st.setString(1,userInfo.getUser_id());
	st.setString(2,userInfo.getUser_pw());
	rs=st.executeQuery();
	
	if(rs.next()){
		userInfo.setUser_name(rs.getString("user_name"));
		return userInfo;
		
	}else{
		throw new LoginFailException("아이디 혹은 비밀번호가 일치하지 않습니다.",userInfo);
	}
	
	}finally{
		if(rs != null) try{rs.close();}catch(Exception e){}
		if(st != null) try{st.close();}catch(Exception e){}
		if(cn != null) try{cn.close();}catch(Exception e){}
		
	}
	
	
	/*
	if(userInfo.getUser_id().equals("multi")&&
		userInfo.getUser_pw().equals("fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff1226583e88e0996293f16bc009c652826e0fc5c706695a03cddce372f139eff4d13959da6f1f5d3eabe"))
	{		
		userInfo.setUser_name("민철");
		return userInfo;
	}else {
		throw new LoginFailException("아이디 혹은 비밀번호가 일치하지 않습니다.",userInfo);
	}*/
 }
}


