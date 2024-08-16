package day08;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ProductClient {
	private Socket socket;
	private DataInputStream dis;
	private DataOutputStream dos;
	private Scanner scanner;
	//메소드 : 서버 연결
	public void start() throws IOException {
		//서버 연결
		socket = new Socket("localhost", 50001);
		dis = new DataInputStream(socket.getInputStream());
		dos = new DataOutputStream(socket.getOutputStream());
		System.out.println("[클라이언트] 서버에 연결됨");
		scanner = new Scanner(System.in);
		//상품 목록 보여주기
		list();
	}
	
	
	private void list() {
		// TODO Auto-generated method stub
		
	}


	//메소드: 메뉴
	public void menu() throws IOException {
		System.out.println();
		System.out.println("-------------------------------------------------");
		System.out.println("메뉴: 1.Create | 2. Update | 3.Delete | 4.Exit");
		System.out.print("선택:");
		String menuNo = scanner.nextLine();
		System.out.println();
		switch (menuNo) {
		case "1":
			break;
		case "2":
			break;
		case "3":
			break;
		case "4":
			break;
			
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
