package usedItem.model.dao;

import usedItem.model.dto.ReadDto;

import java.sql.*;
import java.util.ArrayList;

public class ProductDao {
    private ProductDao(){connect();}
    private static final ProductDao instance = new ProductDao();
    public static ProductDao getInstance(){
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
            System.out.println("[시스템경고] 데이터베이스 연동 실패 : 관리자에게 문의" + e);
        }
    }

    // [1] Create dao
    public boolean create(String mname,String pname, String content, int price, String pw, String phoneNum ){
        try {String sql = "insert into usedItem( mname, pname, content, price, pw, phoneNum) values( ?, ?, ?, ?, ?, ? )";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, mname);
            ps.setString(2, pname);
            ps.setString(3, content);
            ps.setInt(4, price);
            ps.setString(5, pw);
            ps.setString(6, phoneNum);
            int count = ps.executeUpdate();
            if( count == 1 ){ return true; }
            else{ return false; }
        }catch ( SQLException e ){
            System.out.println("[시스템오류] SQL 문법문제 발생 : "+ e );
        }
        return false;
    } // Create end

    // [2] Read dao
    public ArrayList<ReadDto> Read(){
        ArrayList<ReadDto> result = new ArrayList<>(); // 조회 결과인 레코드(dto)들을 저장할 리스트/배열 선언
        try {
            String sql = "SELECT p.orderNum, p.mno, p.pname, p.price, p.orderdate, p.sold, p.content, u.mname, u.phoneNum " +
                    "FROM product p " +
                    "INNER JOIN user u ON p.mno = u.mno " +
                    "ORDER BY p.orderdate DESC";  // 1] sql 작성한다.
            PreparedStatement ps = conn.prepareStatement(sql); // 2] SQL 기재한다.
            // 3] SQL 매개변수 대입한다
            ResultSet rs = ps.executeQuery(); // 4] sql 실행 후 조회 결과 테이블 제어
            // executeUpdate(): insert/update/delete vs executeQuary() : select
            // ResultSet : select 결과물을 제어하는 인터페이스
            // rs.next(): 조회 결과에서 다음레코드 한 번 이동, 만약에 레코드가 10개이면 next 10번
            while( rs.next()) { // while(논리){ } 반복문, *레코드 1개씩 순회* 1개 레코드 -> 1개 DTO
                // rs.get타입명(SQL속성명): 현재 레코드의 속성값 호출
                int mno = rs.getInt("mno");
                String pname = rs.getString("pname");
                int price = rs.getInt("price");
                String orderdate = rs.getString("orderdate");
                boolean sold = rs.getBoolean("sold");
                String phoneNum = rs.getString("phoneNum");
                // mname 조회
                String mname = rs.getString("mname");
                // ReadDto 객체 생성 & 값 설정
                ReadDto readDto = new ReadDto( mno, pname, price, mname, orderdate, sold, phoneNum); // ReadDto 객체 생성 및 설정
                // 결과리스트에 추가
                result.add(readDto);
            }
        }catch (SQLException e){System.out.println("[시스템오류] SQL 문법 문제 발생 : "+ e);
        }
        return result;
    }// [2] read end
}// class end

