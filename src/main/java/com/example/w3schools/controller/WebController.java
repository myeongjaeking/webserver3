package com.example.w3schools.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/execute")
public class WebController {

    @PostMapping
    public ResponseEntity<String> executeCode(@RequestBody String code, @RequestParam int delay) throws InterruptedException {
        Thread.sleep(delay);
        return ResponseEntity.ok()
                .header("Content-Type", "text/html")
                .body(code);
    }
}
