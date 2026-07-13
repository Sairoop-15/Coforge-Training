package model;

public class Employee {
	private int empid;
	private String empname;
	private String email;
	private int salary;
	private int dno;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getSalry() {
		return salary;
	}

	public void setSalry(int salry) {
		this.salary = salry;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	@Override
	public String toString() {
	    return "<table border='1' class='table table-bordered'>"
	            + "<tr><th>Employee ID</th><td>" + empid + "</td></tr>"
	            + "<tr><th>Name</th><td>" + empname + "</td></tr>"
	            + "<tr><th>Email</th><td>" + email + "</td></tr>"
	            + "<tr><th>Salary</th><td>" + salary + "</td></tr>"
	            + "<tr><th>Department</th><td>" + dno + "</td></tr>"
	            + "</table>";
	}

	public Employee(int empid, String empname, String email, int salary, int dno) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.email = email;
		this.dno = dno;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
