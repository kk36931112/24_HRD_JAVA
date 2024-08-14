package day07;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {

	public static void main(String[] args) {
		//데이터 소스: 키보드
		//데이터 목적지: 모니터
		// read()
		//InputStream 의  read() 메소드는 바이트 입력을 리턴하고
		//입력이 종료하면 (Ctrl+c나 Ctrl+D) -1을 리턴한다.
		try {
			int r = 0;
			int count = 0;
			
			while(true) {
				r= System.in.read();// 키보드 입력을 받자.
				//System.in: InputStream -1바이트 기반 스트림, 노드스트림.
				/*InputStream의 read()메소드는 바이트 입력을 리턴하고 
				  입력이 종료되면 (Ctrl+C나 Ctrl+D) -1을 리턴한다.				 
				 */
				count ++;
				
				if(r == 'X' || r=='X') {
					break;
				}
				System.out.println("r="+r);
				}
				System.out.println("*************");
				System.out.println(count+" bytes 읽음");
				System.out.println("*******");
				System.in.close();
			
			}catch(IOException e) {
					e.getMessage();
		}
	
	}

}
