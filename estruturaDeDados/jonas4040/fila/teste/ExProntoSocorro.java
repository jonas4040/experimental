package jonas4040.fila.teste;

import java.util.Queue;
import java.util.LinkedList;

public class ExProntoSocorro{//simula fila de pronto socorro
	public static void main(String[] args){
		Queue<String> filaInicial = new LinkedList<>();
		
		//filas auxiliares
		Queue<Queue> filaAux=new LinkedList<>();
		Queue<String> filaVermelha=new LinkedList<>();
		Queue<String> filaAmarela=new LinkedList<>();
		Queue<String> filaVerde=new LinkedList<>();
		
		while(filaInicial.isEmpty()){
			try{
				Thread.sleep(4000);//espera mais 4secs
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
			for(int i=0;i<6;i++){//fila inicial tem 6 pessoas
				filaInicial.add(geraPriorAleatorias());		
			}
			
			for(int i=0;i<6;i++){//separa em filas
				if(filaInicial.peek().equals("Vermelha")){
					filaVermelha.add(filaInicial.remove());
				}else if(filaInicial.peek().equals("Amarela")){
					filaAmarela.add(filaInicial.remove());
				}else{//se for verde
					filaVerde.add(filaInicial.remove());
				}
			}
			atendePessoa(filaVermelha);
			atendePessoa(filaAmarela);
			atendePessoa(filaVerde);
			System.out.println(filaAux);
			
			
			
		}
	}
	
	public static void atendePessoa(Queue<String> fila){
		for(int i=0;i<fila.size();i++){
				System.out.println("Atendendo pessoa da fila "+fila.remove());	
				try{
				Thread.sleep(5000);//consulta demora 5secs
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
	public static String geraPriorAleatorias(){
		//gera prioridades aleatorias de acordo com a urgencia, onde vermelho eh o mais urgente;
		String[] prioridades={"Vermelha","Amarela","Verde"};
		int posicao=(int) (prioridades.length*Math.random());
		return prioridades[posicao];
	}
}
