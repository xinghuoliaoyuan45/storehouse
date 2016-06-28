package action;

import java.util.ResourceBundle;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserDao;

public class LoginAction extends ActionSupport {
	public String username;
	public String password;
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String execute() throws Exception{
		System.out.println(username);
		System.out.println(password);
		
		ResourceBundle rb = ResourceBundle.getBundle("Root");
		String mastername = rb.getString("master");
		String matserpassword = rb.getString("masterpassword");
		if(username.toString().equals(mastername)&&password.equals(matserpassword))
		{
			return "success1";//到操作页面		
		}
		UserDao userdao=new UserDao();
		long l;
		try {
			l = Long.parseLong(username);
		} catch (Exception e) {
			System.out.println("string 转long 出错");
			return "error";
		}	
		if(userdao.findUser(username, password))
		{
			return "success";//到操作页面
		}else{
			return "error";
		}	

	}

}
