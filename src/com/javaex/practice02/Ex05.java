package com.javaex.practice02;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키: ");
		int height = sc.nextInt(); //키 입력
		
		System.out.print("몸무게: ");
		int weight = sc.nextInt(); //몸무게 입력
		
		double standard_w = (height - 100) * 0.9; //평균체중 계산
		
		//평균 체중과 입력한 체중 비교
		if(standard_w > weight) {
			System.out.println("저체중 입니다.");
		} else if(standard_w == weight) {
			System.out.println("표준 입니다.");
		} else {
			System.out.println("과체중 입니다.");
		}
		
		System.out.println("표준체중: " + standard_w);
		
		sc.close();
	}
}
