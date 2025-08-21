package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.Cafe;

public class Run {

	// 캡슐화 (encapsulation)
	// 속성(데이터)과 해당 데이터를 조작하는 행동(메소드)를 하나의 단위로 묶는 것
	// 정보은닉(information hiding)
	
	// 접근 제한자 (예약어) 반환형 메소드식별자(매개변수) {	 }
	public static void main(String[] args) {
		
		// 변수 선언		대입연산자		객체 생성 == 메모리에 적재
		Cafe cf = new Cafe();
		
		/*
		cf.name = "KH카페";
		System.out.println(cf.name);
		cf.signatureMenu = "KH커피";
		cf.signatureMenuPrice = -500;
		System.out.println(cf.signatureMenu);
		System.out.println(cf.signatureMenuPrice);
		*/
		
		//필드가 보이지 않아서(외부에서 접근이 불가능해서) 오류 발생!
		// 접근제한자를 public에서 private으로 변경했기 때문에 직접 접근이 불가능
		// 직접 접근이 불가능하기 때문에 간접적으로 접근할 수 있는 방법을 만들어주어야함
		// Cafe라는 클래스에 getter / setter라는 메소드 만들기
		//cf.signatureMenuPrice = -500;
		
		// *** 객체의 내부적 관점 / 외부적 관점
		//cf.dishWash();
		//cf.cleaning();
		//cf.windowWash();
		// 메소드 호출 부에서는 오로지 값만 넘길 수 있음
		cf.setsignatureMenuPrice(5000);
		cf.setName("KH카페");
		cf.setAddress("서울시 중구 남대문로 120 2층");
		// System.out.println(cf.name);
		
		String cfName = cf.getName();
		System.out.println(cfName);
		
		String cfAddress = cf.getAddress();
		System.out.println(cfAddress);
		
		int price = cf.getSignatureMenuPrice();
		System.out.println(price);
		
		String info = cf.info();
		System.out.println(info);
	}

}
