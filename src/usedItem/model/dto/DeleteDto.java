package usedItem.model.dto;

public class DeleteDto {
    private int orderNum;  // 어떤 글 삭제할지
    private String pw;     // 비밀번호 확인

    public DeleteDto(String pw, int orderNum) {
        this.pw = pw;
        this.orderNum = orderNum;
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

    @Override
    public String toString() {
        return "ProductDeleteDto{" +
                "orderNum=" + orderNum +
                ", pw='" + pw + '\'' +
                '}';
    }
}
