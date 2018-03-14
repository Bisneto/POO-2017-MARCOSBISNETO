
public class Jornalista {
	private String nome;
	private String email;
	private String senha;
	
	public Jornalista(String nome, String email, String senha) {
		this.nome = nome;
		this.email = email;
		this.senha = email;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	//exception
	public boolean autentica(String senha) {
		try {
			if(this.senha == senha) {
				System.out.println("Acesso Permitido");
				return true;
			}
		}catch(NullPointerException e) {
			System.out.println("Senha não confere: "+e);
		}
		return true;
		
	}
	
	

}
