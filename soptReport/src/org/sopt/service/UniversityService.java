package org.sopt.service;

import org.sopt.model.University;

public interface UniversityService {
    //대학이름으로 조회
    University getByUnivName(final String getByUnivName);
}
