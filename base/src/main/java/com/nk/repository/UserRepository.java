package com.nk.repository;

import com.nk.model.entity.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by JianHuangsh on 2017/12/8.
 */
@Repository
public interface UserRepository  extends JpaRepository<User,Long> {
     List<User> findByUsername(String userName);
}
