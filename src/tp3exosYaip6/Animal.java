package tp3exosYaip6;

public abstract class Animal {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public abstract void greets();

	@Override
	public String toString() {
		return "Animal[name=" + name + "]";
	}
}
