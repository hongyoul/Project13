package stream.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//3번. 다음과 같이 쇼핑몰의 거래내역을 저장하는 클래스를 만드세요
//속성: 주문번호, 주문연도, 거래금액(만원단위)
//다음과 같이 거래내역 리스트를 생성하세요
//• 모든 거래번호를 한줄에 나열하세요. 결과: 1001 1002 1003 1004 1005 1006 1007
//• 2022년도의 거래 총금액과 건수를 출력하세요
//결과: 총금액:650, 거래건수:3
//• 2023년도의 거래 총금액과 건수를 출력하세요
//결과: 총금액:2150, 거래건수:4

public class Quiz3 {

	public static void main(String[] args) {

		// 거래내역 리스트를 생성
		List<Order> list = new ArrayList<>();

		list.add(new Order(1001, 2022, 300));
		list.add(new Order(1002, 2022, 150));
		list.add(new Order(1003, 2022, 200));
		list.add(new Order(1004, 2023, 500));
		list.add(new Order(1005, 2023, 400));
		list.add(new Order(1006, 2023, 600));
		list.add(new Order(1007, 2023, 650));
		
		// Q 1. 모든 거래번호를 한줄에 나열하세요
		Stream<Order> stream1 = list.stream();
		stream1.forEach(o -> System.out.print(o.orderNo + " "));
		
		//연도까지 포함 출력
//		stream1.forEach(o -> System.out.print(o.orderNo + ", " + o.year));
		
		System.out.println();
		
		//Q 2. 2022년도의 거래 총금액과 건수를 출력하세요
		
		int sum1 = list.stream()
				.filter(o -> o.year == 2022)
				.mapToInt(o -> o.price)
				.sum();
		System.out.println("2022년도의 거래 총금액: " + sum1);
		long count1 = list.stream()
				.filter(o -> o.year == 2022)
				.count();
		System.out.println("2022년도의 거래건수: " + count1);
		
		System.out.println();
		
		//Q 3. 2023년도의 거래 총금액과 건수를 출력하세요
		int sum2 = list.stream()
				.filter(o -> o.year == 2023)
				.mapToInt(o -> o.price)
				.sum();
		System.out.println("2023년도의 거래 총금액: " + sum2);

		long count2 = list.stream()
				.filter(o -> o.year == 2023)
				.count();
		System.out.println("2023년도의 거래건수: " + count2);
		
		
	}

}

class Order {
	int orderNo;
	int year;
	int price;
	
	public Order(int orderNo, int year, int price) {
		super();
		this.orderNo = orderNo;
		this.year = year;
		this.price = price;
		
	}

	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", year=" + year + ", price=" + price + "]";
	}
}

