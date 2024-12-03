import java.util.Optional;
import java.util.function.Supplier;

public class Test_Optional3 {

	public static void main(String[] args) {

		
		
		Student s1  = new Student(1, "aaa");
		//Student s1  = null;
		Optional<Student> value=Optional.ofNullable(s1);
		
		//System.out.println(value.filter(s->s.getId()==11).orElse(new Student()));
		
		System.out.println(value.filter(s->s.getId()==11).orElseThrow(()->new ArithmeticException("records not found ")));
		
		
		

	}
}
