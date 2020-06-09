package java_20200604;
// Emp 테이블의 데이터를 관리하기 위한 클래스.
// Emp 테이블의 컬럼(empno, ename, job, mgr, hiredate, sal, comm, deptno)을 멤버변수로 정하면 됨.
// DTo : Data Transfer Object
// (자바의 멤버변수는 데이터 베이스 에있는 클럽명을 따오면 절대 안된다. => 관례
// identifier는 첫글자는 소문자로 네이밍 해야한다.
// 생성자 안에 공통된 규칙을 집어넣으면 매번 칠 필요가 없어서 좋당.
public class EmpDto {
	private int no;
	private String name;
	private String job;
	private int mgr;
	private String hireDate;
	private int sal;
	private int comm;
	private int deptNo;
	
	public EmpDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EmpDto(int no, String name, String job, int mgr,String hireDate,int sal, int comm, int deptNo) {
		this.no = no;
		this.name = name;
		this.job = job;
		this.mgr = mgr;
		this.hireDate = hireDate;
		this.sal = sal;
		this.comm = comm;
		this.deptNo = deptNo;
	}
	
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public String getJob() {
		return job;
	}
	public int getMgr() {
		return mgr;
	}
	public String getHireDate() {
		return hireDate;
	}
	public int getSal() {
		return sal;
	}
	public int getComm() {
		return comm;
	}
	public void setEn(int no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
}
