import java.util.Scanner;

public class Maximo{//exercicio 1 vetores
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N,posicao=0;
		double maior;
		N=sc.nextInt();
		double[] num= new double[N];
		
		for(int i=0;i<N;i++){
			num[i]=sc.nextDouble();
		}
		
		maior=num[0];
		for(int j=0;j<N-1;j++){
			if(maior>num[j+1]){
				//maior=num[j];
				posicao=j;
			}else{
				maior=num[j+1];
				posicao=j+1;
			}
		}
		System.out.println(maior);
		System.out.println(posicao+1);
		
		sc.close();
	}
}
