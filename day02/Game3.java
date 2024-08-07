package day02;
import java.util.Random;
import java.util.Scanner;
public class Game3 {

	public static void main(String[] args) {
		// 문제2: continue문: 369 게임하기
		// 1부터 10까지의 정수 출력 중 3,4,9 일때 박수 소리를 출력하는 프로그램 작성하기
		// -------------------------------
		//실행결과
		//-------------------------
		//1 2 짝 4 5 짝 7 8 짝 10
		for (int i = 1; i <= 10; i++) { // for 문에 의해 1부터 10까지의 반복
			if (i==3 || i == 6 || i == 9) {// 내부 조건식에 의해 (i가 3,6,9인 경우)
				System.out.println(" 짝");//박수소리 출력 후 다음 반복으로 넘어감
				continue;
			}
			System.out.println(" "+i);//정수를 출력하기
			}
		}
	}