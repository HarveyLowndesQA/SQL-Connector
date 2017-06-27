
public class SQLDatabase {

	
	private String url;
	private String user;
	private String pass;
	
	public SQLDatabase(String url, String user, String pass) {
		this.setUrl(url);
		this.setUser(user);
		this.setPass(pass);
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public void connect() {
		
	}
	
	public void testConnection() {
		
	}
}
