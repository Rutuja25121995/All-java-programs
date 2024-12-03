import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test_Serialization2 {

	public static void main(String[] args) {
		Student s = new Student();
		s.setId(2);
		s.setName("bbb");
		s.setEmail("bbb@gmail.com");
		s.setPhone(111111);
		try {

			FileOutputStream fos = new FileOutputStream("abc2.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
