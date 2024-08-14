package day07;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;


public class ConsolChatServer implements Runnable {
	
    private static ServerSocket serverSocket = null;
    static Socket socket = null;
    
    public ConsolChatServer() throws Exception {
    	
    serverSocket = new ServerSocket(50001);
    System.out.println("[서버] 시작됨");
    socket = serverSocket.accept();
    System.out.println("클라이언트 접속 성공");
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    
    PrintWriter pout = new PrintWriter(socket.getOutputStream(),true);
    
    Thread tr =new Thread(this);
    tr.start();
    String msg="";
    
    while((msg=key.readLine())!=null) {
    	pout.println(msg); 
    }
}
    
    public static void main(String[] args) throws IOException {
   
    	try {
    	new ConsolChatServer();
    	}catch (Exception e) {
    		e.printStackTrace();
    	}
    }
	@Override
	public void run() {
		try {
			InputStream is = socket.getInputStream();
			BufferedReader br=new BufferedReader(new InputStreamReader(is));
			String clientMsg="";
			while(true) {
				clientMsg=br.readLine();
				System.out.println("From Client>>"+clientMsg);
			}
		}catch (Exception e) {
			System.out.println("예외: "+e.getMessage());
		}
		
	}
}


