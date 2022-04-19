package com.javaex.practice02;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자2개를 입력해주세요");
		System.out.print("숫자1: ");
		int num1 = sc.nextInt(); //숫자1 입력
		
		System.out.print("숫자2: ");
		int num2 = sc.nextInt(); //숫자2 입력
		
		//숫자1과 숫자2를 비교
		if(num1 >= num2) {
			System.out.println("큰수: " + num1 + "\t\t작은수: " + num2 + "입니다.");
		} else if(num1 < num2) {
			System.out.println("큰수: " + num2 + "\t\t작은수: " + num1 + "입니다.");
		}
		
		sc.close();
	}
}
