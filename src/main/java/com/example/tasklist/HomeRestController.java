package com.example.tasklist;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HomeRestController {
    @RequestMapping("/resthello")

    /**
     * 以下にアクセスすると現在時刻が文字列として表示される
     * http://localhost:8080/resthello
     */
    String hello() {
        return "現在時刻は%sです。 ".formatted(LocalDateTime.now());
    }
}

