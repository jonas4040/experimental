import java.util.Scanner;

public class Multiplos13{//exercicio 1132 URI
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int x,y,soma=0,maior,menor;
		x=sc.nextInt();
		y=sc.nextInt();
		
		if(x<y){
			menor=x;
			maior=y;
		}else{
			menor=y;
			maior=x;
		}
		
		for(int i=menor;i<=maior;i++){
			if(i%13!=0)
				soma+=i;
		}
		System.out.println(soma);
		
		sc.close();
	}
}
