package jsp.member.model;

import java.sql.Timestamp;


// �������� ������ ����ϴ� Ŭ���� - DTO
public class MemberBean 
{
	private String id;			// ���̵�
	private String password; 	// ��й�ȣ
	private String name;		// �̸�
	private String phone;		// ��ȭ
	
	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public String getPhone() {return phone;}
	public void setPhone(String phone) {this.phone = phone;}
	
}
