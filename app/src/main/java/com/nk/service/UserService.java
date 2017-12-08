package com.nk.service;

import com.nk.model.entity.User;
import com.nk.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by JianHuangsh on 2017/12/8.
 */
@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public List<User> findUser() {
    List<User> users= userRepository.findAll();
    return  users;
  }
}
