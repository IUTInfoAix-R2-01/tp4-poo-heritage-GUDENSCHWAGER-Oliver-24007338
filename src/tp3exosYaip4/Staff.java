package tp3exosYaip4;

public class Staff extends Person{
	private String school;
	private String pay;
	
	public Staff(String name, String address, String school, String pay) {
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

	public String getPay() {
		return pay;
	}

	@Override
	public String toString() {
		return "Staff[" + super.toString() + "],school=" + school + ",pay=" + pay + "]";
	}

	public void setPay(String pay) {
		this.pay = pay;
	}
}
