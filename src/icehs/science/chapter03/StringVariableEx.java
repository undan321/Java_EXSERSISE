package icehs.science.chapter03;

public class StringVariableEx {

	public static void main(String[] args) {
		
		String name = "ȫ�浿";
		String mathScore = "96";
		int intMathScore = Integer.parseInt(mathScore);
		int englishScore = 82;
		
		System.out.println("�̸� : " + name);
		System.out.println("���� ���� : " + intMathScore);
		System.out.println("���� ���� : " + englishScore);
		
		System.out.println("�հ����� : " + (intMathScore + englishScore));

	}

}
