package com.kh.chap06.run;

import com.kh.chap06.controller.MethodController;
import com.kh.chap06.controller.OverloadingController;

public class Run {

	public static void main(String[] args) {
		/*
		 * Human human =new Human(); human.hi(); human.
		 */

		MethodController mc = new MethodController();
		// int [] dd = new int[3];
		// mc.method1();
		// String returnValue = mc.method2();
		// System.out.println(returnValue);
		// System.out.println(mc.method2());
		// mc.println("method3 호출 결과 : " + mc.method3());

		// String parameter = "method3 호출 결과 : " + mc.method3();
		// mc.method4(2);
		// int result = mc.method5(5);
		// System.out.println(result);
		// mc.a();

		// MethodController mc = mc;
		// 얕은복사 ☆★☆★☆★☆★☆☆★☆★☆★☆★☆☆★☆★☆★☆★☆☆★☆★☆★☆★☆☆★☆★☆★☆★☆☆★☆★☆★☆★☆☆★☆★☆★☆★☆☆★☆★☆★☆★☆
		// mc.test(mc);

		// 복습하자~~~

		// 객체를 생성하지않고 메소드를 호출할수있다.
		// Math.random();
		// int[] arr = {2, 3};
		// System.out.println(Arrays.toString(arr));

		// MethodController.staticMethod();

		// mc.haha(3.34);
		// System.out.println(1);
		// System.out.println(1.1);

		OverloadingController over = new OverloadingController();

		// 정적 바인딩(static Binding)
		// 컴파일이 끝난 시점 어떤 메소드가 호출될지 결정
		// 컴파일러가 알아서 코드를 분석하여 메소드 호출
		over.test();
		over.test(2);
		over.test("3");
		over.test(1, 2);
		over.test(2, "sdf");
		over.test("vvv", 3);
	}

}
