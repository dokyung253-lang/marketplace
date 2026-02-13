package usedItem.controller;

import usedItem.model.dao.ProductDao;

public class ProductController {
    private ProductController(){}
    private static final ProductController instance = new ProductController();
    public static ProductController getInstance(){
        return instance;
    }
    private ProductDao bd = ProductDao.getInstance();

    // [1] 물품등록 Controller
    public boolean create(String mname, String pname, String content, int price, int pw, String phoneNum ){
        boolean result = bd.create(mname, pname, content, price, pw, phoneNum );
        return result;
    }


}
