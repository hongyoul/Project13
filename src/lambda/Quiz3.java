package lambda;

public class Quiz3 {

	public static void main(String[] args) {

		// 구현클래스
		StringConverter strCon = new StringConverterImpl();
		String resu = strCon.convert("Hello,World");
		
		System.out.println("결과" + resu);
		
		
		// 익명 클래스
		StringConverter strCon1 = new StringConverter() {
			
			@Override
			public String convert(String s) {
				return s.toUpperCase();
			}
		};
//		strCon1.convert("Hello,World");
		
		// 람다식 
		StringConverter strCon2 = s -> s.toUpperCase();
//		strCon2.convert("Hello,World");
	}

}

// 함수형 인터페이스 선언
interface StringConverter {
	// 문자열을 대문자로 변환해서 반환하는 함수
	String convert(String s);
}

class StringConverterImpl implements StringConverter {

	@Override
	public String convert(String s) {
		return s.toUpperCase();
	}
	
}