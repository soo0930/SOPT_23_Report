package org.sopt.sopt_report3.service;

import org.sopt.sopt_report3.model.DefaultRes;
import org.sopt.sopt_report3.model.User;

import java.util.Date;
import java.util.List;

public interface UserService {
    //현재 시간 반환
    //DefaultRes <Date> date();
    //모든 회원 데이터 조회
    DefaultRes<List<User>> findAll();
    //이름으로 조회
    DefaultRes<User> findByUserName(final String name);
    //파트로 조회
    DefaultRes<User> findByPart(final String part);
    //userIdx으로 조회
    DefaultRes<User> findByUserIdx(final int userIdx);
    //회원저장
    DefaultRes save (final User user);
    //회원 정보 수정
    DefaultRes<User> update(final int userIdx, final User user);
    //회원 삭제
    DefaultRes deleteByUserIdx (final int userIdx);
}
