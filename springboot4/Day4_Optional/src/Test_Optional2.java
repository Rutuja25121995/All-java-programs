import java.util.Optional;

public class Test_Optional2 {

	public static void main(String[] args) {

		
		
		//Student s1  = new Student(1, "aaa");
		Student s1  = null;
		
		Optional<Student> value=Optional.ofNullable(s1);
		if(value.isPresent())
		{
			System.out.println("inside if block " +value.toString());
		}else{
			System.out.println("inside else block " +value.toString());
		}
		

	}
}
