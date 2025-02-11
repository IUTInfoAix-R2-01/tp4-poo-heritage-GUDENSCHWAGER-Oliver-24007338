package tp3exosYaip5;

public class Circle {
	private double radius;
	private String color;
	
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}

	public static void main(String[] args) {
		Circle c1 = new Circle(2, "red");
		System.out.println(c1);
	}
}
