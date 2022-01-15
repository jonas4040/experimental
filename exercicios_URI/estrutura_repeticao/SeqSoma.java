import java.util.Scanner;

public class SeqSoma{//exercicio 1101 URI
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int maior,menor,soma, m=0, n=0;
		m= sc.nextInt();
		n= sc.nextInt();
			
		while(m>0 && n>0){
			maior=menor=soma=0;
						
			//ordena crescente
			if(m>n){
				maior=m;
				menor=n;
			}else{
				maior=n;
				menor=m;
			}
			
			for(int i=menor;i<=maior;i++){
				System.out.print(i+" ");
				soma+=i;
			}
			System.out.println("Sum="+soma);
			m= sc.nextInt();
			n= sc.nextInt();
		}
		sc.close();
	}
}
