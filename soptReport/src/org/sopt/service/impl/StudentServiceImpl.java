package org.sopt.service.impl;

import org.sopt.model.Student;
import org.sopt.model.builder.StudentBuilder;
import org.sopt.service.StudentService;

public class StudentServiceImpl implements StudentService {

    @Override
    public Student getByStudentNum(int studentNum) {
        final StudentBuilder studentBuilder = new StudentBuilder();
        final Student student = studentBuilder.build();

        return student;
    }
}
