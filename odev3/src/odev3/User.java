package odev3;

public class User {
	private int id;
	private String userName;
	private String eMail;

	//Peki�tirme ama�l� �nceki konular� da dahil ettik.Ki gerekli de
	public User() {
		
	}
	public User(int id,String userName,String eMail) {
		this();
		this.id=id;
		this.userName=userName;
		this.eMail=eMail;
		
		
	}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String geteMail() {
	return eMail;
}
public void seteMail(String eMail) {
	this.eMail = eMail;
}


}
