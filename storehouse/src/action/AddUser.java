package action;

import dao.UserDao;
import entity.User;

public class AddUser {
	private long userid;
	private String username;
	private String password;
	private long telephone;
	private String email;
	
	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getTelephone() {
		return telephone;
	}

	public void setTelephone(long telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String  execute() throws Exception{
		User user=new User();
		user.setUser_id(userid);
		user.setUser_name(username);
		user.setUser_password(password);
		user.setUser_telephone(telephone);
		user.setUser_email(email);
		UserDao userdao=new UserDao();
		System.out.println("添加该用户"+user);
		userdao.add(user);
		return "success";

	}
}
