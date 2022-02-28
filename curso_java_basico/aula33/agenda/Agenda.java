import java.util.List;
import java.util.ArrayList;

public class Agenda {
	private String nome;
	private List<Contato> contato;

	public Agenda() {
	}

	public Agenda(String nome) {
		this.nome = nome;
	}

	// getters & setters
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Contato> getContato(){
		return this.contato;
	}
	
	public void setContato(List<Contato> listaContato) {
		this.contato=listaContato;
	}
}
