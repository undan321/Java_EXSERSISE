package icehs.science.chapter03;

public class StatisticsTest {

	public static void main(String[] args) {
		//태양의 거리 전세계 인구수 로또 당첨률 논리형 변수 선언
		int fromSunToEarthDistance = 150000000;
		long population = 6973738433L;
		double lottoProbability = 0.0000001235;
		boolean isRight = true;
		
		System.out.println("태양에서 지구까지의 거리 : " + fromSunToEarthDistance);
		System.out.println("로또에 당첨될 확률  : " + lottoProbability);
		System.out.println("전 세계 인구 : " + population);
		System.out.println("위 값이 정확한가? : " + isRight);
		

	}

}
