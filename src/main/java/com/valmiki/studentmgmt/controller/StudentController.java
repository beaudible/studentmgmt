package com.valmiki.studentmgmt.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
    @GetMapping
    ResponseEntity<String> hello() {
        String msg = "Suprabhat!";
        return ResponseEntity.ok(msg);
    }
}
