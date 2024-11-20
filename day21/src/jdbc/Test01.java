package jdbc; // JAVA <---> DBMS(Oracle)

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test01 {
   public static void main(String[] args) {

      final String driverName="oracle.jdbc.driver.OracleDriver";
      final String url="jdbc:oracle:thin:@localhost:1521:xe";
      final String userName="TEEMO";
      final String password="1234";
      final String sql="SELECT * FROM PRODUCT"; // SQL == 대문자 == 가독성 높이기
      final String insert = "INSERT INTO PRODUCT VALUES
      
      try {
         Class.forName(driverName);
      } catch (ClassNotFoundException e) {
         System.err.println("해당 드라이버 클래스를 찾을 수 없습니다!");
      } finally {
         System.out.println("[1] JDBC 드라이버를 메모리에 로드(load,적재)");
      }
            
      Connection conn=null;
      try {
         conn = DriverManager.getConnection(url, userName, password);
      } catch (SQLException e) {
         System.out.println("DB 연결 실패!");
      } finally {
         System.out.println("[2] DB와의 연결을 확보한다.");
      }
      
      PreparedStatement pstmt=null;
      
      //셀렉트문
      try {
         pstmt=conn.prepareStatement(sql);
         
         ResultSet rs = pstmt.executeQuery();
         while(rs.next()) {
            System.out.println("NUM : "+rs.getInt("NUM"));
            System.out.println("NAME : "+rs.getString("NAME"));
            System.out.println("PRICE : "+rs.getInt("PRICE"));
            System.out.println("CNT : "+rs.getInt("CNT"));
            System.out.println();
         }
      } catch (SQLException e) {
         System.err.println("SQL문이 올바르지않습니다!");
      } finally {
         System.out.println("[3] DB에 데이터를 read, write");
      }
      
      try {
         pstmt.close();
         conn.close();
      } catch (SQLException e) {
         System.err.println("연결을 해제할 수 없습니다!");
      } finally {
         System.out.println("[4] DB 연결 해제(안정성 때문)");
      }
   
      
      
      
      
      
      
      
      
      
      
      
      
   }
}
