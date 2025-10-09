package com.haipro.shop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Lỗi Vãi";
    }

    @GetMapping("/user")
    public String userpage() {
        return "Only User can access";
    }

    @GetMapping("/admin")
    public String adminpage() {
        return "Only Admin";
    }

}
