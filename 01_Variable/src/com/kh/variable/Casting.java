package com.kh.variable;

public class Casting {
	/*
	 *  Type Casting(자료형 변환) : 자료형을 바꾸는 개념
	 * 
	 *  ★☆★☆★☆★☆★☆ 매우 중요 ★☆★☆★☆★☆★☆★☆★
	 * 
	 * 우리가 과정 끝날때 까지 까먹으면 큰일나는!!!
	 * 자바에서 값을 처리하는 규칙
	 * 
	 * 1. =(대입 연산자)를 기준으로 왼쪽/ 오른쪽 같은 자료형이어야 함.
	 *	=> 같은 자료형에 해당하는 리터럴값만 대입할 수 있음
	 *	=>자료형이 다를 경우 ? == 값을 바꿔서 대입해야 함.
	 *
	 *  2. 같은 자료형들끼리 연산이 가능함
	 *  => 자료형이 다른데 연산이 하고싶다?? 둘 중 하나를 "형변환"해서 나머지 하나의 동일하게 맞춤
	 *  
	 *  3. 연산의 결과물도 동일한 자료형이어야 한다.
	 *   => 1 + 1 = 2(정수), 1.1 + 1.1(실수)
	 *   
	 *   [ 표현법 ] (바꾸고싶은자료형)
	 *   형변환연산자 / cast연산자
	 * 
	 *	형 변환의 종류
	 *
	 * 1. 사용중변환(promotion) : 사용으로 형변환이 진행됨
	 *
	 * 2. 강제형변환(Type Casting : 자동형변환이 이루어지지 않는 경우 진행
	 * 
	 * boolean	: 1Byte
	 * char		: 2Bte
	 * byte		: 1Byte
	 * short	: 2Byte
	 * int		: 4Byte
	 * long		: 8Byte
	 * float	: 4Byte
	 * double	: 8Byte
	 * 
	 *
	 * 
	 */
	
	// 자동형변환(Promotion) : 작은 자료형 -> 큰 자료형
	public void autoCasting() {
		
		//System.out.println("이 내용을 콘솔창에 출력해보세요 실습 시작?");
		
		// 1. int(정수, 4Byte) => double(실수, 8Byte)
		
		// 변수 선언!
		int intNum = 10;
		System.out.println(intNum);
	
		double doubleNum = (double)intNum;
		System.out.println(doubleNum);
		
		// 2.int(정수, 4Byte) -> long(8Byte, 정수)
		int bigInteger = 120;
		long smallLong = /*(long)*/bigInteger; //작은것에서 큰거로 변환하는건 문제없음
		System.out.println(smallLong);
		
		// 3. long(정수, 8Byte) -> float(실수, 4Byte) **특이케이스
		long longNumber = 1000L;
		//int num = longNumber;
		float floatNumber = longNumber;
		System.out.println(floatNumber);
		
		//정수가 실수로 변환될 떄 큰사이즈의 정수타입이 작은 사이즈 실수타입으로 형변환
		// 4Byte float형이 long형보다 표현할 수 있는 값의 범위가 더 넓기 때문
		
		// 1 2 3
		// 1.00000001 1.00000002 1.00000003
		
		System.out.println("----------------------------------------------");
		
		// 4. char(2Byte) -> int(4Byte)
		char ch = 'a';
		System.out.println(ch);
		int num = ch;
		System.out.println(num);
		char ch2 = 97;
		System.out.println(ch2);
		
		// 번외. byte 또는 short형간의 연산
		
		// -128 ~ 127
		
		byte byteNum = (byte)128;
		System.out.println(byteNum);
		
		byte b2 = 126;
		byte b3 = 3;
		System.out.println(/*(int)*/b2 + b3);
		// 결과값은 int형 => 연산장치가 값을 처리하는 크기가 int형크기(4Byte)
		
		
		// 비교연산자( == )
		// 좌항과 우항의 값을 비교해서 결과값을 반환
		// true / false
		System.out.println("비교 연산자를 사용해보자");
		System.out.println(1 == 2 ); 	 	// false
		System.out.println('a' == 'b'); 	// false
		System.out.println(2 ==(int)'2');	// false
		System.out.println((char)2 == '2');	// false
		System.out.println((int)'2');
		System.out.println((int)'2' == '2'); //true
	}
		// 강제 형 반환 : 큰 크기의 자료형 -> 작은 크기의 자료형
		public void forceCasting() {
			
			// 명시적 형변환이라고도 함
			//(바꿀자료형)값
			
			//double(8byte) -> int(4Byte)
			double doubleNum = 10.123123;
			int intNum = (int)doubleNum;
			System.out.println(intNum);
			
			// 0.123213 요 부분이 절삭 -> 데이터의 손실
			
			double dNum = intNum;
			System.out.println(dNum);
			
		}
		
		
		
}

