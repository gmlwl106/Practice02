package com.javaex.practice02;

public class Ex01 {
	public static void main(String[] args) {
		
		int age = 15;
		
		//age가 0살 초과이고 18살 미만 이면
		//if(0 < age < 18) { <- 2개의 조건식일때는 &&나 ||를 이용해서 작성해야함
		if(0 < age && age < 18) {
			System.out.println("청소년 입니다.");
		}
	}
}
