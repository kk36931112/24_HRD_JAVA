package day06;

//쇼핑몰 상품 정의를 위한 추상클래스,
// 다양한 상품 종류를 지원하기 위해 기본 정보

public abstract class Product {

	String pname;
	int price;
	
	public void printDetail() { // 템플릿 메소드 패턴
		System.out.println("상품명:"+pname+", ");
		System.out.println("가격:"+price+", ");
		printExtra();
	}
	//추상 메소드
	public abstract void printExtra();

}
