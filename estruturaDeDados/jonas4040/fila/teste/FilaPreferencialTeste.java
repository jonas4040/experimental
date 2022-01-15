package jonas4040.fila.teste;

import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;
import jonas4040.fila.teste.Pessoa;

public class FilaPreferencialTeste{
	public static void main(String[] args){
		Queue<Pessoa> filaPreferencial = new PriorityQueue<>(
			new Comparator<Pessoa>(){
				Integer prioridadePessoa1;
				Integer prioridadePessoa2;
				
				@Override
				public int compare(Pessoa p1, Pessoa p2){//compara pela prioridade
					prioridadePessoa1=p1.getPrioridade();
					prioridadePessoa2=p2.getPrioridade();
					return Integer.valueOf(prioridadePessoa1.compareTo(prioridadePessoa2));
				}
			}
		);
		
		Pessoa p1 = new Pessoa("homem");
		Pessoa p2 = new Pessoa("mulher");
		Pessoa p3 = new Pessoa("idoso");
		Pessoa p4 = new Pessoa("homem");
		Pessoa p5 = new Pessoa("gestante");
		
		filaPreferencial.add(p1);
		filaPreferencial.add(p2);
		filaPreferencial.add(p3);
		filaPreferencial.add(p4);
		filaPreferencial.add(p5);
		
		System.out.println(filaPreferencial);//teria que ser exibido nesta ordem: idoso ou gestante, homem,mulher,homem
	}
}
