package usedItem.controller;

import usedItem.model.dao.BoardDao;

import java.util.Scanner;

public class BoardController {
    private BoardController(){}
    private static final BoardController instance = new BoardController();
    public static BoardController getInstance(){
        return instance;
    }
    private BoardDao bd = BoardDao.getInstance();

    // [1] 물품등록 Controller
    public boolean create(String mname, String pname, String content, int price, int pw, String phoneNum ){
        boolean result = bd.create(mname, pname, content, price, pw, phoneNum );
        return result;
    }


}
