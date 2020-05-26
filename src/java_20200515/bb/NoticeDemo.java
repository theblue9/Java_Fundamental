package java_20200515.bb;

import java_20200515.aa.Notice; //다른 클래스에서 가져다 쓰고싶으면 import문을 사용하여 가져와 쓰면된다

public class NoticeDemo extends Notice{
	public static void main(String[] args) {
		Notice n1 = new Notice();
		n1.number = 2;
		// protected(title)는 서로 다른패키지 일경우에는 상속받은 경우에만 접그가능.
		// n1.title = "제목";
		
		// default는 같은 패키지 내에서 접근가능
		// n1.hit = 100;
		
		// private은  같은 클래스 내에서만 접근가능
		// n1.regdate = "2020-05-15";
		
		// 부모 클래스인 Notice에서 접근할 수 있는 접근 한정자는 public, protected
		NoticeDemo n2 = new NoticeDemo();
		n2.number = 3;
		n2.title = "제목";
		// n2.hit = 100;
		// n2.regdate = "2020-05-15";
		

	}

}
