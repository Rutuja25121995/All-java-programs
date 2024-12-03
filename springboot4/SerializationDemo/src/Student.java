import java.io.Serializable;

public class Student implements Serializable{
	
	int id;
	String name;
	static String email;
	static int phone;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void setEmail(String email) {
		Student.email = email;
	}
	
	public static String getEmail() {
		return email;
	}
	
	
public static void setPhone(int phone) {
	Student.phone = phone;
}

public static int getPhone() {
	return phone;
}
}
