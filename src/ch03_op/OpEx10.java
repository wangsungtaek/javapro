package ch03_op;

import java.util.Scanner;

public class OpEx10 {

	public static void main(String[] args) {
		
		System.out.println("점수를 입력하세요 >>");
		
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		String result = (score >= 60)? "합격" : "불학격";
		System.out.println(score + "점은" + result + "입니다.");
		System.out.println(score + "점은" + ((score % 2 == 0) ? "짝수" : "홀수") + "입니다.");
		
		result = (score % 2 == 1) ? "홀수" : (score >0) ? "짝수" :"0";
		System.out.println(score + "점은" + result + "입니다.");
		
		String r;
		if(score > 0 ) {
			r = "합격";
		} else {
			r = "불합격";
		}
		
		System.out.println(r);
		
	}
}
