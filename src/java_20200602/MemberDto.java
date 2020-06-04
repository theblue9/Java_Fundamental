package java_20200603;

// Member 테이블의 데이터를 관리하기 위한 클래스.
// Member 테이블의 컬럼(num, name, addr)을 멤버변수로 정하면 됨.
// DTo : Data Transfer Object
public class MemberDto {
	private int num;
	private String name;
	private String addr;
	//default constructor
	//alt + shift + s => c
	public MemberDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	//alt + shift + s => o
	public MemberDto(int num, String name, String addr) {
		this.num = num;
		this.name = name;
		this.addr = addr;
	}
	//alt + shift + s => r => tap enter tap tap tap tap enter
	//setter : 멤버 변수에 값을 집어넣는 방법 => 메소드
	public void setNum(int num) {	
		this.num = num;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	//getter : 멤버 변수에 값을 읽는 방법
	public int getNum() {
		return num;
	}
	public String getName() {
		return name;
	}
	public String getAddr() {
		return addr;
	}
	
	
}
