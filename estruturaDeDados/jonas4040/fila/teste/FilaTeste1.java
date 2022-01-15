package jonas4040.fila.teste;

import jonas4040.fila.Fila;
import jonas4040.base.EstruturaEstatica;

public class FilaTeste1{
	public static void main(String[] args){
		Fila<Integer> fila= new Fila<>();
		
		//System.out.println(fila.estaVazia());
		//System.out.println(fila.tamanho());
		
		fila.enfileirar(1);
		fila.enfileirar(2);
		fila.enfileirar(3);
		
		System.out.println("Removendo o elemento "+fila.desenfileirar());
		System.out.println(fila);
	}
}
