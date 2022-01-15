package jonas4040.vetor.teste;
import jonas4040.vetor.Vetor;

public class Aula05{// Dois testes de busca
	public static void main(String[] args){
		Vetor vetor = new Vetor(10);
		
		//posicoes ao lado do comentario
		vetor.adicionar("Jack");//0
		vetor.adicionar("Jackson");//1
		vetor.adicionar("Jaque");//2
		vetor.adicionar("Jegue");//3
		
		System.out.println(vetor.buscar("Jaque"));
		System.out.println(vetor.buscar("Jaq"));
		
	}
}
