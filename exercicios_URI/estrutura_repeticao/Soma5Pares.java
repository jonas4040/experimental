import java.util.Scanner;

public class Soma5Pares{//exercicio 1159 URI
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int soma=0, i=0;
		int x=sc.nextInt();
		while(x!=0){
			soma=0;
			i=0;
			if(x%2!=0)
				x++;
			while(i<5){
				soma+=x;
				x+=2;
				i++;		
				//System.out.println("  x-->"+x+"  soma --->"+soma);
			}
			System.out.println(soma);
			x=sc.nextInt();
		}
		
		sc.close();
	}
}
