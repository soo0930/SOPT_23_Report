package org.sopt.model.builder;

import org.sopt.model.Student;

public class StudentBuilder {
    private int studentNum;
    private String studentName;
    private int grade;
    private String department;
    private  String studentEmail;
    private String studentAddress;
    private int studentAge;
    private String state;

    public StudentBuilder setStudentNum(final int studentNum) {
        this.studentNum = studentNum;
        return this;
    }

    public StudentBuilder setStudentName(final String studentName) {
        this.studentName = studentName;
        return this;
    }

    public StudentBuilder setGrade(final int grade) {
        this.grade = grade;
        return this;
    }

    public StudentBuilder setDepartment(final String department) {
        this.department = department;
        return this;
    }

    public StudentBuilder setStudentEmail(final String studentEmail) {
        this.studentEmail = studentEmail;
        return this;
    }

    public StudentBuilder setStudentAddress(final String studentAddress) {
        this.studentAddress = studentAddress;
        return this;
    }

    public StudentBuilder setStudentAge(final int studentAge) {
        this.studentAge = studentAge;
        return this;
    }

    public StudentBuilder setState(final String state) {
        this.state = state;
        return this;
    }

    public Student build(){
        return new Student(this.studentNum, this.studentName, this.grade, this.department, this.studentEmail, this.studentAddress,
                this.studentAge, this.state);
    }
}
