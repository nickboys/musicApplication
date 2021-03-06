package com.nk.model.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

/**
 * Created by JianHuangsh on 2017/12/8.
 */
@Entity
@Table(name = "t_user")
@DynamicUpdate
@Getter
@Setter
public class User {
  @Id
  private int id;
  @Column(name = "username")
  private String username;
  @Column(name = "password")
  private String password;
  @Column(name = "create_date")
  private Date createDate;
}
