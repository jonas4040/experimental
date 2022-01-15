package jonas4040.vetor.teste;

import jonas4040.vetor.Vetor;

public class Vetor1Teste{//teste para add elementos num vetor de 5 elementos
	public static void main(String args[]){
		Vetor vet = new Vetor(5);
		
		//mostra o que tem antes de add
		/*for(int i=0;i<5;i++){//para cada elemento de vet
			System.out.print(vet.elementos[i]+" ");
		}
		System.out.println();
		*/
		//adiciona elementos
	
		/*try{
			vet.adicionar("elemento 1");
			vet.adicionar("elemento 2");
			vet.adicionar("elemento 3");
			vet.adicionar("elemento 4");
			vet.adicionar("elemento d1");
			vet.adicionar("elemento 23");
		}catch(Exception e){
			e.printStackTrace();
		}*/
	
		vet.adicionar("elemento 1");
		vet.adicionar("elemento 2");
		vet.adicionar("elemento 3");
		vet.adicionar("elemento 4");
		vet.adicionar("elemento d1");
		vet.adicionar("elemento 23");
	
	}
}
