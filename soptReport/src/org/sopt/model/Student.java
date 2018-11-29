package org.sopt.model;

public class Student extends Department {
    //학번
    private int studentNum;
    //이름
    private String studentName;
    //학년
    private int grade;
    //학과
    private String department;
    //이메일
    private  String studentEmail;
    //주소
    private String studentAddress;
    //나이
    private int studentAge;
    //현재 상태(휴학, 재학, 군휴학, 취업계)
    private String state;

    public Student(){
        this.studentName = "설수연";
        this.studentNum = 20152855;
        this.grade = 4;
        this.department = "IT학부";
        this.studentEmail = "gkoala0930@naver.com";
        this.studentAddress = "서울시 강남구 역삼로";
        this.studentAge = 24;
        this.state = "재학";
    }

    //Constructor
    public Student(final int studentNum, final String studentName, final int grade, final String department,
                   final String studentEmail, final String studentAddress, final int studentAge, final String state){
        super();
        this.studentName = studentName;
        this.studentNum = studentNum;
        this.grade = grade;
        this.department = department;
        this.studentEmail = studentEmail;
        this.studentAddress = studentAddress;
        this.studentAge = studentAge;
        this.state = state;
    }

    public Student(int univNum, String univName, long univPhone, String univAddress, long departIdx, String departName, long callNum, String departType, int studentNum, String studentName, int grade, String department, String studentEmail, String studentAddress, int studentAge, String state) {
        super(univNum, univName, univPhone, univAddress, departIdx, departName, callNum, departType);
        this.studentNum = studentNum;
        this.studentName = studentName;
        this.grade = grade;
        this.department = department;
        this.studentEmail = studentEmail;
        this.studentAddress = studentAddress;
        this.studentAge = studentAge;
        this.state = state;
    }

    //Getter & Setter
    public long getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(final int studentNum) {
        this.studentNum = studentNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(final String studentName) {
        this.studentName = studentName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(final int grade) {
        this.grade = grade;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(final String department) {
        this.department = department;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(final String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(final String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(final int studentAge) {
        this.studentAge = studentAge;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    //toString
    @Override
    public String toString() {
        return "Student{" +
                "studentNum=" + studentNum +
                ", studentName='" + studentName + '\'' +
                ", grade=" + grade +
                ", department='" + department + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", studentAge=" + studentAge +
                ", state='" + state + '\'' +
                '}';
    }
}
