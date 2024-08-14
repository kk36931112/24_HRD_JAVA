package day07;
import java.io.IOException;
import java.net.InetAddress;
public class ImetAddressExam {

	public static void main(String[] args) {
		
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 IP주소: " + local);
			
			InetAddress[] locals = InetAddress.getAllByName("www.dju.kr");
			for(InetAddress ia:locals) {
				System.out.println("www.dju.kr IP주소: "+ ia.getHostAddress());
			}
			
		}catch(IOException en) {
			
		}

	}

}
