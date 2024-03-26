package xyz.fibbi.fibbi_backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @GetMapping("/")
    ResponseEntity<String> testGet(){
        return ResponseEntity.ok().body("Success!");
    }
}
