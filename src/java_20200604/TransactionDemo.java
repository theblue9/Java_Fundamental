package java_20200604;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionDemo {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean isSuccess = false; //isSuccess : 이 객체에 대한 작업이 성공했는가.
		Connection con = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/kpc", "kpc12", "kpc1234");
			
			// 트랜잭션 시작.
			con.setAutoCommit(false);

			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO dept(deptno, dname, loc) VALUES(60,'A3','B3') ");
			
			pstmt1 = con.prepareStatement(sql.toString());
			pstmt1.executeUpdate();

			sql.setLength(0);	// setLength() : 문자 순서의 길이를 newLength와 동일하게 설정하는데 사용되는 내장메소드.
			sql.append("INSERT INTO dept(deptno, dname, loc) VALUES(80,'A4','B4') ");
			
			pstmt2 = con.prepareStatement(sql.toString());
			pstmt2.executeUpdate();

			isSuccess = true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (isSuccess) {
					con.commit(); // 트랜잭션 끝.
				} else {
					con.rollback(); // 트랜잭션 끝.
				}
				con.setAutoCommit(true); // Connection을 원래 상태로 처리.
				if (pstmt1 != null) pstmt1.close();	//반환하깅
				if (pstmt2 != null) pstmt2.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
