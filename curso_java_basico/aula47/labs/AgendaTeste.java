package jonas4040.aula47.labs;

import java.util.Scanner;

public class AgendaTeste {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("*** AGENDA ***");
		menuPrincipal(sc);
		
		//System.out.println(bookList.consultar(sc,contato,"koko"));
		sc.close();
	}
	
	public static void menuPrincipal(Scanner sc){
		Agenda bookList = new Agenda();
		Contato contato = bookList.addContato(sc);
				
		int opcao = 0;	
		System.out.println("*** AGENDA ***");
		System.out.println("Digite uma opcao: \n"+
							"1 - Adicionar contato\n"+
							"2 - Consultar por nome\n"+
							"3 - Consultar por telefone\n"+
							"0 - Sair da agenda\n");
		opcao=sc.nextInt();
			while(opcao != 0){
				switch(opcao){
					case 1: bookList.addContato(sc);break;
					case 2:System.out.println(bookList.consultar(sc, contato, ""));break;
					case 3:System.out.println(bookList.consultar(sc, contato, 123)); break;
					case 0:System.out.println("Saindo . . .");
					default:System.out.println("Opcao invalida, digite novamente");break;
					}
				
				System.out.println("Digite uma opcao: \n"+
						"1 - Adicionar contato\n"+
						"2 - Consultar por nome\n"+
						"3 - Consultar por telefone\n"+
						"0 - Sair da agenda\n");
				opcao=sc.nextInt();
			}
	}
}
