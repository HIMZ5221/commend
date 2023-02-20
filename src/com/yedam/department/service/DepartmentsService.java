package com.yedam.department.service;

import java.util.List;
import java.util.Scanner;

public class DepartmentsService {
	
	Scanner sc = new Scanner(System.in);
	
	//모든 부서 조회
	public List<Departments> getDepartmentsList(){
		List<Departments> list = DepartmentsDAO.getInstance().getDepartmentsList();
		System.out.println("=====================");
		for(int i = 0; i<list.size(); i++) {
			System.out.println("부서 ID : " + list.get(i).getDepartmentId());
			System.out.println("부서 이름 : " + list.get(i).getDepartmentName());
			System.out.println("관리자 번호 : " + list.get(i).getManagerId());
			System.out.println("지역 번호 : " + list.get(i).getLocationId());
			System.out.println("============================");
		}
		return list;
	}
	//부서 조회
	public void getDepartments() {
		DepartmentsService emp = new DepartmentsService();
		System.out.println("부서 번호>");
		int empNo = Integer.parseInt(sc.nextLine());
		Departments empDepartments = DepartmentsDAO.getInstance().getDepartment();
		if(emp == null) {
			System.out.println("조회된 결과 없음");
		}else {
			System.out.println("부서 번호 : "+ emp.getDepartmentId());
			System.out.println("부서 이름 : "+ emp.getDepartmentName());
			System.out.println("관리자 번호 : "+ emp.getManagerId());
			System.out.println("지역 번호 : "+ emp.getLocationId());
		}
		System.out.println("==========================");
	}
	
	
	
	//등록
	public void insertEmp() {
		DepartmentsService emp = new DepartmentsService();
		System.out.println("===========부서 생성===========");
		System.out.println("부서 번호>");
		int empNo = Integer.parseInt(sc.nextLine());
		System.out.println("부서 이름>");
		String empName = sc.nextLine();
		System.out.println("관리자 번호>");
		int mgrNo = Integer.parseInt(sc.nextLine());
		System.out.println("지역 번호>");
		int locNo = Integer.parseInt(sc.nextLine());
		
		emp.set
	}
	//수정
	//삭제
	
}
