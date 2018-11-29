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

    @GetMapping("/users")
    public String getUserList(
            @RequestParam(value = "name", defaultValue = "") final String name,
            @RequestParam(value = "part", defaultValue = "") final String part
    ){
        if(!name.equals("")){
            for(User u : userList){
                if(u.getName().equals(name)) return u.toString();
            }
            return "없습니다.";
        }else if(!part.equals("")){
            for(User u: userList){
                if(u.getPart().equals(part)) return u.toString();
            }
            return "없습니다.";
        }
        else{
            if(userList.isEmpty()) return "리스트가 비었습니다.";
            else{
                StringBuilder sb = new StringBuilder();
                for(User u: userList){
                    sb.append(u.toString()).append("/n");
                }
                return sb.toString();
            }
        }
    }
//    /*1번*/
//    @GetMapping("/users")
//    public List<User> ul(){
//        return userList;    //리스트가 비어 있으면 [] 으로 출력 됨.
//    }
//
//    @GetMapping("/users")
//    public String getUserList(
//            @RequestParam(value = "name", defaultValue = "") final String name,
//            @RequestParam(value = "part", defaultValue = "") final String part
//    ) {
//        if (!name.equals("")) {
//            for (User u : userList) {
//                if (u.getName().equals(name)) return u.toString();
//            }
//            return "없습니다.";
//        } else if (!part.equals("")) {
//            for (User u : userList) {
//                if (u.getPart().equals(part)) return u.toString();
//            }
//            return "없습니다.";
//        }else{
//            return
//        }
//    }

    //현재 리스트에서 회원 id값으로 회원 검색, 있으면 회원 데이터 반환 / 없으면 "없습니다" 반환
    ///users/{user_idx}
    @GetMapping("/users/{user_idx}")
    public String findById(@PathVariable (value = "user_idx", required = false) final int user_idx){
        for(User u: userList){
            if(u.getUser_idx() == user_idx)
                return "ID: " + u.getUser_idx() + " 이름: " + u.getName() + " 파트: " + u.getPart();
            //return u.toString();
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
    public String updateUser(@PathVariable(value = "user_idx", required = false) final int user_idx,
                             @RequestBody final User user){
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
    public String deleteUser(@PathVariable(value = "user_idx", required = false) final int user_idx){
        for(User u: userList){
            if(u.getUser_idx() == user_idx)
                userList.remove(u);
        }
        return "delete Success";
    }
}
