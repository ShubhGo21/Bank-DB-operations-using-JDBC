package bankDB;

public class Bank {
	private int accno,bal;
	private String name,city;
	
	public Bank() {
	
	accno=1;
	bal=50000;
	name="shubh";
	city="pune";
	}

	public Bank(int accno, int bal, String name, String city) {
		super();
		this.accno = accno;
		this.bal = bal;
		this.name = name;
		this.city = city;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		this.bal = bal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Bank [accno=" + accno + ", bal=" + bal + ", name=" + name + ", city=" + city + "]";
	}
	
	
	
	
}
