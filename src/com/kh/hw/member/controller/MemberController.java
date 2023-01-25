package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	
	private Member[] m = new Member[SIZE];
	public static int SIZE = 10;
	
	public int sxistMemberNum() {
		return m.length;
		
	}
	public boolean checkId(String inputId) {
		//아이디 중복 확인 > 중복시 true
		for(int i = 0; i<m.length; i++) {
			if(m[i].getId().equals(inputId)) {
				return true;
			}
		}
		return false;
	}
	public void insertMember(String id, String name, String password, String email, String gender, int age) {
		for(int i = 0; i<m.length; i++) {
			if(m[i]==null) {
				m[i].setId(id);
				m[i].setName(name);
				m[i].setPassword(password);
				m[i].setEmail(email);
				m[i].setGender(gender.charAt(0));
				m[i].setAge(age);
				break;
			}
		}
	}
	public String searchId(String id) {
		String result="";
		for(int i = 0; i<m.length; i++) {
			if(m[i].getId().equals(id)) {
				result = m[i].getId();
			}else if(m[m.length-1] != null || m[m.length-1] == null) {
				System.out.println("찾는 아이디 없음");
			} 
		}
		return result;
	}
	public Member searchName(String name) {
		Member result= new Member();
		for(int i = 0; i<m.length; i++) {
			if(m[i].getName().equals(name)) {
				result = m[i];
			}else if(m[m.length-1] != null || m[m.length-1] == null) {
				System.out.println("찾는 이름 없음");
			} 
		}
		return result;
		
	}
	public Member[] searchEmial(String email) {
		return m;
	}
	public boolean updatePassword(String id, String password) {
		return true;
	}
	public boolean updateName(String id, String name) {
		return true;
	}
	public boolean updateEmil(String id, String email) {
		return true;
	}
	public boolean delete(String id) {
		return true;
	}
	public void delete() {
		
	}
	public Member[] printAll() {
		return m;
	}
	
}
