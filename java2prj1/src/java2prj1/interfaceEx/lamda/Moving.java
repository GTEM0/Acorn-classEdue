package java2prj1.interfaceEx.lamda;

public class Moving implements Comparable<Moving> {

	String name;
	String code;
	int power;
	@Override
	public String toString() {
		return "Moving [name=" + name + ", code=" + code + ", power=" + power + "]";
	}
	public Moving(String name, String code, int power) {
		super();
		this.name = name;
		this.code = code;
		this.power = power;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	
	public Moving() {
	
	}
	@Override
	public int compareTo(Moving o) {
		 
		return 0;
	}
	 
}
