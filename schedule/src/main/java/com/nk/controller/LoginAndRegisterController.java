package com.nk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by JianHuangsh on 2017/12/8.
 */
@RestController
public class LoginAndRegisterController {

  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  public String hello() {
    return "hello world";
  }
}
