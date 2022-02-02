package jonas4040.lista.teste;

import jonas4040.lista.ListaEncadeada;

public class ListaEncadeadaTeste{
	public static void main(String[] args){
		ListaEncadeada<Integer> lista = new ListaEncadeada<>();
		lista.adicionar(2);
		lista.adicionar(3);
		
		System.out.println(lista);
	}
}
