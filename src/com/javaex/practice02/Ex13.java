package com.javaex.practice02;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double result; //결과 변수
		
		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자: ");
		double x = sc.nextDouble(); //숫자 입력
		
		if(x <= 0) { //x가 0이상인지 미만인지 확인 후 계산값을 result에 넣음
			result = x*x*x - 9*x + 2;
		} else {
			result = 7*x + 2;
		}
		
		System.out.println("계산결과는 " + result + "입니다.");
		
		sc.close();
	}
}
