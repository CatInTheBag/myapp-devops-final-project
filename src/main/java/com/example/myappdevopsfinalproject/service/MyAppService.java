/**
 * my app service for retrieving data
 */
package com.example.myappdevopsfinalproject.service;

import org.springframework.stereotype.Service;

/**
 * My app service.
 */
@Service
public final class MyAppService {

  /**
   * getData() method to return simple message
   */
  public String getData() {
    return "Hello from my app devops project final.";
  }
}
