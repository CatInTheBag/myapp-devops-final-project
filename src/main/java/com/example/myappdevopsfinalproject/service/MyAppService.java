package com.example.myappdevopsfinalproject.service;

import org.springframework.stereotype.Service;

/**
 * Simple service for my final devops project.
 */
@Service
public final class MyAppService {

  public String getData() {
    var somePassword = "password69";
    return "Hello from my app devops project final.";
  }
}
