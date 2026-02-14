package usedItem.model.dto;

public class ReadDto {
    private String pname;
    private int price;
    private String mname;
    private String orderdate;
    private boolean sold;
    private String phoneNum;


    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
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

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "ReadDto{" +
                "pname='" + pname + '\'' +
                ", price=" + price +
                ", mname='" + mname + '\'' +
                ", orderdate='" + orderdate + '\'' +
                ", sold=" + sold +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }

    public ReadDto(String pname, int price, String mname, String orderdate, boolean sold, String phoneNum) {
        this.pname = pname;
        this.price = price;
        this.mname = mname;
        this.orderdate = orderdate;
        this.sold = sold;
        this.phoneNum = phoneNum;
    }

}
