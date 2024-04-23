package string_builder;

public class PasswordTester {

	public static boolean isGoodPassword(String password) {
		if ((password.contains("#") || password.contains("!") || password.contains("?"))
			&& (password.length() > 12)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isGoodPassword("dsfjdsfjsdfAHAHHD??!"));

	}

}
