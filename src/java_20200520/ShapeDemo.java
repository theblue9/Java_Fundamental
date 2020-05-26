package java_20200520;

public class ShapeDemo {

	// 추상 클래스의 다형성. 대신 Shape에 하위 클래스만 가능함.
	public static void run(Shape s) {
		s.draw();
	}

	/*
	 * public static void run(Triangle t) { t.draw(); }
	 * 
	 * public static void run(Rectangle r) { r.draw(); }
	 * 
	 * public static void run(Circle c) { c.draw(); }
	 */
	public static void main(String[] args) { // 추상클래스는 객체를 생성할 수 없다. // Shape s1 = new Shape(); => x

		Shape s1 = new Rectangle();
		s1.draw();
		
		Rectangle r1 = new Rectangle();
		run(r1);

		Circle c1 = new Circle();
		run(c1);

		Triangle t1 = new Triangle();
		run(t1);

	}

}
