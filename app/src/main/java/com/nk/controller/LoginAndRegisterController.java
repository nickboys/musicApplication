package com.nk.controller;

import com.nk.constant.UserConstant;
import com.nk.model.domain.Response;
import com.nk.model.entity.User;
import com.nk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by JianHuangsh on 2017/12/8.
 */
@RestController
@RequestMapping("/user")
public class LoginAndRegisterController {

  @Autowired
  UserService userService;

  @RequestMapping(value = "/login", method = RequestMethod.POST)
  public Response login(@RequestBody User user) throws Exception {
    Response response = Response.SUCCESS;
    boolean flag = userService.findByName(user.getUsername());
    if (flag) {
      response.setCode(UserConstant.SUCCESS_RESPONSE_CODE);
      return response;
    }
    response.setCode(UserConstant.ERROR_RESPONSE_CODE);
    return response;
  }

  @RequestMapping(value = "/register", method = RequestMethod.POST)
  public Response register() throws Exception {
    Response response = Response.SUCCESS;
    response.setData("");
    return response;
  }
}
