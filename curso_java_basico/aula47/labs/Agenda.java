package jonas4040.aula47.labs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {	
	private List<Contato> contatos;
	
	public Agenda() {contatos=new ArrayList<>();}
	
	public String consultar(Scanner sc, Contato contato, String nome) {
		System.out.print("---Pesquisar contato---\nDigite o nome do contato: ");
		nome = sc.next();
		
		if(this.getContatos().contains(contato) && contato.getNome().equals(nome)) {
			return this.getContatos().get(this.getContatos().indexOf(contato)).toString();
		}else {
			try{
				throw new ContatoNaoExisteException("Aconteceu um erro, o contato nao existe.");
			}catch(ContatoNaoExisteException e) {
				e.getMessage();
			}
		}
		return "";
	}
	
	public String consultar(Scanner sc, Contato contato, long telefone) {
		System.out.print("---Pesquisar contato---\nDigite o telefone do contato (somente numeros): ");
		telefone = sc.nextLong();
		
		if(this.getContatos().contains(contato) && contato.getTelefone()==telefone) {
			return this.getContatos().get(this.getContatos().indexOf(contato)).toString();
		}
		return "Contato nao existe \n";
	}
	
	public Contato addContato(Scanner sc) {
		List<Contato> agenda=new ArrayList<Contato>();
		Contato contato=null;
		boolean deuCerto=false;
		
		//for(int i=0;i<3;i++) {
			System.out.print("---Criar novo contato---\nDigite o nome do contato: ");
			String nome=sc.next();
			System.out.print("Digite o telefone (somente numeros). Ex: 11941025765: ");
			String telefone="";
			try {
			telefone=sc.next();
			}catch(NumberFormatException nfe) {
				System.out.println("Aconteceu um erro, digite somente numeros, \nsem letras ou caracteres");
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
			try {
				contato =new Contato(nome,Long.parseLong(telefone));
			}catch(NumberFormatException nfe) {
				System.out.println("Aconteceu um erro, digite somente numeros, \nsem letras ou caracteres");
			}
			deuCerto=agenda.add(contato);
			this.setContatos(agenda);
		//}
		return contato;
	}
	
	
	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

	@Override
	public String toString() {
		return "Agenda [contatos=" + contatos + "]";
	}
}
