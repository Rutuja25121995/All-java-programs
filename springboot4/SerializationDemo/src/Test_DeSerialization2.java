import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test_DeSerialization2 {

	public static void main(String[] args) {
		Student s = new Student();
		s.setId(1);
		s.setName("aaa");

		try {

			FileInputStream fis = new FileInputStream("abc2.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			Student s1 = (Student) ois.readObject();
			System.out.println("data read from deserialization ");
			System.out.println(s1.getId());
			System.out.println(s1.getName());
			System.out.println(s1.getEmail());
			System.out.println(s1.getPhone());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
