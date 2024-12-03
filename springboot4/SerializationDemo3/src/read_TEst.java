import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class read_TEst {
	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("abc.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee e = (Employee) ois.readObject();
			System.out.println(e.getId());
			System.out.println(e.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
