package usedItem.model.dto;

public class BoardDto {
    int orderNum;
    String mname;
    String pname;
    String content;
    int price;
    int pw;
    String orderdate;
    boolean sold;

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
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

    public int getPw() {
        return pw;
    }

    public void setPw(int pw) {
        this.pw = pw;
    }

    public String getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    @Override
    public String toString() {
        return "BoardDto{" +
                "orderNum=" + orderNum +
                ", mname='" + mname + '\'' +
                ", pname='" + pname + '\'' +
                ", content='" + content + '\'' +
                ", price=" + price +
                ", pw=" + pw +
                ", orderdate='" + orderdate + '\'' +
                ", sold=" + sold +
                '}';
    }
}