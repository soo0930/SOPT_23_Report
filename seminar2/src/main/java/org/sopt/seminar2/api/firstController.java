package org.sopt.seminar2.api;

import org.springframework.web.bind.annotation.*;

@RestController
public class firstController {

    @GetMapping("")
    public String hello(){
        return "hello world!";
    }

//    @RequestMapping(method = RequestMethod.GET, value = "")
//    public String hello2(){
//        return "Nice to meet you!";
//    }

    @GetMapping("1")
    public String hello2(){
        return "2nd Hello world!!";
    }

    @GetMapping("/get1")
    public String get1(){
        return "1";
    }

    @GetMapping("/get1/설수연")
    public String get2(){
        return "설수연";
    }





    //required=false 가 기본값
    //required = true 하면 {name}에 무조건 값이 있어야 함.
    @GetMapping("/name/{name}")
    public String getName(@PathVariable (value = "name", required = false) final String name){
        return name;
    }




    @GetMapping("/part")
    public String getPart(@RequestParam(value = "part", defaultValue = "") final String part){
        return part;
    }
    //defaultValue = "솝트" 쓰면 'http://127.0.0.1:8080/part?part=' 이렇게 요청하면 아까랑 다르게 솝트라고 뜸

    @GetMapping("/info")
    public String getPart2(
            @RequestParam(value = "name", defaultValue = "설") final String name,
            @RequestParam(value = "type", defaultValue = "yb") final String type ) {
        return name + "이고 " + type + "입니다.";
    }
    //http://127.0.0.1:8080/info?name=설수연 & type=yb

    @GetMapping("/num")
    public int number(@RequestParam(value = "num") final int[] num){
        int sum = 0;
        for(int i : num){
            sum += i;
        }
        return sum;
    }
}
