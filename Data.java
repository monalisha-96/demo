package library;

public class Data {
private String name,email,password,mobile;

public Data(String name, String email, String password, String mobile) {
	//super();
	this.name = name;
	this.email = email;
	this.password = password;
	this.mobile = mobile;
}

public Data() {
	//super();
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getMobile() {
	return mobile;
}

public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String toString()
{
	return name+' '+email+' '+password+' '+mobile;
}
}