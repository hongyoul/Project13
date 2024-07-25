package innerclass;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex3 {

   public static void main(String[] args) {
      
      // 1. 화면 만들기
      Frame frame = new Frame();      // 프레임 선언
      frame.setLayout(new FlowLayout());
      frame.setBounds(500, 300, 500, 300);   // X 좌표, Y좌표, 넓이, 높이
      frame.setVisible(true);   // setVisible(true)로 해줘야 눈으로 확인이 가능
      
      Button button = new Button("Click");
      frame.add(button);
      
      // 2. 버튼 이벤트 등록하기
      // 미리 구현한 클래스로 이벤트 등록
//      button.addActionListener(new EventHandler());
       
      // 익명 클래스를 만들고, 객체를 바로 생성
      button.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("버튼을 클릭했습니다!!!!!!");
			
		}
	});
   }
      
}

// ActionListener 인터페이스를 상속받아서 구현 클래스 만들기
class EventHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼을 클릭했습니다.");
		
	}
   
   
}
