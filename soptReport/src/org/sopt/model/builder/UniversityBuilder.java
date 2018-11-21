package org.sopt.model.builder;

import org.sopt.model.University;

public class UniversityBuilder {
    private int univNum;
    private String univName;
    private long univPhone;
    private String univAddress;

    public UniversityBuilder setUnivNum(final int univNum) {
        this.univNum = univNum;
        return this;
    }

    public UniversityBuilder setUnivName(final String univName) {
        this.univName = univName;
        return this;
    }

    public UniversityBuilder setUnivPhone(final long univPhone) {
        this.univPhone = univPhone;
        return this;
    }

    public UniversityBuilder setUnivAddress(final String univAddress) {
        this.univAddress = univAddress;
        return this;
    }

    public University build(){
        return new University(this.univNum, this.univName, this.univPhone, this.univAddress);
    }

    @Override
    public String toString() {
        return "UniversityBuilder{" +
                "univNum=" + univNum +
                ", univName='" + univName + '\'' +
                ", univPhone=" + univPhone +
                ", univAddress='" + univAddress + '\'' +
                '}';
    }
}
