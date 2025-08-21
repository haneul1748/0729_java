package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	private Student [] s = new Student[SIZE];
	private Employee [] e = new Employee[SIZE2];
	
	public static final int SIZE = 3;
	public static final int SIZE2 = 10;
	
	public int[] personCount() {
		int[] counts = new int[2];
		
		for(int i=0; i<s.length; i++) {
		if(s[i] != null) 
			counts[0]++;
		}

		for(int i=0; i<e.length; i++) {
			if(e[i] != null)
				counts[0]++;
		}
		return counts;
		
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		
	}
	public Student[] printStudent() {
		
	}
	public void isertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		
	}
	public Employee[] printEmployee() {
		
	}
}
