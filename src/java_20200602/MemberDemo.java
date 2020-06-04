package java_20200603;

import java.util.ArrayList;

// 결과값을 출력하는곳.
public class MemberDemo {
	public static void main(String[] args) {
		MemberDao mdao = new MemberDao();
		int num = 5;
		String name = "택진형1";
		String addr = "한국1";
		/*
		MemberDto m = new MemberDto(num, name, addr);
		 //insert
		 int resultCount = mdao.insert(new MemberDto(num, name, addr)); 
		 
		 if(resultCount==1) {
		 System.out.println("정상적인 회원 가입이 되었습니다."); 
		 }else { 
			 System.out.println("오류..");
		 }
		 
		 */

		  // update
		  num = 10;
		  name = "토토";
		  addr = "일본";
		  int resultCount = mdao.update(new MemberDto(num, name, addr));
		  if(resultCount==1) { 
			  System.out.println("회원이 정상적으로 수정 되었습니다."); 
		  }else {
		  System.out.println("오류.."); 
		  }
		
		  //delete
		  resultCount = mdao.delete(num); 
		  if(resultCount==1) {
		  System.out.println("회원이 정상적으로 삭제 되었습니다.");
		  }else {
		  System.out.println("오류..");
		  }
		 

		  // 테이블을 가져오는 방법
		ArrayList<MemberDto> list = mdao.select();
		for (int i = 0; i < list.size(); i++) {
			MemberDto m = (MemberDto) list.get(i);
			int _num = m.getNum();
			String _name = m.getName();
			String _addr = m.getAddr();
			System.out.printf("%d, %s, %s %n", _num, _name, _addr);
		}
		System.out.println("======================================================");
		for (MemberDto m : list) {
			int _num = m.getNum();
			String _name = m.getName();
			String _addr = m.getAddr();
			System.out.printf("%d, %s, %s %n", _num, _name, _addr);
		}
		System.out.println("======================================================");
		/*
		*/
		
		/*
		MemberDto mdto = mdao.select(num);
		if(mdto != null) {
			int _num = mdto.getNum();
			String _name = mdto.getName();
			String _addr = mdto.getAddr();
			System.out.printf("%d, %s, %s %n", _num, _name,_addr);
			
		}else {
			System.out.println("회원정보가 없습니다.");
		}
	}
	*/

	}
}
