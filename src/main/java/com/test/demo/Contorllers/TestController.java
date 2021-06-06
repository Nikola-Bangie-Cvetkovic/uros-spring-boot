package com.test.demo.Contorllers;

import com.test.demo.Entity.TestEntity;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping(value = "/1")
    public String getOne1(@RequestBody TestEntity testEntity) {
        System.out.println(testEntity.getId());
        System.out.println(testEntity.getName());
        System.out.println(testEntity.isTest());
        return "ONE";
    }

    @GetMapping(value = "/2")
    public String getOne2() {
        return "TWO";
    }

    @PostMapping(value = "/2")
    public String postOne2() {
        return "POST TWO";
    }

}
