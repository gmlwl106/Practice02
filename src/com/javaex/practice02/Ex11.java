package com.javaex.practice02;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		System.out.println("알파벳: ");
		String alphabet = sc.nextLine(); //알파벳 입력
		
		switch(alphabet) {
			case "a" :
				System.out.println("모음입니다.");
				break;
			case "e" :
				System.out.println("모음입니다.");
				break;
			case "i" :
				System.out.println("모음입니다.");
				break;
			case "o" :
				System.out.println("모음입니다.");
				break;
			case "u" :
				System.out.println("모음입니다.");
				break;
			default :
				System.out.println("자음입니다.");
				break;
		} //모음인 경우일때와 자음일때를 나눠서 알려줌 (자음이 많기때문에 자음은 디폴트로)
		
		sc.close();
	}
}
