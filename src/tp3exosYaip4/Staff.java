package tp3exosYaip4;

public class Staff extends Person{
	private String school;
	private double pay;
	
	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}
	
	@Override
	public String toString() {
		return "Staff[" + super.toString() + "],school=" + school + ",pay=" + pay + "]";
	}
	
	public static void main(String[] args) {
		Staff s1 = new Staff("Mickaël Martin-Nevot", "Furkhan Kebab", "IUT Aix", 999999.99);
		System.out.println(s1.getSchool());
		s1.setSchool("IUT Aix-en-Provence");
		System.out.println(s1.getPay());
		s1.setPay(999999999.99);
		System.out.println(s1);
	}
}
