package icehs.science.chapter03;

public class StringVariableEx {

	public static void main(String[] args) {
		
		String name = "홍길동";
		String mathScore = "96";
		int intMathScore = Integer.parseInt(mathScore);
		int englishScore = 82;
		
		System.out.println("이름 : " + name);
		System.out.println("수학 점수 : " + intMathScore);
		System.out.println("영어 점수 : " + englishScore);
		
		System.out.println("합계점수 : " + (intMathScore + englishScore));

	}

}
