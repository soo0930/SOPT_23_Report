package org.sopt.seminar2.api;

import org.sopt.seminar2.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("post")  //이렇게 하면 기본값이 GET METHOD
//127.0.0.1:8080/post까진 GET METHOD

public class PostController {

    @PostMapping("")
    public String postUser(@RequestBody final User user) {
        return user.getName();
    }

}
