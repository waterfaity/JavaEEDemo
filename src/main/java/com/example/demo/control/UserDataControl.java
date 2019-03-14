package com.example.demo.control;

import com.example.demo.UserBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class UserDataControl {
    @RequestMapping(value = "/hello")
    public UserBean hellWorld(String userName, int age, @RequestParam(value = "shortName", required = true) String shortName) {
        if (userName == null || userName.equals("")) {
            userName = shortName;
        }
        return new UserBean(userName, age);
    }
}
