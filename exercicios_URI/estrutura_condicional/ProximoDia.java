import java.util.Scanner;

public class ProximoDia{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int proximoDia,proximoMes,proximoAno;
		System.out.println("Digite a data dd mm aaaa seguido de espacos e depois enter:");
		int dia = sc.nextInt();
		int mes = sc.nextInt();
		int ano = sc.nextInt();
		
		proximoDia=dia;//inicializando as variaveis
		proximoMes=mes;
		proximoAno=ano;
		
		if((ano%4==0) && mes==2){//se ano for bissexto e for em fevereiro
			if(dia==28){
				proximoDia=29;
			}else if(dia==29){
				proximoDia=1;
				proximoMes=3;
			}
		}else if(mes==12 && dia==31){
			proximoDia=proximoMes=1;
			proximoAno++;
		}else if(dia==31 && (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10)){
			proximoMes++;
			proximoDia=1;
		}else if(dia==30 && (mes==4 || mes==6 || mes==9 || mes==11)){
			proximoMes++;
			proximoDia=1;
		}else if(mes==2 && dia==28){
			proximoDia=1;
			proximoMes=3;
		}else if(mes==12){
			proximoDia++;
		}else{
			proximoDia++;
			//proximoMes++;//o mes se mantem igual
			//proximoAno++;// o ano tambem
		}
		
		System.out.printf("Proximo dia: %d-%d-%d \n",proximoDia,proximoMes,proximoAno);
		sc.close();
	}
}
