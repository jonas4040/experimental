package jonas4040.lista.teste;

import jonas4040.lista.ListaEncadeada;

public class ListaEncadeadaTeste{
	public static void main(String[] args){
		ListaEncadeada<Integer> lista = new ListaEncadeada<>();
		lista.addComeco(1);
		lista.adicionar(3);
		lista.adicionar(4);
		lista.adicionar(2);
		lista.addComeco(99);
		System.out.println(lista);
		
		//lista.limpar();
		//System.out.println(lista);
		
		System.out.println(lista.buscar(0));
		System.out.println(lista.buscar(1));
	}
}
