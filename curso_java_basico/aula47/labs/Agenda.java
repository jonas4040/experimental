package jonas4040.aula47.labs;

import java.util.List;

public class Agenda {
	//TODO escrever algoritmo
	private List<Contato> contatos;
	
	public void consultar(List<Contato> agenda, int ID) {
		if(agenda.get(ID-1).getID()==contatos.get(ID-1).getID()) {}
	}
	
	public void consultar(String nome) {
		//if() {}
	}
	
	public boolean addContato(Contato contato) {
		return false;
	}
}
