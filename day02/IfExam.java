package day02;
import java.util.Scanner;
public class IfExam {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int jumsu =50;
		
		System.out.print("점수를 입력하세요:");
		
		jumsu = scan.nextInt();
		String hakjum = "";
		if(jumsu >= 95) {
			hakjum = "A+";
		}else if(jumsu >=90){
		   hakjum = "A0";
		}else if(jumsu >=85){
		   hakjum = "B+";
		}else if(jumsu >=80){
		   hakjum = "B0";
		}else if(jumsu >=75){
		   hakjum = "C+";
		}else if(jumsu >=70){
		   hakjum = "C0";
		}else if(jumsu >=65){
		   hakjum = "D+";
		}else if(jumsu >=60){
		   hakjum = "D0";
		}else {
			hakjum = "F";
		}
		System.out.println("당신의 학점은: " + hakjum + "입니다.");
		
		
		

	}

}
