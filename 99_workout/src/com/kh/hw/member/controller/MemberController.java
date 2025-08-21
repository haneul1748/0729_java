package com.kh.hw.member.controller;

import com.kh.hw.member.vo.Member;

public class MemberController {
	private Member[] m = new Member[SIZE];
	public static final int SIZE = 10;

	// static 블럭 정적 초기화
	static {
		// System.out.println("호잇");
	}

	// 초기화 블럭
	{
		// System.out.println("3등");
		m[0] = new Member("admin", "관리자", "ad1234", "admin@kh.com", 'M', 100);
	}

	public MemberController() {
		// System.out.println("4등");
		// 기본 생성자 안에 넣나 초기화 블럭에 넣나 똑같다.
		// m[0] = new Member("admin", "관리자", "ad1234", "admin@kh.com", 'M', 100);
	}
	
	public Member[] getM() {
		return m;
	}

	public int existMemberNum() {

		int count = 0;

		// if(m[0] != null) count++;
		// if(m[1] != null) count++;
		// ...
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {
				count++;
			}
		}

		return count;

	}

	public boolean checkId(String inputId) {

		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getId().equals(inputId)) {
				return true;
			}
		}

		return false;
	}

	public void insertMember(String id, String name, String password, char gender, String email, int age) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] == null) {
				m[i] = new Member(id, name, password, email, gender, age);
				break;
			}
		}

	}

	public Member searchId(String id) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getId().equals(id)) {
				return m[i];
			}
		}
		return null;
	}

	public Member[] searchName(String name) {
		int count = existMemberNum();
		Member[] members = new Member[count];
		int index = 0;

		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getName().equals(name)) {
				members[index++] = m[i];
			}
		}
		return members;

	}

	public void searchEamil(String email) {

	}

	public boolean updatePassword(String userId, String userPw, String newPw) {

		// 전달 받은 3개의 값을 가지고
		// 비밀번호를 바꿔주거나 바꿔주지않거나

		// 배열의 첫번째요소 아이디값 비교해야지

		for (int i = 0; i < m.length; i++) {
			if (m[0] != null && m[0].getId().equals(userId) && m[0].getPassword().equals(userPw)) {
				m[0].setPassword(newPw);
				return true;
			}
		} return false;
	}

	public int deleteMember(String userId, String userPw) {
		
		for(int i=0; i<m.length; i++) {
			
			if(m[i] != null && m[i].getId().equals(userId) &&
				m[i].getPassword().equals(userPw)) {
					m[i] = null;
					return 1;
			}
		}
		return 0;
	}
}
