package org.sopt.model;

public class Department extends University{
    //학과 고유 번호l
    private long departIdx;
    //학과 이름
    private String departName;
    //학과 전화번호
    private long callNum;
    //학과 타입(공대, 자연대, 사범대, 치대)
    private String departType;

    public Department(){
        this.departIdx = 987;
        this.departName = "컴퓨터공학";
        this.callNum = 0234563764;
        this.departType = "공대";
    }

    public Department(final long departIdx, final String departName, final long callNum, final String departType){
        this.departIdx = departIdx;
        this.departName = departName;
        this.callNum = callNum;
        this.departType = departType;
    }


    public long getDepartIdx() {
        return departIdx;
    }

    public void setDepartIdx(final long departIdx) {
        this.departIdx = departIdx;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(final String departName) {
        this.departName = departName;
    }

    public long getCallNum() {
        return callNum;
    }

    public void setCallNum(final long callNum) {
        this.callNum = callNum;
    }

    public String getDepartType() {
        return departType;
    }

    public void setDepartType(final String departType) {
        this.departType = departType;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departIdx=" + departIdx +
                ", departName='" + departName + '\'' +
                ", callNum=" + callNum +
                ", departType='" + departType + '\'' +
                '}';
    }
}
