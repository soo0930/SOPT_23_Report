package org.sopt.sopt_report3.service.impl;

import org.sopt.sopt_report3.model.DefaultRes;
import org.sopt.sopt_report3.model.User;
import org.sopt.sopt_report3.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private static final List<User> userList = new LinkedList<>();

    @Override
    public DefaultRes<List<User>> findAll() {
        if(userList.isEmpty())
            return DefaultRes.res(HttpStatus.NOT_FOUND.value(), "리스트가 비어있습니다.");
        return DefaultRes.res(HttpStatus.OK.value(), "리스트 조회 성공",userList);
    }

    @Override
    public DefaultRes<User> findByUserName(String name) {
        for(User u: userList){
            if(u.getName().equals(name))
                return DefaultRes.res(HttpStatus.OK.value(),"이름으로 회원 조회 성공",u);
        }
        return DefaultRes.res(HttpStatus.NOT_FOUND.value(), "회원이 없습니다.");
    }

    @Override
    public DefaultRes<User> findByPart(String part) {
        for(User u: userList){
            if(u.getPart().equals(part))
                return DefaultRes.res(HttpStatus.OK.value(),"파트로 회원 조회 성공",u);
        }
        return DefaultRes.res(HttpStatus.NOT_FOUND.value(), "없습니다.");
    }

    @Override
    public DefaultRes<User> findByUserIdx(int userIdx) {
        for(User u: userList){
            if(u.getUserIdx() == (userIdx))
                return DefaultRes.res(HttpStatus.OK.value(),"userIdx로 회원 조회 성공",u);
        }
        return DefaultRes.res(HttpStatus.NOT_FOUND.value(), "없습니다.");
    }

    @Override
    public DefaultRes save(User user) {
        userList.add(user);
        return DefaultRes.res(HttpStatus.OK.value(), "회원추가", user);
    }

    @Override
    public DefaultRes<User> update(int userIdx, User user) {
        for (User u : userList) {
            if (u.getUserIdx() == userIdx) {
                userList.remove(u);
                userList.add(user);
                return DefaultRes.res(HttpStatus.OK.value(), "회원 정보 수정 성공",u);
            }
        }
        return DefaultRes.res(HttpStatus.NOT_FOUND.value(), "회원을 찾을 수 없습니다.");
    }

    @Override
    public DefaultRes deleteByUserIdx(int userIdx) {
        for (User u : userList) {
            if (u.getUserIdx() == userIdx) {
                userList.remove(u);
                return DefaultRes.res(HttpStatus.OK.value(), "회원 삭제 성공");
            }
        }
        return DefaultRes.res(HttpStatus.NOT_FOUND.value(), "회원을 찾을 수 없습니다.");
    }
}
