package jonas4040.vetor.teste;

import jonas4040.vetor.Vetor;

public class Exercicio3{//implementacao do metodo remover por elemento
	public static void main(String[] args){
		Vetor<Integer> vet=new Vetor(10);
		
		/*vet.adicionar("20");
		vet.adicionar("10");
		vet.adicionar("20");
		vet.adicionar("20");
		vet.adicionar("30");*/
		
		vet.adicionar(20);
		vet.adicionar(10);
		vet.adicionar(20);
		vet.adicionar(20);
		vet.adicionar(30);
		
		System.out.println(vet);
		
		//vet.remover("20");
		vet.limpar();
		System.out.println(vet);
	}
}
