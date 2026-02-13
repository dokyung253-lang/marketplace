package usedItem.view;

import usedItem.controller.ProductController;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BoardView {
    private BoardView(){}
    private static final BoardView instance = new BoardView();
    public static BoardView getInstance() {
        return instance;
    }

    private ProductController bc = ProductController.getInstance();
    private Scanner scan = new Scanner(System.in);

    // [1] 메인페이지 구현
    public void index(){
        for( ; ; ) {
            try {
                System.out.println("============ UsedItem MarketPlace ============ ");
                System.out.println("1.물품 등록 2.전체 목록 조회 3.물품 정보 수정 4.물품 삭제");
                System.out.println("====================================== ");
                System.out.print("선택>"); int ch = scan.nextInt();
                if (ch == 1) { create(); }
                else if (ch == 2) {}
                else if (ch == 3) {}
                else if (ch == 4) {}
                else { System.out.println("[경고] 없는 기능 번호 입니다. "); }
            }catch ( InputMismatchException e ){
                System.out.println("[경고] 잘못된 입력 방식 입니다.[재입력]");
                scan = new Scanner( System.in ); // 입력객체 초기화 ( 잘못된 입력값 제거 )
            }catch (Exception e) { // Exception 예외 중 슈퍼클래스로 모든 예외처리 가능
                System.out.println("[시스템오류] 관리자에게 문의");
            }
        } // for end
    } // index end

    // [1] Create view
    public void create(){ scan.nextLine();
        System.out.print("닉네임 : "); String mname = scan.nextLine();
        System.out.print("물품명 : "); String pname = scan.nextLine();
        System.out.print("설명 : ");   String content = scan.nextLine();
        System.out.print("가격 : "); int price = scan.nextInt();
        System.out.print("비밀번호 : "); int pw = scan.nextInt();
        System.out.print("전화번호 : "); String phoneNum = scan.next();
        boolean result = bc.create( mname, pname, content, price, pw, phoneNum);
        if( result ) {System.out.println("[안내] 게시물 등록완료 ");
        }else{System.out.println("[경고] 게시물 등록 실패");}
    } // [1] Create end

    // [2] Read view
    public void read(){ scan.nextLine();
        System.out.println("물품명: "); String pname = scan.nextLine();
        System.out.print("가격 : "); int price = scan.nextInt();
        System.out.print("닉네임 : "); String mname = scan.nextLine();


        System.out.print("전화번호 : "); String phoneNum = scan.next();
    }

}// class end

