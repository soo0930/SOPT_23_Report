package org.sopt.model;

public class University {
    //대학고유번호
    private int univNum;
    //대학이름
    private String univName;
    //대학 전화번호
    private long univPhone;
    //대학 주소
    private String univAddress;

    public University(){
        this.univNum = 1;
        this.univName = "성신여자대학교";
        this.univPhone = 43213454;
        this.univAddress = "서울시 성북구 성신여대";
    }

    public University(final int univNum, final String univName, final long univPhone,
                      final String univAddress){
        this.univNum = univNum;
        this.univName = univName;
        this.univPhone = univPhone;
        this.univAddress = univAddress;
    }

    public int getUnivNum() {
        return univNum;
    }

    public void setUnivNum(final int univNum) {
        this.univNum = univNum;
    }

    public String getUnivName() {
        return univName;
    }

    public void setUnivName(final String univName) {
        this.univName = univName;
    }

    public long getUnivPhone() {
        return univPhone;
    }

    public void setUnivPhone(final long univPhone) {
        this.univPhone = univPhone;
    }

    public String getUnivAddress() {
        return univAddress;
    }

    public void setUnivAddress(final String univAddress) {
        this.univAddress = univAddress;
    }

    @Override
    public String toString() {
        return "University{" +
                "univNum=" + univNum +
                ", univName='" + univName + '\'' +
                ", univPhone=" + univPhone +
                ", univAddress='" + univAddress + '\'' +
                '}';
    }
}
