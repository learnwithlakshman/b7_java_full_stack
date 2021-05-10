package com.careerit.todo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.careerit.todo.dao.util.DbConnection;
import com.careerit.todo.domain.RegUser;

public class UserDAOImpl implements UserDAO {

	private DbConnection connUtil = DbConnection.util;
	private static final Logger log = Logger.getLogger(UserDAOImpl.class.getName());

	private static final String REG_USER = "insert into reguser(username,email,password) values(?,?,?)";
	private static final String SELECT_USER = "select username from reguser where (username=? or email=?) and password=?";

	@Override
	public String selectUser(String username, String password) {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			con = connUtil.getConnection();
			pst = con.prepareStatement(SELECT_USER);
			pst.setString(1, username);
			pst.setString(2, username);
			pst.setString(3, password);
			
			 rs = pst.executeQuery();
			if(rs.next()) {
				log.log(Level.INFO,"User login successfully");
				return rs.getString("username");
			}
		}catch (Exception e) {
			log.log(Level.INFO,"While selecting user :"+e);
		}finally {
			connUtil.close(rs, pst, con);
		}
		return null;
	}

	@Override
	public String insertUser(RegUser regUser) {
		Connection con = null;
		PreparedStatement pst = null;
		try {
			con = connUtil.getConnection();
			pst = con.prepareStatement(REG_USER);
			pst.setString(1, regUser.getUsername());
			pst.setString(2, regUser.getEmail());
			pst.setString(3, regUser.getPassword());
			int res = pst.executeUpdate();
			if(res != 0) {
				log.log(Level.INFO,"User registered successfully");
				return regUser.getUsername();
			}
		}catch (Exception e) {
			log.log(Level.INFO,"While registering user :"+e);
		}finally {
				connUtil.close(pst, con);
		}
		return null;
	}

}
