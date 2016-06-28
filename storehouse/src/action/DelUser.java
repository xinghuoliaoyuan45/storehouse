package action;

import dao.UserDao;
import entity.User;

public class DelUser {
	private String username;


	public void setUsername(String username) {
		this.username = username;
	}


	public String  execute() throws Exception{

		System.out.println(username);
		UserDao userdao=new UserDao();
		boolean m=userdao.delByname(username);
		if(m){
			return "success";
			}else{
				return "error";
			}

	}
}