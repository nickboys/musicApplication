package com.nk.controller;

import com.nk.constant.UserConstant;
import com.nk.model.domain.Response;
import com.nk.model.entity.User;
import com.nk.service.UserService;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
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

  @RequestMapping(value = "/login", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
  public Response login(HttpServletRequest request) throws Exception {
    Response response = Response.SUCCESS;
    boolean flag = userService.findByName(request.getParameter("username"));
    if (flag) {
      response.setCode(UserConstant.SUCCESS_RESPONSE_CODE);
      return response;
    }
    response.setCode(UserConstant.ERROR_RESPONSE_CODE);
    return response;
  }

  @RequestMapping(value = "/register", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
  public Response register(HttpServletRequest request) throws Exception {
    Response response = Response.SUCCESS;
    User user = new User();
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    user.setUsername(username);
    user.setPassword(password);
    user.setCreateDate(new Date());
    userService.createUser(user);
    response.setCode(UserConstant.SUCCESS_RESPONSE_CODE);
    return response;
  }
}
