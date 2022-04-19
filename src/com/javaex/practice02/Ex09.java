package com.javaex.practice02;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		int num2 = sc.nextInt();
		
		if(num1 == 0 || num2 == 0) { //num1와 num2 중 하나가 0이면 중단
			System.out.println("0은 입력할 수 없습니다.");
		} else {
			if(num1 > num2) { //num1이 더 큰 경우
				if(num1 % num2 == 0) {
					System.out.println(num2 + "는(은) " + num1 + " 의 약수입니다.");
				} else if(num1 % num2 != 0) {
					System.out.println(num2 + "는(은) " + num1 + " 의 약수가 아닙니다.");
				}
			} else if(num1 < num2) { //num2가 더 큰 경우
				if(num2 % num1 == 0) {
					System.out.println(num1 + "는(은) " + num2 + " 의 약수입니다.");
				} else if(num2 % num1 != 0) {
					System.out.println(num1 + "는(은) " + num2 + " 의 약수가 아닙니다.");
				}
			}
		}
		
		
		sc.close();
	}
}
