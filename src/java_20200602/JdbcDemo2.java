package java_20200602;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDemo2 {
	public static void main(String[] args) {
		// 1. 드라이브 로드
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이브 로드 생성");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 로드 실패");
		}

		// 2. 데이터 베이스 연결
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", 
					"kpc12", "kpc1234");
			System.out.println("데이터베이스 (Mariadb) 연결성공...");
			// 3. SQL문을 전송할 수 있는 PreparedStatement 객체를 생성

			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO member1(num, NAME, addr) VALUE (?,?,?) ");
			pstmt = con.prepareStatement(sql.toString());

			// 4. 바인딩 변수 설정과 쿼리문 전송
			pstmt.setInt(1, 11);
			pstmt.setString(2, "구찌");
			pstmt.setString(3, "이탈리아");

			// 5. SQL문 전송
			int resultCount = pstmt.executeUpdate();
			System.out.println("갱신된 행의수 :" + resultCount);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
