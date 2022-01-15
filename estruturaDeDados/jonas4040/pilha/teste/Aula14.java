package jonas4040.pilha.teste;

import jonas4040.pilha.Pilha;

public class Aula14{//teste de desempilhar o elemento do topo
	public static void main(String[] args){
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		for(int i=1;i<=10;i++){
			pilha.empilhar(i);
		}
		System.out.println(pilha);
		
		System.out.println("Desempilhando elemento "+pilha.desempilhar());
		System.out.println(pilha);
	}
}
