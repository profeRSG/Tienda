package modelo.usuario;

public class Cliente extends Usuario{
	
	private String password;
	private boolean prime;
	

	public Cliente(String username, String nombre, String password,boolean prime) {
		super(username,nombre);
		this.password = password;
		this.prime=prime;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isPrime() {
		return prime;
	}

	public void setPrime(boolean prime) {
		this.prime = prime;
	}
	
	

}
