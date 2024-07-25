package lambda;


public class Ex1 {

	public static void main(String[] args) {

		// 변수는 둘다(부모 자식) 가능! 
		
		// 객체 지향 방식
		StringConcat stringConcat = new StringConcatImpl();
		stringConcat.makeString("Hello", "World");
	
		// 람다식 방식
		StringConcat stringConcat2 = (s1, s2) -> System.out.println(s1 + "," + s2);
		stringConcat.makeString("Hi~", "marry");
		
	
	}
}

// 함수형 인터페이스 만들기
interface StringConcat {
	
	// 추상메소드 하나 만들기 (두 문자열을 연결하는 함수)
	public void makeString (String s1, String s2);
}

// StringConcat의 구현 클래스 만들기
class StringConcatImpl implements StringConcat {

	@Override
	public void makeString(String s1, String s2) {

		System.out.println(s1 + "," + s2);
	}
	
}