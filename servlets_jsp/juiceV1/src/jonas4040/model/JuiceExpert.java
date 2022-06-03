package jonas4040.model;

import java.util.List;
import java.util.ArrayList;

public class JuiceExpert{
	public List getBrands(String type){
		List brands = new ArrayList();
		if(type.equalsIgnoreCase("laranja")){
			brands.add("Tang");
			brands.add("Sukita");
		}else{
			brands.add("MID");
			brands.add("FIT");
		}
		
		return (brands);
	}
}
