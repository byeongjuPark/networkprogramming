package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];

	public int[] personCount() {
		int count[] = new int[2]; // [0]Student count, [1]Employee count
		for (int i = 0; i < s.length; i++) {
			if (s[i] == null) {
				count[0] = i;
				break;
			}
		}
		for (int i = 0; i < e.length; i++) {
			if (e[i] == null) {
				count[1] = i;
				break;
			}
		}
		//count[0] = s.length;
		//count[1] = e.length;

		return count;
	}

	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		for (int i = 0; i < s.length; i++) {
			if (s[i].getName() == null) {
				s[i].setName(name);
				s[i].setAge(age);
				s[i].setHeight(height);
				s[i].setWeight(weight);
				s[i].setGrade(grade);
				s[i].setMajor(major);
				break;
			}
		}
	}

	public Student[] printSudent() {
		return s;
	}

	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		for (int i = 0; i < e.length; i++) {
			if (e[i].getName() == null) {
				e[i].setName(name);
				e[i].setAge(age);
				e[i].setHeight(height);
				e[i].setWeight(weight);
				e[i].setSalary(salary);
				e[i].setDept(dept);
				break;
			}
		}

	}
	public Employee[] printEmployee() {
		return e;
		
	}
}