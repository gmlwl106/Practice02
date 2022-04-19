package com.javaex.practice02;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번재 숫자: ");
		int num1 = sc.nextInt(); //숫자1 입력
		
		System.out.print("두번째 숫자: ");
		int num2 = sc.nextInt(); //숫자2 입력
		
		//숫자1과 숫자2를 비교해서 더 큰 숫자를 작은 숫자로 나눠서 몫과 나머지를 구함
		if(num1 >= num2) {
			System.out.println("몫: " + (num1/num2));
			System.out.println("나머지: " + (num1%num2));
		} else {
			System.out.println("몫: " + (num2/num1));
			System.out.println("나머지: " + (num2%num1));
		}
		
		sc.close();
	}
}
