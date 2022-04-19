package com.javaex.practice02;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호: ");
		String giho = sc.nextLine(); //기호 입력
		
		System.out.print("숫자1: ");
		double num1 = sc.nextDouble(); //숫자1 입력
		
		System.out.print("숫자2: ");
		double num2 = sc.nextDouble(); //숫자2 입력
		
		switch(giho) { //기호별로 계산
			case "+":
				System.out.println("결과는: " + (num1+num2));
				break;
			case "-":
				System.out.println("결과는: " + (num1-num2));	
				break;
			case "*":
				System.out.println("결과는: " + (num1*num2));
				break;
			case "/":
				if(num2 != 0) { //분모(num2)가 0인지 확인하고 0이면 중단
					System.out.println("결과는: " + (num1/num2));
					break;
				} else {
					System.out.println("계살할 수 없습니다.");
					break;
				}
			default: // "+-*/" 외의 기호가 입력되면 중단
				System.out.println("계산할 수 없는 기호입니다.");
				break;
		}
		
		sc.close();
	}
}
