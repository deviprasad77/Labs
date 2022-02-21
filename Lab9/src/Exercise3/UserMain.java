package Exercise3;

public class UserMain {

	public static void main(String[] args) {

		String name = "Devivaraprasad";
		String key = "dev123";
		User user = ((username, password) -> {
			if (username.equals(name) && password.equals(key))
				return true;
			else
				return false;
		});
		System.out.println(user.checkIdentity("Devivaraprasad", "dev123"));
	}
	
}
