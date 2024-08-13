package day05;

public class Student extends Person{
	
	//ID, 학급 변수 cName 추가
	private String id;
	private String cName;
	
	//생성자..
	public Student(String id , String cName, String name, int age) {
		super(name, age);
		this.id = id;
		this.cName = cName;
	}


	public String getId() {
		return id;
	}	
	//getter, setter
	
	public void setid(String id) {
		this.id = id;
	}
	
	
	public String getcName() {
		return cName;
	}	
	
	public void setcName(String cName) {
		this.cName = cName;
	}


	@Override
	public String personInfo() {
		String info = super.personInfo();
		info += "\n사원ID: "+ id +"\n담당부서: "+cName;
		return info;
	}


	
	
	//메소드 오버라이딩...

}
