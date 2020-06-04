package java_20200603;
// 데이터 베이스 삭제
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDeleteDemo {
	public static void main(String[] args) {
			// 1. 드라이브 로드 => 이경로가 잘못되어있거나 크로스???가 발생하면 예외가 발생한다
			// 원인 =>이름
			// 2클래스 패쓰?에

		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con = null;	// 
		PreparedStatement pstmt = null;	// 데이터베이스의 sql문을 전송할때 선언하는 것	//pstmt = PrefaredStatement

			// 2. 데이터 베이스와 연결한다.
			// 왼쪽에 마우스 갖다대면 언핸드 리셉션? = 예외가 발생한다.
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/kpc", // 주소 입력
					"kpc12", // 유저 아이디 입력
					"kpc1234" // 비밀번호 입력
			);

			// 3. SQL문을 전송할 수 있는 PreparedStatement 객체를 생성한다.
			StringBuffer sql = new StringBuffer();
			sql.append("DELETE FROM member1 ");
			sql.append("WHERE num = ? ");	//바인딩 변수를 ?로 해놓는이유 : 숫자를 넣으면 고정된 값만 집어 넣을 수 있는데 ?를넣으면 다른 값들도 넣을수 있다.
			// sql.append(""); 		// 넣을 값의 위치가 없으므로 없애준다.
			pstmt = con.prepareStatement(sql.toString()); // StringBuffer선언되면 toString과 연결 => ?
			
			// 4. 바인딩 변수 설정
			pstmt.setInt(1, 9); // (첫번째 변수(값), 실제 들어갈값)
			
			// 5. SQL문을 전송한다.
			int resultCount = pstmt.executeUpdate();

			System.out.println("삭제된 행의 수:" + resultCount);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 6. 모든 자원을 반납한다.
			try {
				if (con != null) con.close();
				if (pstmt != null) pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
