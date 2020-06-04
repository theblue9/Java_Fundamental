package java_20200604;

import java.util.ArrayList;

public class EmpDemo {
	public static void main(String[] args) {
		// 객체를 생성할때 생성자를 만들어야겠다는 생각을해야 된다.(EmpDto)
		EmpDao dao = EmpDao.getInstance();
		int no = 8003;
		String name = "LEE2";
		String job = "ANALYST";
		int mgr = 7788;
		int sal = 2200;
		int comm = 0;
		int deptNo = 30;
		EmpDto e = new EmpDto(no, name, job, mgr, null, sal, comm, deptNo);
		//insert
		//갱신된 행의 값을 반환한다
		int resultCount = dao.insert(new EmpDto(no, name, job, mgr,	null, sal, comm, deptNo));
		if(resultCount ==1 ) {
			System.out.println("사원이 정상적으로 추가되었습니다.");
		}else {
			System.out.println("오류..");
		}
		
		/*
		//update
		no = 8002;
		name = "LEE1";
		job = "SALESMAN";
		mgr = 7844;
		sal = 2222;
		comm = 10;
		deptNo = 10;
		
		resultCount = dao.update(new EmpDto(no, name, job, mgr, null, sal, comm, deptNo));
			if(resultCount ==1 ) {
			System.out.println("사원이 정상적으로 수정되었습니다.");
		}else {
			System.out.println("오류..");
		}
		
		
		//delete
		resultCount = dao.delete(no);
		if(resultCount ==1 ) {
			System.out.println("사원이 정상적으로 삭제되었습니다.");
		}else {
			System.out.println("오류..");
		}
		
		
		
		//select (0,10);
		int start = 0;
		int len = 10;
		
		ArrayList<EmpDto> list = dao.select(start, len);
		for(EmpDto dto : list) {
			System.out.printf("%d, %s, %s, %d, %s, %d, %d, %d %n", 
					dto.getNo(),dto.getName(), dto.getJob(), 
					dto.getMgr(), dto.getHireDate(),
					dto.getSal(), dto.getComm(), dto.getDeptNo());
		}
		
		no= 7839;
		EmpDto dto = dao.select(no);
		
		if(dto != null) {
			System.out.printf("%d, %s, %s, %d, %s, %d, %d, %d %n", 
					dto.getNo(),dto.getName(), dto.getJob(), 
					dto.getMgr(), dto.getHireDate(),
					dto.getSal(), dto.getComm(), dto.getDeptNo());	
		}else {
			System.out.println("회원정보가 없습니다.");
		}
		 */
	}
}
