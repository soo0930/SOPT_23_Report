package org.sopt.sopt_report3.api;

import org.sopt.sopt_report3.model.User;
import org.sopt.sopt_report3.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@RestController
@RequestMapping("")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("")
    public Date date(){
        return date();
    }

    @GetMapping("/users")
    public ResponseEntity getUsers
            (@RequestParam(value = "name", defaultValue = "") final String name,
             @RequestParam(value = "part", defaultValue = "") final String part)
    {
        if(!name.equals("")){
            return new ResponseEntity(userService.findByUserName(name), HttpStatus.OK);
        }
        if(!part.equals("")){
            return new ResponseEntity(userService.findByPart(part), HttpStatus.OK);
        }
        return new ResponseEntity(userService.findAll(), HttpStatus.OK);

    }

    @GetMapping("/users/{userIdx}")
    public ResponseEntity byIdx(@PathVariable(value = "userIdx", required = false)final int userIdx)
    {
        return new ResponseEntity(userService.findByUserIdx(userIdx), HttpStatus.OK);
    }

    @PostMapping("/users")
    public ResponseEntity saveUser(@RequestBody final User user){
        return new ResponseEntity(userService.save(user), HttpStatus.OK);
    }

    @PutMapping("/users/{userIdx}")
    public ResponseEntity updateUser(@PathVariable(value = "userIdx", required = false)final int userIdx, @RequestBody User user)
    {
        return new ResponseEntity(userService.update(userIdx, user), HttpStatus.OK);
    }

    @DeleteMapping("/users/{userIdx}")
    public ResponseEntity deleteUser(@PathVariable(value = "userIdx", required = false)final int userIdx)
    {
        return new ResponseEntity(userService.deleteByUserIdx(userIdx), HttpStatus.OK);
    }

}
