package org.sopt.model.builder;

import org.sopt.model.Professor;

public class ProfessorBuilder {
    private int professorIdx;
    private String professorName;
    private String department;
    private long professorPhone;
    private String subject;

    public ProfessorBuilder setProfessorIdx(final int professorIdx) {
        this.professorIdx = professorIdx;
        return this;
    }

    public ProfessorBuilder setProfessorName(final String professorName) {
        this.professorName = professorName;
        return this;
    }

    public ProfessorBuilder setDepartment(final String department) {
        this.department = department;
        return this;
    }

    public ProfessorBuilder setProfessorPhone(final long professorPhone) {
        this.professorPhone = professorPhone;
        return this;
    }

    public ProfessorBuilder setSubject(final String subject) {
        this.subject = subject;
        return this;
    }

    public Professor build(){
        return new Professor(this.professorIdx, this.professorName, this.department, this.professorPhone, this.subject);
    }
}
