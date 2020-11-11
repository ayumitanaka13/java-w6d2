import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Driver {
	
	public static String getEmail() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your email");
		return input.nextLine();
	}
	public static void main(String[] args) {
		//1-Getting the pattern using compile method
		//2-Getting the matcher using matcher method
		//3-Getting true or false using matches method
	
		String email = getEmail();
		String emailRegex = "^[\\w!#$%&‘*+/=?`{|}~^-]+(?:\\.[\\w!#$%&‘*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(emailRegex); 
		Matcher matcher = pattern.matcher(email);
		
		while(!matcher.matches()) {
			System.out.println("Email not accepted!");
			email = getEmail();
			pattern = Pattern.compile(emailRegex); 
			matcher = pattern.matcher(email);
		}
	}
}
