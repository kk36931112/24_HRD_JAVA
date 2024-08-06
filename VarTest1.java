package day01;
import java.util.Scanner;

public class VarTest1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		
		
		//  정수 변수
		
		double x;
		// 변수 초기화
		x = 5;
		System.out.print("첫번째 정수 입력:");
		
		x= scan.nextDouble();
		
		
		
		double y = 8;
		System.out.print("두번째 정수 입력:");
		
		y= scan.nextDouble();
		
		
		
		double result = x + y;
		
		System.out.println(result);
		
		// 2. 실수 변수
		// float(4byte), double(8byte)
		double height = 155.7;
		float weight = 45.5f;
		
		System.out.print("키를 입력하세요: 단 실수형으로 입력하기:");
		height = scan.nextDouble();
		System.out.print("몸무게를 입력하세요: ");
		weight = scan.nextFloat();
		
		
		
		// 3. 문자형 변수
		//char
		
		char blood ='A';
		
		// 4. 문자열 변수
		//String
		String name = "염희균";
		
		System.out.print("이름을 입력하세요:");
		name = scan.next();
		
		System.out.print("키:"+height+"\n몸무게:"+weight+"\n");
		
		System.out.println("혈액형:"+ blood +"형 입니다.");
		
		System.out.println("이름:"+ name +" 입니다.");
		
		// 5. 논리형 변수
		
		// boolean형
		boolean stop = true;
		
		if (stop == true) {
			System.out.println("중지합니다.");
			
		}else {
			System.out.println("시작합니다.");
		}
	}

}
