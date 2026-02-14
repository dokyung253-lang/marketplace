package usedItem.controller;

import usedItem.model.dao.ProductDao;
import usedItem.model.dto.ReadDto;

import java.util.ArrayList;

public class ProductController {
    private ProductController(){}
    private static final ProductController instance = new ProductController();
    public static ProductController getInstance(){
        return instance;
    }
    private ProductDao bd = ProductDao.getInstance();

    // [1] 물품등록(Create) Controller
    public boolean create(String mname, String pname, String content, int price, String pw, String phoneNum ){
        boolean result = bd.create(mname, pname, content, price, pw, phoneNum );
        return result;
    }
    // [2] 물품 전체 조회(Read) Controller
    public ArrayList<ReadDto> Read() {
        ArrayList<ReadDto> result = pc.Read();
        // *조회된 제품목록에서 제품등록한 회원번호로 닉네임 찾기
        for (int i = 0; i <= result.size() - 1; i++) {
            ReadDto readDto = result.get(i);
            // *회원번호를 Dao에게 전달하여 닉네임 반환받기
            int mNum = readDto.getMnum(); String mname = ReadDto.getInstance().findMname(mNum);
            readDto.setMname(mname); // 반환된 닉네임을 저장한다.
        } // for end
        return result;
    } // m end
} // c end
