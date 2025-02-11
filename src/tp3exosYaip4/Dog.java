package tp3exosYaip4;

public class Dog extends Mammal{
	public Dog(String name) {
		super(name);
	}
	
	public void greets() {
		System.out.println("Woof");
	}
	
	public void greets(Dog another) {
		System.out.println("Woooof");
	}

	@Override
	public String toString() {
		return "Dog[" + super.toString() + "]";
	}
	
	public static void main(String[] args) {
		Dog Johnny = new Dog("Johnny");
		Dog Padzo = new Dog("Padzo");
		Johnny.greets();
		Johnny.greets(Padzo);
		System.out.println(Johnny);
	}
}
