package java_20200519;

public class SuperDemo extends Object{
	public SuperDemo() {
		
	}
}


class A{				
	A(int a) {
		
	}
	A() {				// 무조건 default생성자를 만들고 시작하자.
		
	}
}

class B extends A{

}

/*

package java_20200519;
import java.lang.*;

public class SuperDemo extends Object {
	public SuperDemo() {
		super();
	}
	
}


class A extends Object {   //앞에 public을 안쓴 이유 : 
	A() {
		super();
	}
}


class B extends A {
	B() {
		super();
	}
	
}

*/