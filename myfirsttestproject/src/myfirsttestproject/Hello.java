package myfirsttestproject;

public class Hello {
	
	String name;
	
	public Hello(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Hello " + this.name;
	}
	
	
}
