package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import entity.User;

/* 
 create table user
(
  user_id bigint  identity primary key,
  user_name varchar(20) default null,
  user_password varchar(20) default null,
  user_telephone  bigint  default null ,
  user_email varchar(20) default null,        
)

 */
public class UserDao {

	String driver="org.hsqldb.jdbcDriver";
	String url="jdbc:hsqldb:hsql://localhost/";//hsqldb默认server 不需要写数据库名字，如果写要写别名！
	String user="sa";
	String pass="";
	public boolean add(User person) throws Exception{
		Class.forName(driver);
		int row = 0;
		Connection con=DriverManager.getConnection(url,user,pass);
		String sql="insert into user(user_id,user_name,user_password,user_telephone,user_email)values (?,?,?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt=con.prepareStatement(sql);
		pstmt.setLong(1,person.getUser_id());
		pstmt.setString(2,person.getUser_name());
		pstmt.setString(3,person.getUser_password());
		pstmt.setLong(4, person.getUser_telephone());
		pstmt.setString(5, person.getUser_email());	
		row=pstmt.executeUpdate();
		pstmt.close();con.close();
		return row>0;	
	}
	public boolean delByname(String name)throws Exception {
		Class.forName(driver);
		
		Connection con=DriverManager.getConnection(url,user,pass);
		String sql="delete from user where user_name='"+name+"'";
		PreparedStatement pstmt=con.prepareStatement(sql);
		int row=pstmt.executeUpdate();
		pstmt.close();con.close();
		return row>0;
	}
	public boolean findUser(String name,String pw)throws Exception {
		Class.forName(driver);	
		Connection con=DriverManager.getConnection(url,user,pass);
		String sql="select * from user where user_name="+name;
		PreparedStatement pstmt=con.prepareStatement(sql);
		ResultSet rs=pstmt.executeQuery();
		pstmt.close();con.close();
		if(rs.next()){
			if(rs.getString("user_password").equals(pw))
			{
				return true;
			}else{
				System.out.println("密码不对"); 
				return false;
			}
		}else{
			System.out.println("用户名不对");
			return false;
		}
	}
	/**测试
	 * @throws Exception */
	@Test
	public void addTest() throws Exception{
		Class.forName(driver);
		int row = 0;
		Connection con=DriverManager.getConnection(url,user,pass);
		String sql="insert into user(user_id,user_name,user_password,user_telephone,user_email)values (?,?,?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt=con.prepareStatement(sql);
		pstmt.setLong(1,1);	
		pstmt.setString(2,"123");
		pstmt.setString(3,"123456");
		pstmt.setLong(4, 123456789);
		pstmt.setString(5, "123@qq.com");	
		row=pstmt.executeUpdate();
		pstmt.close();con.close();		

	}
	@Test
	public void deleteTest() throws Exception{
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url,user,pass);
		String sql="delete from user where user_id="+1;
		PreparedStatement pstmt=con.prepareStatement(sql);
		int row=pstmt.executeUpdate();
		pstmt.close();con.close();

	}


}
