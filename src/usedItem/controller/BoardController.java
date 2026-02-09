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
    public Scanner scan = new Scanner(System.in);

}
