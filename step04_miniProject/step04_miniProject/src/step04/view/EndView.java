package step04.view;

import java.util.HashMap;

import step04.model.domain.StudentDTO;

public class EndView {
	public static void printAll(HashMap<Integer, StudentDTO> hm) {
		System.out.println("��� ���� ��ȸ.");
		for (Integer Key : hm.keySet()) {
			System.out.println("�й�: " + Key + " / �̸� �� ��ȭ��ȣ: " + hm.get(Key));
		}
	}

	public static void printSize(HashMap<Integer, StudentDTO> hm) {
		System.out.println("---------------------------------------------------");
		System.out.println("���� �л����� ����غ��ÿ�.");
		System.out.println("�л���: " + hm.size() + "��");
	}

	public static void printValues(HashMap<Integer, StudentDTO> hm) {
		System.out.println("---------------------------------------------------");
		System.out.println("��� ���� �ʱ�ȭ");
		hm.clear();
		System.out.println("�л���" + hm.size() + "��");
	}

	public static void failMsg() {
		System.out.println("---------------------------------------------------");
		System.out.println("�ٽ� ���û�غ��ÿ�.");
	}
}
