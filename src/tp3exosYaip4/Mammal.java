package tp3exosYaip4;

public class Mammal extends Animal {
	public Mammal(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Mammal[" + super.toString() + "]";
	}
	
	public static void main(String[] args) {
		Mammal m1 = new Mammal("Eduardo");
		System.out.println(m1);
	}
}
