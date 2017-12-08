package com.nk.controller;

import com.nk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by JianHuangsh on 2017/12/8.
 */
@RestController
public class LoginAndRegisterController {

  @Autowired
  private UserService userService;

  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  public String hello() throws Exception {
    //throw  new MyException("error");
    userService.findUser();
    return "hello world";
  }
}
