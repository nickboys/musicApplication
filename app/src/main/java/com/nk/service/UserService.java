package com.nk.service;

import com.nk.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by JianHuangsh on 2017/12/8.
 */
@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public void findUser() {
    userRepository.findAll();
  }
}
