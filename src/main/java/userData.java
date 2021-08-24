
import java.util.regex.*;

public class userData {

	public static void firstName() {

		UserInterface firstName = (data) -> {
			String Name = data;
			String reg = "^([A-Z][a-z]{3,})$";
			Pattern pattern = Pattern.compile(reg);
			Matcher matcher = pattern.matcher(Name);
			return matcher.matches();
		};

	}

	public static void LastName() {
		UserInterface lastName = (data) -> {
			String Name = data;
			String reg = "^([A-Z][a-z]{3,})$";
			Pattern pattern = Pattern.compile(reg);
			Matcher matcher = pattern.matcher(Name);
			return matcher.matches();
		};

	}
}