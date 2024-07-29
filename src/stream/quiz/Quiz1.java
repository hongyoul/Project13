package stream.quiz;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

//		String[] arr = { "aaa", "aaa", "b", "b", "ccccc" };

//		List<String> list = Arrays.asList("aaa", "aaa", "b", "b", "ccccc");

		// Q. 1.문자열 목록 중에서 길이가 2보다 큰 요소의 개수를 구하세요 / 결과: 3
		// 문자열 길이
//		list.stream().map(s -> s.length()).forEach ( s -> System.out.println(s + " "));
		// 조건에 맞는 결과를 추출 / 2보다 큰 요소의 개수
//		list.stream().map(s -> s.length()).filter(n -> n > 2).forEach(n -> System.out.println(n + " "));

//		System.out.println();

		// Q. 2.모든 문자열의 길이를 더한 합을 구하세요
//		list.stream().map(s -> s.length()).collect(map(s -> s.length()).forEach(n -> System.out.println(n + " "));
//		Stream<String> stream2 = Arrays.stream(arr);
//		int sum = stream2.mapToInt(s -> s.length()).sum();
//		System.out.println("모든 문자열의 길이를 더한 합: " + sum);

//		System.out.println();

		// Q. 3.가장 길이가 짧은 문자열의 길이를 구하세요.
//		list.stream().map(s -> s.length()).
//		Stream<String> stream3 = Arrays.stream(arr);
//		stream3.mapToInt(s -> s.length()).sorted().limit(1).forEach(s -> System.out.println(s));

//		System.out.println();

		// Q. 4.중복을 제거한 리스트를 만드세요.
//		list.stream().map(s -> s.length()).distinct().forEach(n -> System.out.println(n + " "));

		// 답지
		// 리스트 생성
		String[] arr8 = { "aaa", "aaa", "b", "b", "ccccc" };

		// 1.문자열 목록 중에서 길이가 2보다 큰 요소의 개수를 구하세요
		// 결과: 3
		Stream<String> stream1 = Arrays.stream(arr8);
		long count = stream1.filter(s -> s.length() > 2).count();
		System.out.println("길이가 3보다 큰 요소의 개수: " + count);

		// 2.모든 문자열의 길이를 더한 합을 구하세요
		// 결과: 13
		Stream<String> stream2 = Arrays.stream(arr8);
		int sum = stream2.mapToInt(s -> s.length()).sum();
		System.out.println("모든 문자열의 길이를 더한 합: " + sum);

		// 3.가장 길이가 짧은 문자열의 길이를 구하세요
		// 결과: 1
		Stream<String> stream3 = Arrays.stream(arr8);
		stream3.map(s -> s.length()).sorted().limit(1).forEach(s -> System.out.println(s));
		
		System.out.println();
		
		Stream<String> stream4 = Arrays.stream(arr8);
		OptionalInt min = stream4.mapToInt(s -> s.length()).min();
		System.out.println(min.getAsInt());

		// 4.중복을 제거한 리스트를 만드세요.
		// 결과: [aaa, b, ccccc]
		Stream<String> stream5 = Arrays.stream(arr8);
		List<String> list2 = stream5.distinct().collect(Collectors.toList());
		System.out.println("중복을 제거한 리스트: " + list2);

	}

}
