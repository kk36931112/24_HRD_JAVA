package day03;

public class Member {

	String name;
	String id;
	String password;
	int age;

	//기본 생성자
	public Member() {
	}

	//입자 생성자
	public Member(String name, String id) {
	this.name = name;
	this.id = id;
	}
	//메소드 정의
	public boolean login(String id, String password) {
	boolean result;
	if(id.equals("hong")&& password.equals("12345")) {
		result = true;
	}else{
		result =false;
	}
	return result;
	}
	
	}


