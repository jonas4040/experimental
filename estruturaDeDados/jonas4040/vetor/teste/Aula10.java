package jonas4040.vetor.teste;

import jonas4040.vetor.Vetor;

public class Aula10{//teste de add elem. den qualquer tipo, nao somente string
	public static void main(String[] args){
		Vetor<Double> vet=new Vetor(3);
		
		vet.adicionar(3.3);
		vet.adicionar(2.0);
		vet.adicionar(1.5);
		vet.adicionar(7.0);
		vet.adicionar(8.9);
		
		System.out.println(vet);
	}
}
