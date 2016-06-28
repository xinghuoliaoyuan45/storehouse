package entity;

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

public class User {

	private long  user_id ;
	private String  user_name ;
	private String  user_password ;
	private  long user_telephone  ;
	private  String user_email    ;  
	public User(){
		
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public long getUser_telephone() {
		return user_telephone;
	}
	public void setUser_telephone(long user_telephone) {
		this.user_telephone = user_telephone;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ",user_name=" + user_name + ", user_password=" + user_password
				+ ", user_telephone=" + user_telephone + ", user_email="
				+ user_email + "]";
	}
	


}
