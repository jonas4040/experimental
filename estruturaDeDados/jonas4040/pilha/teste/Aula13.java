package jonas4040.pilha.teste;

import jonas4040.pilha.Pilha;

public class Aula13{//teste de empilhar e de ver se estah vazia
	public static void main(String[] args){
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		System.out.println(pilha.estaVazia());
		System.out.println(pilha.topo());
		
		for(int i=1;i<=10;i++){
			pilha.empilhar(i);
		}
		
		System.out.println(pilha.estaVazia());
		System.out.println(pilha.topo());
	}
}
