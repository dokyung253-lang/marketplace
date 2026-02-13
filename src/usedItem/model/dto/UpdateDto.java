package usedItem.model.dto;

public class UpdateDto {
    private int orderNum;   // 게시물 식별용
    private String pw;      // 등록 시 설정한 비밀번호 검증
    private String pname;
    private String content;
    private int price;
    private String phoneNum;
    private boolean sold; // 판매여부 상태(판매중/판매완료)

    public UpdateDto(int orderNum, String pw, String pname, String content, int price, String phoneNum, boolean sold) {
        this.orderNum = orderNum;
        this.pw = pw;
        this.pname = pname;
        this.content = content;
        this.price = price;
        this.phoneNum = phoneNum;
        this.sold = sold;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    @Override
    public String toString() {
        return "UpdateDto{" +
                "orderNum=" + orderNum +
                ", pw='" + pw + '\'' +
                ", pname='" + pname + '\'' +
                ", content='" + content + '\'' +
                ", price=" + price +
                ", phoneNum='" + phoneNum + '\'' +
                ", sold=" + sold +
                '}';
    }
}