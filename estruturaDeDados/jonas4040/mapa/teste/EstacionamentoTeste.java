package jonas4040.mapa.teste;

import jonas4040.mapa.Carro;
import java.util.Map;
import java.util.HashMap;

public class EstacionamentoTeste{
	public static void main(String[] args){
		Carro carro1 = new Carro("Chevrolet Onix","Preto");
		carro1.setAno(2008);
		carro1.setDono("Ismael Ferreira");
		
		Carro carro2 = new Carro("Wolkswagen","Cinza");
		carro2.setAno(2012);
		carro2.setDono("Izabela Lopez");
		
		Carro carro3 = new Carro("Honda","Vermelho");
		carro3.setAno(2000);
		carro3.setDono("Adcarlo Dumontti");
		
		Map mapaCarros = new HashMap<String,Carro>();
		mapaCarros.put("ADA-1092",carro1);
		mapaCarros.put("KEY-8261",carro2);
		mapaCarros.put("VLW-9287",carro3);
		
		buscaPlaca(mapaCarros,"VLW-9287");
	}
	
	//busca o carro pela Placa, no momento completa, mas futuramente com as letras iniciais
	public static void buscaPlaca(Map<String,Carro> mapa, String placa){
		//busca
		if(mapa.containsKey(placa)){
			System.out.println("Placa: "+placa+"\n"+mapa.get(placa));
		}else{
			System.out.println("Esta chave nao existe");
		}
	}
}
