import java.util.Optional;

public class Test_Optional {

	public static void main(String[] args) {

		//String s = "dinesh";
		String s = null;
		
		Optional<String> value = Optional.ofNullable(s);
		
		if(value.isPresent())
		{
			System.out.println("inside if block");			
		}else
		{
			System.out.println("inside else block");
		}

	}
}
