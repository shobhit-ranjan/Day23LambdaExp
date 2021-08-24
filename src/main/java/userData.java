
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

	// start-of-string
	// a digit must occur at least once
	// a lower case letter must occur at least once
	// an upper case letter must occur at least once
	// a special character must occur at least once
	// anything, at least seven places though
	public static void password() {

		UserInterface password = (data) -> {
			String pass = data;
			String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{7,}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(pass);
			return matcher.matches();
		};

	}
}