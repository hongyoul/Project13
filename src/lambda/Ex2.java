package lambda;

public class Ex2 {

	public static void main(String[] args) {

		// 객체 지향 방식
//		Calc calc = new Calc1();
//		int hap1 = calc.add(3, 5);
//		System.out.println(hap1);
		
		// 람다식
		Calc calc = (num1, num2) -> num1 + num2;
		System.out.println(calc.add(3, 5));
		
		// 람다식의 동작 원리
		Calc calc2 = new Calc() {
			
			@Override
			public int add(int num1, int num2) {
				return num1 + num2;
			}
		};
		System.out.println(calc2.add(3, 4));
	}

}

// 함수형 인터페이스 만들기
@FunctionalInterface
// 함수형 어노테이션을 나타내는 어노테이션. 추상메소드가 한개 이상 추가되는 것을 막음
interface Calc {
	
	// 추상메소드 만들기 (두 숫자를 더해서 합을 변환하는 함수)
	int add(int num1, int num2);
	
	// 추상메소드가 여러개면 람다식을 대입할 때, 어떤 메소드의 코드인지 알 수 없음
	// 에러남
//	int max(int num1, int num2);
}

// Calc의 구현 클래스 만들기
//class Calc1 implements Calc {
//
//	@Override
//	public int add(int num1, int num2) {
//		return num1 + num2;
//	}
//	
//}

