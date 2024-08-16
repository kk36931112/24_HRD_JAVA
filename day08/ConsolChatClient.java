package day08;
import day07.ConsolChatServer;


import java.io.*;
import java.net.*;
public class ConsolChatClient implements Runnable{
	// Socket 클래스
	//DataIn,Out 객체
	Socket sock = null;
	public ConsolChatClient() {
		try {
			sock = new Socket("127.0.0.1", 9999);
			System.out.println("서버와 연결 성공~");
			 BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
			 PrintWriter pout = new PrintWriter(sock.getOutputStream(),true);
			 
			 //서버가 보내주는 메시지를 계속 듣는 스레드 동작
			 Thread thread = new Thread(this);
			 thread.start();
			 /////////////////////////////////////////////////////
			 String msg = "";/////////////////
			 while((msg=key.readLine())!=null) {
				 pout.println(msg); 
					 			 
			 }
		}catch(IOException e) {
			
		}
		
	}
	
	public static void main(String[] args) {
		new ConsolChatClient();

	}
	
	@Override
	public void run() {
		try {
			InputStream is = sock.getInputStream();
			BufferedReader br=new BufferedReader(new InputStreamReader(is));
			String serverMsg="";
			while(true) {
				serverMsg=br.readLine();
				System.out.println("From Server : "+serverMsg);
			}
		}catch (Exception e) {
			System.out.println("예외: "+e.getMessage());
		}
		
	}

}
