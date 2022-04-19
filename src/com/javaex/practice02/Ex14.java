package com.javaex.practice02;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수익을 입력해 주세요.");
		System.out.print("금익: ");
		double money = sc.nextDouble(); //금익 입력
		
		double tax = 0; //소득세 변수
		
		if(money >= 0 && money <= 1000) { //0이상 1000이하
			tax = 0.09 * money;
			System.out.println("소득세는 " + tax + " 입니다.");
		} else if(money > 1000 && money <= 4000) { //1000초과 4000이하
			tax = 1000*0.09 + 0.18*(money-1000);
			System.out.println("소득세는 " + tax + " 입니다.");
		} else if(money > 4000 && money < 8000) { //4000초과 8000미만
			tax = 1000*0.09 + 3000*0.18 + 0.27*(money-4000);
			System.out.println("소득세는 " + tax + " 입니다.");
		} else if (money >= 8000) { //8000 이상
			tax = 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(money-8000);
			System.out.println("소득세는 " + tax + " 입니다.");
		} else { //음수
			System.out.println("잘못 입력했습니다.");
		}
		
		sc.close();
	}
}
