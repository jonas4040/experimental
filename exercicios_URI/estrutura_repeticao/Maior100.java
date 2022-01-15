import java.util.Scanner;

public class Maior100{//exercicio 1080 URI
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int maior, menor, posicao=0, aux, num;
		maior=menor=0;
		
		for(int i=1;i<=100;i++){
			num=sc.nextInt();
			menor=num;
			
			if(menor>maior){
				aux=maior;
				maior=menor;
				menor=aux;
				posicao=i;
				//System.out.println("Maior -->: "+maior+" Menor -->: "+menor);				
			}
		}
		System.out.println(maior);
		System.out.println(posicao);
		sc.close();
	}
}
