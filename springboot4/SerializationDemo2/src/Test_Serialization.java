import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test_Serialization {

	public static void main(String[] args) {
		Student s = new Student();
		s.setId(2);
		s.setName("bbb");
		s.setEmail("bbb@gmail.com");
		s.setMobilenumber(11111);
		try {

			FileOutputStream fos = new FileOutputStream("abc.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
