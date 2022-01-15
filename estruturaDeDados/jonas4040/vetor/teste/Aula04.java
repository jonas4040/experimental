package jonas4040.vetor.teste;
import jonas4040.vetor.Vetor;

public class Aula04{// teste de imprimir elementos e ver tamanho real do vetor
	public static void main(String[] args){
		Vetor vetor = new Vetor(10);
		vetor.adicionar("elemento a1");
		vetor.adicionar("elemento b1");
		vetor.adicionar("elemento c1");
		
		vetor.adicionar("elemento a2");
		
		
		System.out.println("Tamanho do vetor: "+vetor.tamanho());
		System.out.println("Elementos: "+vetor);
	}
}
