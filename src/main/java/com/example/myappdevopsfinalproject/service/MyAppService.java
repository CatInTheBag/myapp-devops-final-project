package com.example.myappdevopsfinalproject.service;

import org.springframework.stereotype.Service;

/**
 * My app service
 */
@Service
public final class MyAppService {

  public String getData() {
    var someVariable = "test";
    return "Hello from my app devops project final.";
  }
}
