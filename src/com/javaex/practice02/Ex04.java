package com.javaex.practice02;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		int age = sc.nextInt(); //나이 입력받음
		
		if(age >= 19 && age < 65) { //age가 19이상이고 65미만인지 확인
			System.out.println("1번그룹 입니다.");
		} else {
			System.out.println("2번그룹 입니다.");
		}
		
		sc.close();
	}
}
