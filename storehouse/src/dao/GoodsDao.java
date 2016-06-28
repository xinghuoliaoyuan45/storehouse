package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import entity.Goods;
/*
 * /*
create table goods
(
  goods_id bigint  identity primary key ,
  goods_name varchar(15) default null,
  goods_number int default null,
  goods_price double default null,
  goods_description varchar(20) default null,          
)
 */
 

public class GoodsDao {
		String driver="org.hsqldb.jdbcDriver";
		String url="jdbc:hsqldb:hsql://localhost/";//hsqldb默认server 不需要写数据库名字，如果写要写别名！
		String user="sa";
		String pass="";
	
		public  List<Goods> findAll()throws Exception {
			List<Goods> goodss=new ArrayList<Goods>();		
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,user,pass);
			String sql="select * from goods";
			PreparedStatement pstmt=con.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();		
			while(rs.next()){
				Goods goods=new Goods();
				goods.setGoods_id(rs.getLong("goods_id"));
				goods.setGoods_name(rs.getString("goods_name"));
				goods.setGoods_number(rs.getInt("goods_number"));
				goods.setGoods_price(rs.getDouble("goods_price"));
				goods.setGoods_description (rs.getString("goods_description"));
				goodss.add(goods);
				
			}
			rs.close();pstmt.close();con.close();
			//System.out.println(Goodss);
			return goodss;

		}
		public  List<Goods> findbylikename(String likename)throws Exception {
			List<Goods> goodss=new ArrayList<Goods>();		
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,user,pass);
			String sql="select * from goods where goods_name like ?";			
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1,"%"+likename+"%");
			ResultSet rs=pstmt.executeQuery();		
			while(rs.next()){
				Goods goods=new Goods();
				goods.setGoods_id(rs.getLong("goods_id"));
				goods.setGoods_name(rs.getString("goods_name"));
				goods.setGoods_number(rs.getInt("goods_number"));
				goods.setGoods_price(rs.getDouble("goods_price"));
				goods.setGoods_description (rs.getString("goods_description"));
				goodss.add(goods);
				
			}
			rs.close();pstmt.close();con.close();
			//System.out.println(Goodss);
			return goodss;

		}

		public boolean delById(long id)throws Exception {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,user,pass);
			String sql="delete from goods where goods_id="+id;
			PreparedStatement pstmt=con.prepareStatement(sql);
			int row=pstmt.executeUpdate();
			pstmt.close();con.close();
			return row>0;
		}
		
		public boolean delByName(String name)throws Exception {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,user,pass);
			String sql="delete from goods where goods_name='"+name+"'";
			PreparedStatement pstmt=con.prepareStatement(sql);
			int row=pstmt.executeUpdate();
			pstmt.close();con.close();
			return row>0;
		}
		
		public Goods findById(long id) throws Exception {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,user,pass);
			String sql="select * from goods where goods_id="+id;
			PreparedStatement pstmt=con.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			Goods goods=new Goods();			
			while(rs.next()){
				goods.setGoods_id(rs.getLong("goods_id"));
				goods.setGoods_name(rs.getString("goods_name"));
				goods.setGoods_number(rs.getInt("goods_number"));
				goods.setGoods_price(rs.getDouble("goods_price"));
				goods.setGoods_description (rs.getString("goods_description"));
			}
			rs.close();pstmt.close();con.close();	
			return goods;
		}
		
		public boolean update(Goods goods) throws Exception {
			Class.forName(driver);
			PreparedStatement pstmt = null;
			System.out.println(goods);
			int row = 0;
			Connection con=DriverManager.getConnection(url,user,pass);
			String sql="update goods set goods_name=? ,goods_number=?, goods_price=? ,goods_description=? where goods_id=?"; 
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,goods.getGoods_name());		
			pstmt.setInt(2,goods.getGoods_number());
			pstmt.setDouble(3, goods.getGoods_price());
			pstmt.setString(4, goods.getGoods_description());
			pstmt.setLong(5,goods.getGoods_id());		
			row=pstmt.executeUpdate();
			pstmt.close();con.close();
			return row>0;		
		}
		public boolean updateprice(Goods goods) throws Exception {
			Class.forName(driver);
			PreparedStatement pstmt = null;
			System.out.println(goods);
			int row = 0;
			Connection con=DriverManager.getConnection(url,user,pass);
			String sql="update goods set goods_price=? where goods_id=?"; 
			pstmt=con.prepareStatement(sql);			
			pstmt.setDouble(1, goods.getGoods_price());	
			pstmt.setLong(2,goods.getGoods_id());		
			row=pstmt.executeUpdate();
			pstmt.close();con.close();
			return row>0;		
		}
		public boolean updatechuku(Goods goods) throws Exception {
			Class.forName(driver);
			PreparedStatement pstmt = null;
			System.out.println(goods);
			int row = 0;
			Connection con=DriverManager.getConnection(url,user,pass);
			String sql="update goods set goods_number=? where goods_id=?"; 
			pstmt=con.prepareStatement(sql);			
			pstmt.setInt(1,goods.getGoods_number());	
			pstmt.setLong(2,goods.getGoods_id());		
			row=pstmt.executeUpdate();
			pstmt.close();con.close();
			return row>0;		
		}
		
		public boolean add(Goods goods) throws Exception{
			Class.forName(driver);
			int row = 0;
			Connection con=DriverManager.getConnection(url,user,pass);
			String sql="insert into goods (goods_name,goods_number,goods_price,goods_description,goods_id) values (?,?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,goods.getGoods_name());		
			pstmt.setInt(2,goods.getGoods_number());
			pstmt.setDouble(3, goods.getGoods_price());
			pstmt.setString(4, goods.getGoods_description());
			pstmt.setLong(5,goods.getGoods_id());		
			row=pstmt.executeUpdate();
			pstmt.close();con.close();
			return row>0;	

		}
		/**
		 * 在读取excel 里面 判断是否有新的Goods在excel
		 * 如果有就 调用updata
		 * 没有add
		 */
		
		public boolean judgeidexist(long id) throws Exception {
			Boolean x;
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,user,pass);
			String sql="select * from goods where id="+id;
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			//因为 只有一个结果可以这样写，如果多行就不能最后都是x=false
			if(rs.next()){
				x = true;//数据库有这个id
			}
			else 
			{
				x= false;//结果集为空； 
			}
			rs.close();stmt.close();con.close();
			return x;

		}
		////自己测试///////////////////////////////////////////////////
		//insert into goods (goods_id,goods_name)values(1,'qwe')
		@Test
		public void find() throws Exception{
			int id=1;
			Class.forName(driver);
			Goods goods=new Goods();
			Connection con=DriverManager.getConnection(url,user,pass);
			String sql="select * from goods where goods_id="+id;
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			if(rs.next()){
				goods.setGoods_name(rs.getString("goods_name"));
				
			}
			
			rs.close();stmt.close();con.close();
			System.out.println(goods);		
		}
	



	}



