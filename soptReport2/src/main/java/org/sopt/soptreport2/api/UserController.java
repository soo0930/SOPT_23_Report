package org.sopt.soptreport2.api;

import org.sopt.soptreport2.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@RestController
public class UserController {

    private final static List<User> userList = new LinkedList<>();

    //return current time
    @GetMapping("/")
    public Date date(){
        return date();
    }

    //현재 리스트에 등록된 모든 회원 데이터 반환
    @GetMapping("/users")
    public List<User> all(){ return userList; }

    //현재 리스트에서 같은 이름의 회원이 있는지 검색, 있으면 회원 데이터 반환 없으면 "없습니다" 반환
    //users?name="이름"
    @GetMapping("/usersName")
    public String findByName(@RequestParam(value="name", defaultValue = "") final String name) {
        for(User u: userList){
            if(name == u.getName())
                return "ID: " + u.getUser_idx() + " 이름: " + u.getName() + " 파트: " + u.getPart();
        }
        return "없습니다.";
    }

    //현재 리스트에서 같은 파트의 회원이 있는지 검색, 있으면 "
    //users?part="파트"
    @GetMapping("/usersPart")
    public String findByPart(@RequestParam(value = "part", defaultValue = "") final String part){
        for(User u: userList){
            if(part == u.getPart())
                return "ID: " + u.getUser_idx() + " 이름: " + u.getName() + " 파트: " + u.getPart();
        }
        return "없습니다.";
    }

    //현재 리스트에서 회원 id값으로 회원 검색, 있으면 회원 데이터 반환 / 없으면 "없습니다" 반환
    ///users/{user_idx}
    @GetMapping("/users/{user_idx}")
    public String findById(@PathVariable (value = "user_idx", required = false) final int user_idx){
        for(User u: userList){
            if(u.getUser_idx() == user_idx)
                return "ID: " + u.getUser_idx() + " 이름: " + u.getName() + " 파트: " + u.getPart();
        }
        return "없습니다.";
    }

    //회원 저장
    @PostMapping("/users")
    public String saveUser(@RequestBody final User user) {
        userList.add(user);
        return user.getName() + ", " + user.getPart();
    }

    //회원 정보 수정
    @PutMapping("/users/{user_idx}")
    public String updateUser(@RequestBody int user_idx, User user){
        for(User u : userList){
            if(u.getUser_idx() == user_idx){
                userList.remove(u);
                userList.add(user);
            }
        }
        return user.getName() + ", " + user.getPart();
    }


    //회원 삭제
    @DeleteMapping("/users/{user_idx}")
    public String deleteUser(@RequestBody int user_idx){
        for(User u: userList){
            if(u.getUser_idx() == user_idx)
                userList.remove(u);
        }
        return "delete Success";
    }
}
