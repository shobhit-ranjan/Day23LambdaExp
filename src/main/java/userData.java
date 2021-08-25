
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
			String reg = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{7,}$";
			Pattern pattern = Pattern.compile(reg);
			Matcher matcher = pattern.matcher(pass);
			return matcher.matches();
		};

	}
	
	// taking only as an indian number as an input
	// should start with either 0 or 91 
	// then it could have 6,7,8,9 
	// then other number from 0 to 9 
	// upto 9 digit
	
	public static void phonenumber() {
		UserInterface phoneNumber = (data) -> {
			String phoneNo = data;
			String reg = "(0/91)?[6-9][0-9]{9}";
			Pattern pattern = Pattern.compile(reg);
			Matcher matcher = pattern.matcher(phoneNo);
			return matcher.matches();
		};

	}

}