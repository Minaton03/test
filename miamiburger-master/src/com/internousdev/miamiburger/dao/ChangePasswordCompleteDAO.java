package com.internousdev.miamiburger.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.miamiburger.util.DBConnector;
import com.internousdev.miamiburger.util.DateUtil;

public class ChangePasswordCompleteDAO {

	public int ChangePassword(String password,String userId) throws SQLException {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		DateUtil dateUtil = new DateUtil();
		int check=0;

		String sql = "UPDATE  user_info SET password=?, update_date=? WHERE user_id=?";

			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, password);
				preparedStatement.setString(2, dateUtil.getDate());
				preparedStatement.setString(3, userId);

				check = preparedStatement.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				connection.close();
		    }
			return check;
	}

	public boolean passwordConfirm(String userId,String secretQuestion,String secretAnswer){
		boolean result = false;

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		//ユーザーID、秘密の質問、答えから検索
		String sql = "SELECT * FROM user_info WHERE user_id = ? AND secret_question =? AND secret_answer = ?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, secretQuestion);
			ps.setString(3, secretAnswer);
			ResultSet rs = ps.executeQuery();

			if(rs.next()){

				//三つが同じなら真を返す
				if(rs.getString("user_id").equals(userId) && rs.getString("secret_question").equals(secretQuestion) && rs.getString("secret_answer").equals(secretAnswer)){
					result = true;
				}
			}

		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}

	public int passwordInsert(String userId,String password){

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		
		int check = 0;

		//ユーザーIDで検索しパスワードを書き換え
		String sql = "UPDATE user_info SET password = ? WHERE user_id = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, password);
			ps.setString(2, userId);
			check = ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return check;

	}
}
