package java_20200521;

public class EqualDemo {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");

		System.out.println(s1 = s2); // false
		System.out.println(s1.equals(s2)); // true
		System.out.println("============");
		
		Customer c1 = new Customer("성영한", "제주도");
		Customer c2 = new Customer("성영한", "제주도");
		
		System.out.println(c1== c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		System.out.println("============");
		
		System.out.println(c1.toString()); //System.out.println(s1); =>안됨.
		System.out.println(s1.toString()); //System.out.println(s1); =>안됨.
		
		
		
	}

}
