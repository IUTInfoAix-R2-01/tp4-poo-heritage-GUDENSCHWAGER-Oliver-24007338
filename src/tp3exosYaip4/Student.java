package tp3exosYaip4;

public class Student extends Person {
	private String program;
	private int year;
	private double fee;
	
	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student[" + super.toString() + ",program=" + program + ",year=" + year + ",fee=" + fee + "]";
	}
	
	public static void main(String[] args) {
		Student e1 = new Student("Enzo", "Rognac", "IUT", 0, 999999.99);
		System.out.println(e1.getProgram());
		e1.setProgram("BUT Info");
		System.out.println(e1.getYear());
		e1.setYear(1);
		System.out.println(e1.getFee());
		e1.setFee(999998.99);
		System.out.println(e1);
	}
}
