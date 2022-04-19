package com.javaex.practice02;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int min;		
		
		System.out.println("숫자 3개를 입력해주세요");
		System.out.print("숫자1: ");
		int num1 = sc.nextInt(); //숫자1 입력
		min = num1; //min에 숫자1의 값 넣음 (다른 입력된 숫자가 없으므로 비교하지않고 값을 넣음)
		
		System.out.print("숫자2: ");
		int num2 = sc.nextInt(); //숫자2 입력
		if(min > num2) { //min 값과 num2를 비교해서 num2가 더 작으면 num2의 값을 min에 넣음
			min = num2;
		}
		
		System.out.print("숫자3: ");
		int num3 = sc.nextInt(); //숫자3 입력
		if(min > num3) { //min 값과 num3를 비교해서 num3가 더 작으면 num3의 값을 min에 넣음
			min = num3;
		}
		
		System.out.println("가장 작은수는 " + min + "입니다.");
		
		sc.close();
	}
}
