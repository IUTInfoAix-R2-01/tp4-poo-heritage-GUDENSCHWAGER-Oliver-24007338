package tp3exosYaip6;

public class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void greets() {
		System.out.println("Meow");
	}
	
	@Override
	public String toString() {
		return "Cat[" + super.toString() + "]";
	}

	public static void main(String[] args) {
		Cat c1 = new Cat("Gato");
		c1.greets();
		System.out.println(c1);
	}
}
