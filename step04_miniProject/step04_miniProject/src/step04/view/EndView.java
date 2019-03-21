package step04.view;

import java.util.HashMap;

import step04.model.domain.StudentDTO;

public class EndView {
	public static void printAll(HashMap<Integer, StudentDTO> hm) {
		System.out.println("모든 정보 조회.");
		for (Integer Key : hm.keySet()) {
			System.out.println("학번: " + Key + " / 이름 및 전화번호: " + hm.get(Key));
		}
	}

	public static void printSize(HashMap<Integer, StudentDTO> hm) {
		System.out.println("---------------------------------------------------");
		System.out.println("현재 학생수를 출력해보시오.");
		System.out.println("학생수: " + hm.size() + "명");
	}

	public static void printValues(HashMap<Integer, StudentDTO> hm) {
		System.out.println("---------------------------------------------------");
		System.out.println("모든 정보 초기화");
		hm.clear();
		System.out.println("학생수" + hm.size() + "명");
	}

	public static void failMsg() {
		System.out.println("---------------------------------------------------");
		System.out.println("다시 재요청해보시오.");
	}
}
