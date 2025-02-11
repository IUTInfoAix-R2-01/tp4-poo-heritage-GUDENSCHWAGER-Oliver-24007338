package tp3exosYaip5;

public class Cylinder {
	private Circle base;
	private double height;
	
	public Cylinder(double radius, String color, double height) {
	      base = new Circle(radius, color);
	      this.height = height;
	}

	@Override
	public String toString() {
		return "Cylinder [base=" + base + ", height=" + height + "]";
	}
	
	public static void main(String[] args) {
		Cylinder cy1 = new Cylinder(2, "red", 6);
		System.out.println(cy1);
	}
}