package jonas4040.vetor.teste;

import jonas4040.vetor.Vetor;

public class Aula07{//teste de add elem. em qualquer posicao e aumentar capacidade do vetor e remover em qualquer posicao
	public static void main(String[] args){
		Vetor vet=new Vetor(3);
		
		vet.adicionar("B");
		vet.adicionar("C");
		vet.adicionar("E");
		vet.adicionar("F");
		vet.adicionar("G");
		
		System.out.println(vet);
		
		/*vet.adicionar(0,"A");
		System.out.println(vet);
		
		vet.adicionar(3,"D");
		System.out.println(vet);
		*/
		
		vet.remover(1);
		System.out.println(vet);
	}
}
