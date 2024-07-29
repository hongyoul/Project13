package stream.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//4번. 
//패키지 여행을 떠나는 고객 정보를 저장하는 Customer 클래스를 만드세요
//속성: 이름,나이,여행비용
//다음과 같이 여행 고객 리스트를 생성하세요
//고객 리스트를 사용하여 다음과 같은 정보를 출력하세요. - 고객의 명단
//- 여행의 총 비용
//- 20세 이상의 고객을 찾아서 이름을 출력

public class Quiz4 {

	public static void main(String[] args) {
		List<Customer> list = new ArrayList<Customer>();
		list.add(new Customer("둘리", 40, 100));
		list.add(new Customer("또치", 13, 50));
		list.add(new Customer("도우너", 25, 70));
		
		//- 고객의 명단
		System.out.println("== 고객 명단 ==");
		list.stream().map(t -> t.customerName).forEach(s -> System.out.println(s + " ")); 		
		
		//- 여행의 총 비용
		Stream<Customer> travelCost1  = list.stream();
		int sum = travelCost1.mapToInt(s -> s.travelCost).sum();
		System.out.println("여행의 총 비용: " + sum);
				
		//- 20세 이상의 고객을 찾아서 이름을 출력
		System.out.println("== 20세 이상의 고객 명단 ==");
		list.stream().filter(c -> c.customerAge >= 20)
		// 순정렬(작은거 > 큰거) 도우너:25 둘리:40
		.sorted((c1, c2) -> {
			if(c1.customerAge > c2.customerAge) {
				return 1;
			} else {
				return -1;
			}
		})
		.forEach(c -> System.out.println(c.customerName + ", " +c.customerAge));
		
		
	}
}

class Customer {
	String customerName;
	int customerAge;
	int travelCost;
	
	public Customer(String customerName, int customerage, int travelCost) {
		super();
		this.customerName = customerName;
		this.customerAge = customerage;
		this.travelCost = travelCost;
	}
	
}

//- 20세 이상의 고객을 찾아서 이름을 출력 람다식 풀이
//sorted -> Comparator -> int compare(T o1, T o2);
//int (o1.customerName > o2.customerName) {
//	return 1; {
//	} else {
//		return -1;
//	}
//} -> if(c1.customerAge > c2.customerAge) {
//	return 1;
//} else {
//	return -1;
//}
//})