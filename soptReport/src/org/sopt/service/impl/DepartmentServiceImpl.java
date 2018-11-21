package org.sopt.service.impl;

import org.sopt.model.Department;
import org.sopt.model.builder.DepartmentBuilder;
import org.sopt.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {
    @Override
    public Department getByDepartName(String departName) {
        final DepartmentBuilder departmentBuilder = new DepartmentBuilder();
        final Department departN = departmentBuilder.build();
        return departN;
    }
}
