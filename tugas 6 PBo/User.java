package modifer;

public class User extends Person {
	private String username;
	private String password;

	@Override
	public String getName() {
		return this.name;
	}
}