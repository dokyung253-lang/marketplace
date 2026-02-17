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
    private ProductDao pd = ProductDao.getInstance();

    // [1] 물품등록(Create) Controller
        public boolean create(String mname, String pname, String content, int price, String pw, String phoneNum ){
            boolean result = pd.create(mname, pname, content, price, pw, phoneNum );
            return result;
        }// [1] create end

        // [2] 물품 전체 조회(Read) Controller
        public ArrayList<ReadDto>read(){// 닉네임을 저장한다.
            ArrayList<ReadDto> result = pd.Read(); // ProductDao에서 데이터를 가져옴
         // ReadDto객체 안에 이미 mname 설정되어 있으므로 별도로 조회할 필요 없음
            return result; // 바로 결과 반환
        }// [2] read end
} // class end
