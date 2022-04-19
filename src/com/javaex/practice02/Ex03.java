package com.javaex.practice02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		age = sc.nextInt();
		
		if(age > 20) {
			System.out.println("\"1번그룹\"");
		} else {
			System.out.println("\"2번그룹\"");
		}
		System.out.println("입니다.");
		
		sc.close();
	}
}

/*
 * 15 -> "2번그룹" 입니다.
 * 19 -> "2번그룹" 입니다.
 * 20 -> "2번그룹" 입니다.
 * 21 -> "1번그룹" 입니다.
 * 100 -> "1번그룹" 입니다.
 */
