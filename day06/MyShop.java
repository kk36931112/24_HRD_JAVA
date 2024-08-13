package day06;
import java.util.Scanner;
import java.util.ArrayList;

public class MyShop implements IShop {
	
	
	User[] users = new User[2];
	Product[] products = new Product[4];
	
	ArrayList<Product> cart = new ArrayList<Product>();
	Scanner scan = new Scanner(System.in);
	
	int selUser;
	String title;
	
	@Override
	public void setTitle(String title) {
		this.title = title;
		
	}
	/**
	 * 프로그램 메인 시작 메서드
	 */
	
	public void start() {
		System.out.println(title +" : 메인화면 - 계정 선택");
		System.out.println("========================");
		int i=0;
		//등록된 사용자 정보 출력
		for(User u : users) {
			System.out.printf("[%d]%s(%s)\n",i++,u.getName(),u.getPayType());
		}
		
		System.out.println("[x]종 료");
		System.out.print("선택 : ");
		String sel = scan.next();
		System.out.println("## "+sel+"선택 ##");
		//선택된 메뉴에 따라 처리
		switch(sel) {
		case "X":System.exit(0);break;
		default:
			selUser = Integer.parseInt(sel);
			productList();
		}
	}
	/**
	 * 상품 목록을 보고 상품을 선택해 장바구니에 넣는 메서드
	 */
	
	public void productList() {
	System.out.println(title+" : 상품 목록 - 상품 선택");
	System.out.println("=====================");
	int i =0;
	
//등록된 상품 정보 출력	
	for(Product p : products) {
		System.out.println("["+i+"]");
		p.printDetail();
		i++;
	}
	System.out.println("[h]메인화면");
	System.out.println("[c]체크아웃");
	System.out.println("선택 : ");
	String sel = scan.next();
	System.out.println("## "+sel+"선택 ##");
	
	// 선택한 메뉴에 따라 처리 
	switch(sel) {
	case "h" : start();break;
	case "c": checkOut();break;
	default:
		int psel = Integer.parseInt(sel);
		cart.add(products[psel]);
		productList();
	}
	}
	/**
	 * 결제 진행을 하는 체크아웃 처리 메서드
	 */
	public void checkOut() {
		System.out.println(title + " : 체크아웃");
		System.out.println("=====================");
		int total = 0;
		int i = 0;
		
		//장바구니에 등록한 상품 정보 출력
		for (Product p : cart) {
			System.out.printf("[%d]%s(%s)\n",i++,p.pname,p.price);
			total = total + p.price;
		}
		System.out.println("=====================");
		//선택한 사용자의 결제 방법 출력
		System.out.println("결제 방법: " + users[selUser].getPayType());
		
		// 합계 출력
		System.out.println("합계: "+total+" 원 입니다.");
		System.out.println("[p]이전 , [q]결제 완료");
		System.out.print("선택 : ");
		String sel = scan.next();

		// 선택된 메뉴에 따라 처리
		switch(sel) {
			case "q":
				System.out.println("## 결제가 완료 되었습니다. 종료합니다 ##");
				System.exit(0);break;
			case "p":productList();break;
			default: 
				checkOut();
		}		
	}
	
	
	
	@Override
	public void genUser() {
		User user1  = new User("홍길동",PayType.CARD);
		users[0] = user1;
		User user2 = new User("블로거",PayType.CASH);
		users[1] = user2;
	}

	@Override
	public void genProduct() {
		CellPhone cp = new CellPhone("갤럭시 노트5",1000000,"SKT");
		products[0] = cp;
		cp = new CellPhone("애플 아이폰 15",1000000,"애플");
		products[1] = cp;
		
		SmartTv stv = new SmartTv("삼성스마트Tv",2000000,"4K");
		products[2] = stv;
		stv = new SmartTv("LG Smart Tv",2500000,"Full HD");
		products[3] = stv;
		

	
		
	}
	
}
