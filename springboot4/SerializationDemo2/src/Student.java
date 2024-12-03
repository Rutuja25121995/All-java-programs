import java.io.Serializable;

public class Student implements Serializable {

	int id;
	String name;
	static String email;
	transient int mobilenumber;

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

	public void setMobilenumber(int mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public int getMobilenumber() {
		return mobilenumber;
	}

}
