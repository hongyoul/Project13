package stream.quiz;

import java.util.Arrays;
import java.util.List;

//다음과 같이 리스트를 생성하세요
//String[] arr = { "aaa", "aaa", "b", "b", "ccccc" };
//1.문자열 목록 중에서 길이가 2보다 큰 요소의 개수를 구하세요
//결과: 3
//2.모든 문자열의 길이를 더한 합을 구하세요
//결과: 13
//3.가장 길이가 짧은 문자열의 길이를 구하세요
//결과: 1
//4.중복을 제거한 리스트를 만드세요.
//결과: [aaa, b, ccccc]

public class Quiz1 {

	public static void main(String[] args) {

		String[] arr = { "aaa", "aaa", "b", "b", "ccccc" };
		
		List<String> list = Arrays.asList( "aaa", "aaa", "b", "b", "ccccc");
		
		// Q. 1.문자열 목록 중에서 길이가 2보다 큰 요소의 개수를 구하세요 / 결과: 3
			// 문자열 길이
//		list.stream().map(s -> s.length()).forEach ( s -> System.out.println(s + " "));
			// 조건에 맞는 결과를 추출 / 2보다 큰 요소의 개수
		
		
	}

}
