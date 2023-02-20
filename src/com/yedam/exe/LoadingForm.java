package com.yedam.exe;

import java.util.Scanner;

public class LoadingForm {
	 
	Scanner sc = new Scanner(System.in);
	
	//run 메소드 안에 매뉴 선택 용도
	int selectNo = 0;
	
	public LoadingForm() {
		run();
	}
	
	private void run() {
		
		
		while(selectNo !=3) {
			
			menu();
			switch (selectNo) {
			case 1:
				departments();
				//부서 관련 프로그램 메뉴 출력.
				break;
			case 2:
				//사원 관련 프로그램 메뉴 출력.
				break;
			case 3:
				
				break;
		
			}
			
			
			
			
			
		}
	}
	
	//메뉴 선택 출력
	private void menu() {
		System.out.println("☆★☆★☆★☆★또치 회사프로그램☆★☆★☆★☆★");
		System.out.println("1. 부서       2. 사원     3. 종료");
		System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
		System.out.println("입력>");
		selectNo = Integer.parseInt(sc.nextLine());
		
		
	}
	
	private void departments() {
		
		int departmentMenu = 0;
		
		while(departmentMenu != 6) {
		//1. 부서관련 프로그램 = 모든 부서 조회, 한 부서 조회, 부서 삭제, 수정, 등록
		System.out.println("==================================================");
		System.out.println("1. 모든 부서 조회 2. 부서 조회 3. 삭제 4. 수정 5. 등록 6.종료");
		System.out.println("==================================================");
		System.out.println("입력>");
		departmentMenu = Integer.parseInt(sc.nextLine());
		
		switch (departmentMenu) {
			case 1:
				
				break;
	
			case 2:
				
				break;
				
			case 3:
				
				break;
				
			case 4:
				
				break;
				
			case 5:
				
				break;
				
			}
		}
	}
	
	
	
	
	
	
	
	
	
}
