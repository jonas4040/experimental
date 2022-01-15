package jonas4040.vetor.teste;

import jonas4040.vetor.Vetor;

public class Exercicio2{//implementacao do metodo lastIndexOf
	public static void main(String[] args){
		Vetor vet=new Vetor(10);
		
		vet.adicionar("20");
		vet.adicionar("10");
		vet.adicionar("20");
		vet.adicionar("20");
		vet.adicionar("30");
		
		System.out.println(vet);
		
		
		System.out.println("Posicao: "+vet.ultimoIndiceDe("20"));
	}
}
