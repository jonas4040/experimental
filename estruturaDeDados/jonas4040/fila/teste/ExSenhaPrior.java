package jonas4040.fila.teste;

import java.util.Queue;
import java.util.PriorityQueue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Comparator;

public class ExSenhaPrior{//ISSUE estah imprimindo primeiro desordenamente os normais ao inves dos preferenciais
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Queue<Senha> senha= new LinkedList<>();
		Queue<Senha> senhaPreferencial= new LinkedList<>(
		);
		senha.add(new Senha(1,false));
		senha.add(new Senha(2,false));
		senha.add(new Senha(3,false));
		senhaPreferencial.add(new Senha(4,true));
		senha.add(new Senha(5,false));
		senha.add(new Senha(6,false));
		senhaPreferencial.add(new Senha(7,true));
		senha.add(new Senha(8,false));
		senhaPreferencial.add(new Senha(9,true));
		senhaPreferencial.add(new Senha(10,true));
		
		int qtdSenhasPrior=0;
		while(!senhaPreferencial.isEmpty() || !senha.isEmpty()){
			while(qtdSenhasPrior<3 && !senhaPreferencial.isEmpty()){
				qtdSenhasPrior++;
				System.out.println(senhaPreferencial.remove()+"P foi atendida");
			}
			if(qtdSenhasPrior<=3){
				qtdSenhasPrior=0;
				System.out.println(senha.remove()+" foi atendida");
			}
			
			
		}
	}
}
