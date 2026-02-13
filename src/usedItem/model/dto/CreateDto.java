package usedItem.model.dto;

public class CreateDto {
        private String mname;
        private String pname;
        private String content;
        private int price;
        private String pw;
        private String phoneNum;

    public CreateDto(String mname, String pname, String content, int price, String pw, String phoneNum) {
        this.mname = mname;
        this.pname = pname;
        this.content = content;
        this.price = price;
        this.pw = pw;
        this.phoneNum = phoneNum;
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

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "CreateDto{" +
                "mname='" + mname + '\'' +
                ", pname='" + pname + '\'' +
                ", content='" + content + '\'' +
                ", price=" + price +
                ", pw='" + pw + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}

