package org.sopt.service;

import org.sopt.model.Department;

public interface DepartmentService {
    //학과 이름으로 조회
    Department getByDepartName(final String departName);
}
