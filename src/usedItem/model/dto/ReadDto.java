package usedItem.model.dto;

public class ReadDto {
    private int mno;
    private String pname;
    private int price;
    private String mname;
    private String orderdate;
    private boolean sold;
    private String PhoneNum;

    public ReadDto(int mno, String pname, int price, String mname, String orderdate, boolean sold, String phoneNum) {
        this.mno = mno;
        this.pname = pname;
        this.price = price;
        this.mname = mname;
        this.orderdate = orderdate;
        this.sold = sold;
        PhoneNum = phoneNum;
    }

    public int getMno() {
        return mno;
    }

    public void setMno(int mno) {
        this.mno = mno;
    }

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
        return PhoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        PhoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "ReadDto{" +
                "mno=" + mno +
                ", pname='" + pname + '\'' +
                ", price=" + price +
                ", mname='" + mname + '\'' +
                ", orderdate='" + orderdate + '\'' +
                ", sold=" + sold +
                ", PhoneNum='" + PhoneNum + '\'' +
                '}';
    }
}

