package com.javaex.practice02;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사번(정수)를 입력해주세요.");
		System.out.print("사번: ");
		int num = sc.nextInt(); //사번 입력
		
		if(num < 0) { //num이 음수면 중단
			System.out.println("잘못 입력하셨습니다.");
		} else {
			switch (num % 3) { //num을 3으로 나눴을때의 나머지
				case 0:
					System.out.println("A팀입니다.");
					break;
				case 1:
					System.out.println("B팀입니다.");
					break;
				case 2:
					System.out.println("C팀입니다.");
					break;
			}
		}
		
		sc.close();
	}
}
