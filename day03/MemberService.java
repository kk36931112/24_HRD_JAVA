package day03;

public class MemberService {

	
	
	//로그인 메소드 정의
	public boolean login(String id, String password) {
	boolean result;
	if(id.equals("hong")&&password.equals("12345")) {
		result = true;
	}else {
		result = false;
	}
	return result;
	}
	//로그 아웃 메소드 정의
	public void logout(String id) {
	System.out.println(id+"님 로그 아웃 되었습니다.");
	}

}

