package jsp.member.model;

import java.sql.Timestamp;


// 데이터의 전달을 담당하는 클래스 - DTO
public class MemberBean 
{
	private String id;			// 아이디
	private String password; 	// 비밀번호
	private String name;		// 이름
	private String phone;		// 전화
	
	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public String getPhone() {return phone;}
	public void setPhone(String phone) {this.phone = phone;}
	
}
