package day04;

public class Person {

	
	// 객체 모델링 (클래스 멤버)
	
	// 속성 : has -a
	int age;
	String name;
	char gender; // 'F','M'
	String tel;
	
	
	
	// 기본 생성자
	public Person() {
		
	}
	
	
	
	// 메소드 getInfo()
	void getInfo() {
		System.out.println(name +"님 정보-----");
		System.out.println("나이: " + age );
		System.out.println("성별: " + gender );
		System.out.println("전화번호: " + tel );
		System.out.println("-------------------");
	}
	
	
	}
	



	
	
	
	
	
	
	
	

