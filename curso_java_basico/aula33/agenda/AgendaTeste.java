import java.util.ArrayList;
import java.util.List;

public class AgendaTeste{
	public static void main(String[] args){
		Agenda listaTel = new Agenda("Lista Telefonica");
		
		List<Contato> contatos = new ArrayList<Contato>();
		contatos.add(new Contato("Joao","3333-3333","joao@email.com"));
		contatos.add(new Contato("Clair","5555-5555","clair@email.com"));
		contatos.add(new Contato("Kim","2222-2222","kim@email.com"));
		
		listaTel.setContato(contatos);
		
		System.out.println(listaTel.getNome());
		System.out.println(listaTel.getContato());
	}
}
