import java.util.Scanner;

public class Intervalo{//exercicio 1072 URI
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n,x,qtdIn=0,qtdOut=0;
		n=sc.nextInt();
		
		for(int i=0;i<n;i++){
			x=sc.nextInt();
			if(x>=10 && x<20)
				qtdIn++;
			else
				qtdOut++;
		}
		System.out.println(qtdIn+" in");
		System.out.println(qtdOut+" out");
		
		sc.close();
	}
}
