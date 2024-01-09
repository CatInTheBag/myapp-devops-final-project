package com.example.myappdevopsfinalproject.controller;

import com.example.myappdevopsfinalproject.service.MyAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Simple controller for final project.
 */
@RestController
@RequestMapping("api/v1/myapp")
public class MyAppController {

  private final MyAppService myAppService;

  @Autowired
  public MyAppController(MyAppService myAppService) {
    this.myAppService = myAppService;
  }

  @GetMapping("/get-data")
  public ResponseEntity<String> getData() {
    return ResponseEntity.ok(myAppService.getData());
  }
}
