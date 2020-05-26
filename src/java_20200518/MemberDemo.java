package java_20200518;

public class MemberDemo {
	public static void main(String[] args) {
		Member m = new Member();
		// m.name = "성영한";
		// System.out.println(m.name);
		m.setName("성영한");
		m.setZipcode("1234");
		m.setAddr1("서울");
		m.setAddr2("용산구");
		m.setSsn1("11111");
		m.setSsn2("111118");
		m.setAge(30);
		m.setRegdate("2020-05-18");
		
		System.out.println(m.getName());
		System.out.println(m.getZipcode());
		System.out.println(m.getAddr1());
		System.out.println(m.getAddr2());
		System.out.println(m.getSsn1());
		System.out.println(m.getSsn2());
		System.out.println(m.getAge());
		System.out.println(m.getRegdate());
		 
	}

}
