package day05;

public class Staff extends Person {

	private String Id;
	private String dept;
		// id
		// private String dept; 담당 부서
	public Staff(String Id, String dept, String name, int age) {
		super(name, age);
		this.Id = Id;
		this.dept = dept;
	}
	
	public String getid() {
		return Id;
	}
	public void setid(String id) {
		this.Id = Id;
	}
	public String getdept() {
		return dept;
	}
	public void setdept(String dept) {
		this.dept = dept;
	}

	@Override
	public String personInfo() {
		String info = super.personInfo();
		info += "\n사원ID: "+ Id +"\n담당부서: "+dept;
		return info;
	}
	

}
