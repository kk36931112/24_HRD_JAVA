package day08;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.Executors;

import org.json.JSONObject;

import java.util.concurrent.ExecutorService;



public class ProductServer {
    private ServerSocket serverSocket;
    private ExecutorService threadPool;
    private List<Product> products;

    public void start() throws IOException {
        serverSocket = new ServerSocket(50001);
        threadPool = Executors.newFixedThreadPool(100);
        products = new Vector<>();
        System.out.println("[서버] 시작됨");

        while (true) {
            // 연결 수락
            Socket socket = serverSocket.accept();
            // 요청 처리용 SocketClient 생성
            Runnable sc = (Runnable) new SocketClient(socket);
            // 추가: SocketClient를 쓰레드 풀에서 실행하도록 해야 함
            threadPool.execute(sc);
        }
    } // start()--------------

    // 메소드: 서버 종료
    public void stop() {
        try {
            serverSocket.close();
            threadPool.shutdownNow();
            System.out.println("[서버] 종료됨");
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    } // stop()--------------

    // 중첩 클래스로 정의하기
    class SocketClient  {
      Socket socket;
      DataInputStream dis;
      DataOutputStream dos;
      
      public SocketClient(Socket socket)throws IOException{
    	  this.socket = socket;
    	  this.dis = new DataInputStream(socket.getInputStream());
    	  this.dos = new DataOutputStream(socket.getOutputStream());
    	  receive();
        }
      //요청받기
      public void receive() throws IOException {
    	  while(true) {
    		  String msg =dis.readUTF();
    		  JSONObject request = new JSONObject(msg);
    		  
    		  int menu = request.getInt("menu");
    		  
    		  switch(menu) {
    		  case 1:
    			  break;
    		  case 2:
    			  break;
    		  case 3:
    			  break;
    		  case 4:
    			  break;
    		  }
    		  
    	  }
    		 
      }//receive(------------------
      
    }//SocketClie------------
    
    
}
