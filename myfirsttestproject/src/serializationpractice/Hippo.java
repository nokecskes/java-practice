package serializationpractice;

import java.io.Serializable;

public class Hippo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private int weight;
	private transient String home;
	
	public Hippo() {
		this.name = "Fiona";
		this.weight = 454;
		this.setHome("USA");
	}
	
	public String getName() {
		return name;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}
	
	@Override
	public String toString() {
		return String.format("Hi, my name is %s! My weight is %d lbs. I live in %s.",
				this.name, this.weight, this.home);
	}
}
