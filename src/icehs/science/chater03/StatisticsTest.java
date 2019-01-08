package icehs.science.chater03;

public class StatisticsTest {

	public static void main(String[] args) {
		long distenceToSun = 150000000L;
		double lottoWinning = 0.0000001235;
		long allPopulation = 6973738433L;
		boolean isRight = true;
		
		System.out.println( "태양에서 지구까지의 거리 : " + distenceToSun );
		System.out.println( "로또에 당첨될 확률 : " + lottoWinning );
		System.out.println( "전 세계의 인구 수 : " + allPopulation );
		System.out.println( "위 값들이 정확한가요? : " + isRight );
	}

}
