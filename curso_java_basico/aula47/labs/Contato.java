package jonas4040.aula47.labs;

public class Contato {
	private long ID;
	private String nome;
	private long telefone;
	public static int cont=0;//variavel para contar quantas vezes obj foi instanciado
	
	public Contato() {cont++;this.ID=cont;}

	public Contato(String nome, long telefone) {
		cont++;
		this.nome = nome;
		this.telefone = telefone;
		this.ID = cont;
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Contato [ID=" + ID + ", nome=" + nome + ", telefone=" + telefone + "]";
	}
	
	
}