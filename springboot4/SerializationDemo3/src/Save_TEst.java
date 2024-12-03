import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Save_TEst {
	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("aaaa223");
		try {
			FileOutputStream fos = new FileOutputStream("abc3.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(e1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
