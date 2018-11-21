package org.sopt.model.builder;

import org.sopt.model.Department;

public class DepartmentBuilder {
    private long departIdx;
    private String departName;
    private long callNum;
    private String departType;

    public DepartmentBuilder setDepartIdx(final long departIdx) {
        this.departIdx = departIdx;
        return this;
    }

    public DepartmentBuilder setDepartName(final String departName) {
        this.departName = departName;
        return this;
    }

    public DepartmentBuilder setCallNum(final long callNum) {
        this.callNum = callNum;
        return this;
    }

    public DepartmentBuilder setDepartType(final String departType) {
        this.departType = departType;
        return this;
    }

    public Department build(){
        return new Department(this.departIdx, this.departName, this.callNum, this.departType);
    }

    @Override
    public String toString() {
        return "DepartmentBuilder{" +
                "departIdx=" + departIdx +
                ", departName='" + departName + '\'' +
                ", callNum=" + callNum +
                ", departType='" + departType + '\'' +
                '}';
    }
}
