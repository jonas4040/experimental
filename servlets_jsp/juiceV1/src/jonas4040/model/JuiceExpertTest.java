package jonas4040.model;

//import jonas4040.model.JuiceExpert;
import java.util.List;
import java.util.ArrayList;

public class JuiceExpertTest{
	public static void main(String[] args){
		JuiceExpert juice = new JuiceExpert();
		System.out.println(juice.getBrands("laranja"));
		System.out.println(juice.getBrands("abacaxi"));
	}
}
