
import java.util.regex.*;

public class userData {

	public static void firstName() {

		UserInterface firstName = (data) -> {
			String Name = data;
			String reg = "^[A-Z][a-z][A-Za-z]$";
			Pattern pattern = Pattern.compile(reg);
			Matcher matcher = pattern.matcher(Name);
			return matcher.matches();
		};

	}

	public static void LastName() {
		UserInterface lastName = (data) -> {
			String Name = data;
			String reg = "^[A-Z][a-z][A-Za-z]*$";
			Pattern pattern = Pattern.compile(reg);
			Matcher matcher = pattern.matcher(Name);
			return matcher.matches();
		};

	}

	public static void EmailId() {
		UserInterface emailId = (data) -> {
			String email = data;
			String reg = "^[A-Za-z0-9+_.-]+@(.+)$";
			Pattern pattern = Pattern.compile(reg);
			Matcher matcher = pattern.matcher(email);
			return matcher.matches();
		};

	}
}