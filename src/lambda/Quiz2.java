package lambda;

public class Quiz2 {

	public static void main(String[] args) {

		// 1.
		Hello hello = new HelloImpl();
		HelloImpl helloImpl = new HelloImpl();
		
		hello.hellPrint();	
			
		// 2. 익명클래스로 인터페이스 구현 + 인스턴스 생성
		Hello hello1 = new Hello() {
			
			@Override
			public void hellPrint() {
				System.out.println("안녕하세요");
				
			}
		};
		
		hello1.hellPrint();
		
		// 람다식
		Hello hello2 =() -> System.out.println("안녕하세요");
		hello2.hellPrint();
	}

}

// 함수형 인터페이스 선언
interface Hello {
	//"안녕하세요"를 출력하는 함수
	void hellPrint();
}

class HelloImpl implements Hello {

	@Override
	public void hellPrint() {
		System.out.println("안녕하세요");
		
	}
	
}