package fx;

import java.util.Scanner;

public class Cpu extends Chat{
	Cpu(){
		
		send("I'm Sandy, type a message.");
		check();
		
	}
	
	//Override
	public String send(String msg){
		super.send("Cpu: "+msg);
		return msg;
	}
	
	public void check(){
		User us= new User();
		Scanner s = new Scanner(System.in);
		String text="";
		boolean a=true;
		do{
		System.out.print("You: ");
		text = s.nextLine();
		us.send(text);
		
		switch(text.toLowerCase()){
			case "oi":case "hi":case "hello":case "ola": send("Hello!");break;
			case "what can you do?":case "o que você faz?":send("I can talk to you :)");break;
			case "tell me a name of an animal": case "fale um nome de um animal": animal();break;
			case "exit":case "sair":case "bye":case"tchau":send("Bye mate!"); a=false;break;
			default: send("I beg your pardon, I didn't got it :(");break;
		}
		}while(a!=false);
	}
	
	public void animal(){
		String[] a={"Elephant","Lion","Monkey","Bee","Spider","Ant","Donkey"};
		send(a[(int)(Math.random()*a.length)]+", what else?");
	}
}
