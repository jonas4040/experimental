public class Phraser{
	
	public static void main(String[] args){
		//frases
		String[] fr1={"24/7","várias camadas","8Km","e-commerce","todos ganham",
		"front-viadagem","baseado na Web","difundido",
		"inteligente","seis sigma","caminho dos fofoqueiros","dinâmico"};

		String[] fr2={"habilitado","colante","acrescentou","orientado","central","distribuído",
		"agrupado","solidificado","se vira sem máquina","posicionado","em rede","dedicado","alavancado",
		"alinhado","destinado","compartilhado","cooperativo","acelerado"};

		String[] fr3={"processo","nas alturas","solução","arquitetura","habilitação no núcleo","estratégia","partilha da mente","portal",
		"espaço","visão","paradigma","continuadigma","missão"};
	
		//tamanhos de cada frase
		int tam1 =fr1.length;
		int tam2=fr2.length;
		int tam3 =fr3.length;

		//num aleatorios de acordo com o tamanho de cada frase
		int rand1=(int) (Math.random()*tam1);
		int rand2=(int) (Math.random()*tam2);
		int rand3=(int) (Math.random()*tam3);
		
		System.out.printf(fr1[rand1]+" "+fr2[rand2]+" "+fr3[rand3]+"\n");
	}
}
