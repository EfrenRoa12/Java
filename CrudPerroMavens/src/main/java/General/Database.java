package General;

public class Database {
	private String driver;
	private String url;
	private String usuario;
	private String password;

	public Database() {
		driver = "oracle.jdbc.OracleDriver";
		url = "jdbc:oracle:thin:@localhost:1521:xe";
		usuario = "System";
		password = "Leopardo222";
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
