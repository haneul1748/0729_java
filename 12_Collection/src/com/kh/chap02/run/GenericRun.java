package com.kh.chap02.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap02.model.vo.Plant;

public class GenericRun {

	public static void main(String[] args) {

		/*
		 * 제너릭 <Generic>
		 * 
		 * 컬렉션을 사용하면서 다를 타입들을 미리 지정할 수 있는 기능 => 명시적으로<Integer>, <Plant>
		 * 
		 * 별도의 제너릭 없이 컬렉션 객체 생성 ( E == Object )
		 * 
		 * 1. 다른 요소들의 타입을 제한할 수 있음 => 실수를 줄일 수 있음 
		 * 2. 매 번 형변환하는 절차를 없앨 수 있음 => 코드 짤 때 편함
		 */
		List<Plant> plants = new ArrayList();
		plants.add(new Plant("관엽", "신세베리아"));
		plants.add(new Plant("관엽", "폴라샤스"));
		Plant p = plants.get(0);

		for (Plant plant : plants) {
			System.out.println(plant);
		}
	}

}
