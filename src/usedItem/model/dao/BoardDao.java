package usedItem.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardDao {
    private BoardDao(){connect();}
    private static final BoardDao instance = new BoardDao();
    public static BoardDao getInstance(){
        return instance;
    }
    // db 연동
    private String url = "jdbc:mysql://localhost:3306/usedItem";
    private String user = "root"; private String password = "1234";
    // 2) 연동 인터페이스 변수 선언
    private Connection conn;
    // 3) 연동 함수 정의 , dao에 생성자에서 함수 실행 ( dao 싱글톤이 생성되면서 db연동 실행 )
    private void connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // mysql 라이브러리 객체 메모리할당/불러오기
            conn = DriverManager.getConnection( url , user , password ); // mysql 구현체 로 db연동후 연동 인터페이스에 반환
            System.out.println("[시스템준비] 데이터베이스 연동 성공");
        }catch ( Exception e ){
            System.out.println("[시스템경고] 데이터베이스 연동 실패 : 관리자에게 문의");
        }
    }

    // [1] 게시물 등록 dao
    public boolean create(String mname,String pname, String content, int price, int pw, String phoneNum ){
        try {
            String sql = "insert into board( mname, pname, content, price, pw, phoneNum) values( ?, ?, ?, ?, ?, ? )";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, mname);
            ps.setString(2, pname);
            ps.setString(3, content);
            ps.setInt(4, price);
            ps.setInt(5, pw);
            ps.setString(6, phoneNum);
            int count = ps.executeUpdate();
            if( count == 1 ){ return true; }
            else{ return false; }
        }catch ( SQLException e ){
            System.out.println("[시스템오류] SQL 문법문제 발생 : "+ e );
        }
        return false;
    }
}
