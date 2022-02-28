public class Contato {
	private String nome;
	private String telefone;
	private String email;

	public Contato() {}
	
	public Contato(String nome, String telefone, String email) {
		this.nome=nome;
		this.telefone=telefone;
		this.email=email;
	}
	
	//getters & setters
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public String geTelefone() {
		return this.telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone=telefone;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	@Override
	public String toString() {
		String str = nome+", "+
				telefone+", "+
				email+"\n";
		return str;
	}
}
