package org.sopt.model;

public class Professor extends Department {
    //교수고유번호
    private int professorIdx;
    //교수 이름
    private String professorName;
    //교수 학과
    private String department;
    //교수 전화번호
    private long professorPhone;
    //담당과목
    private String subject;

    public Professor(){
        this.professorIdx = 1234;
        this.professorName = "배다슬";
        this.department = "컴퓨터공학";
        this.professorPhone = 12341234;
        this.subject = "스프링";
    }

    public Professor(final int professorIdx, final String professorName,
                     final String department, final long professorPhone, final String subject ){
        super();
        this.professorIdx = professorIdx;
        this.professorName = professorName;
        this.department = department;
        this.professorPhone = professorPhone;
        this.subject = subject;
    }

    public Professor(int univNum, String univName, long univPhone, String univAddress, long departIdx, String departName, long callNum, String departType, int professorIdx, String professorName, String department, long professorPhone, String subject) {
        super(univNum, univName, univPhone, univAddress, departIdx, departName, callNum, departType);
        this.professorIdx = professorIdx;
        this.professorName = professorName;
        this.department = department;
        this.professorPhone = professorPhone;
        this.subject = subject;
    }

    public int getProfessorIdx() {
        return professorIdx;
    }

    public void setProfessorIdx(final int professorIdx) {
        this.professorIdx = professorIdx;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(final String professorName) {
        this.professorName = professorName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(final String department) {
        this.department = department;
    }

    public long getProfessorPhone() {
        return professorPhone;
    }

    public void setProfessorPhone(final long professorPhone) {
        this.professorPhone = professorPhone;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(final String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "professorIdx=" + professorIdx +
                ", professorName='" + professorName + '\'' +
                ", department='" + department + '\'' +
                ", professorPhone=" + professorPhone +
                ", subject='" + subject + '\'' +
                '}';
    }
}
